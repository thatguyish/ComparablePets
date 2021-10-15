package polymorphism;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("how many pets do you have?");
        Scanner scanner = new Scanner(System.in);
        Integer numberOfPets = Integer.valueOf(scanner.nextLine());
        ArrayList<Pet> pets = new ArrayList<>();
        for (int i = 1; i<=numberOfPets;i++){
            System.out.println(String.format("what kind of pet is pet number %d?",i));
            String userInput = scanner.nextLine();
            if (userInput.toLowerCase().contains("cat")){
                System.out.println("whats your cat's name?");
                String petName = scanner.nextLine();
                Cat cat = new Cat(petName);
                pets.add(cat);
            }else if(userInput.toLowerCase().contains("dog")){
                System.out.println("whats your dogs's name?");
                String petName = scanner.nextLine();
                Dog dog = new Dog(petName);
                pets.add(dog);
            }else if(userInput.toLowerCase().contains("pikachu")){
                System.out.println("whats your pikachu's name?");
                String petName = scanner.nextLine();
                Pikachu pikachu = new Pikachu(petName);
                pets.add(pikachu);
            }else{
                System.out.println("Pet not Supported yet");
            }
        }
        Collections.sort(pets);
        for(Pet pet : pets){
            System.out.println(String.format("%s says %s",pet.getName(),pet.speak()));
        }

        Collections.sort(pets,Pet.nameOrder);
        for(Pet pet : pets){
            System.out.println(String.format("%s says %s",pet.getName(),pet.speak()));
        }


    }
}
