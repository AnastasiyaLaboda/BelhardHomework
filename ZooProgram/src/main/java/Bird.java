public class Bird extends Creature {

    public Bird(String name) {
        super(String.valueOf(TypesCreatures.BIRD), name);
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
