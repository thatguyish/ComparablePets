package polymorphism;


import java.util.Comparator;

public abstract class Pet implements Comparable<Pet>{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Comparator<Pet> nameOrder = new Comparator<>() {
        @Override
        public int compare(Pet pet, Pet t1) {
            int classResult = pet.getClass().getSimpleName().charAt(0)-t1.getClass().getSimpleName().charAt(0);

            if(classResult==0){
                return pet.getName().charAt(0)-t1.getName().charAt(0);
            }
            else {
                return classResult;
            }
        }
    };

    public Pet(String name){
        this.name=name;
    }


    public abstract String speak();

    @Override
    public int compareTo(Pet pet){
        int charResult = this.name.charAt(0)-pet.name.charAt(0);

        if(charResult==0){
            return this.getClass().getSimpleName().charAt(0)-pet.getClass().getSimpleName().charAt(0);
        }
        else{
            return charResult;
        }
    }
}
