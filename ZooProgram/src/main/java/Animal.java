import java.util.Scanner;

public class Animal extends Creature {

    public Animal(String name) {
        super(String.valueOf(TypesCreatures.ANIMAL), name);
    }

    @Override
    void breathe() {
        System.out.print(this.name + " breathes through the nose.\n");
    }

    @Override
    void move() {
        System.out.print(this.name + " can run and jump.\n");
    }

    public void uniqueProperty() {
        System.out.println("Write the unique property: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.name + " " + scanner.nextLine());
    }


}
