public class Fish extends Creature {

    public Fish(String name) {
        super(String.valueOf(TypesCreatures.FISH), name);
    }

    @Override
    void breathe() {
        System.out.print("Fish breathe with their gills.\n");
    }

    @Override
    void move() {
        System.out.print("Fish swim under water.\n");
    }
}
