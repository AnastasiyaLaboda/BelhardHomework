public class Bird extends Creature {

    public Bird(TypesCreatures type, String name) {
        super(String.valueOf(type), name);
    }

    @Override
    void breathe() {
        System.out.print(this.name + " breathes through its beak.\n");
    }

    @Override
    void move() {
        System.out.print(this.name + " is flying.\n");
    }
}
