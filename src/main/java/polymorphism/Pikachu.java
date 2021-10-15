package polymorphism;

public class Pikachu extends Pet{

    public Pikachu(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Pika Pika";
    }
}
