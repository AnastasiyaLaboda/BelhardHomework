public class Fish extends Creature {

    public Fish(TypesCreatures type, String name) {
        super(String.valueOf(type), name);
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
