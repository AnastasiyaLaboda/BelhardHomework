import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ZooProgram {
    public static void main(String[] args) {

        Animal lion = new Animal("Lion");
        lion.breathe();
        lion.move();
        lion.uniqueProperty();
        System.out.println();

//Пользователь должен получить пронумерованный список всех животных.
//По вводу номера животного с клавиатуры для него вводится информация
//Название животного, как оно дышит как передвигается

        LinkedList<Creature> zooList = new LinkedList<>();
        zooList.add(lion);


        zooList.add(new Animal("Leopard"));
        zooList.add(new Animal("Monkey"));

        zooList.add(new Fish("salmon"));
        zooList.add(new Fish("shark"));

        zooList.add(new Bird("parrot"));
        zooList.add(new Bird("owl"));


/*        for (Creature creature : zooList) {
            System.out.println(creature);
            creature.printInfo();
            System.out.println();
        }*/

        addAnimalsToList(zooList, -1);
        printCreature(zooList);

    }

    public static void printCreature(LinkedList list) {
        int number;
        do {
            System.out.println("\nWrite the number of the creature to print it's info.\nWrite '0' - to exit.");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            try {
                System.out.println(list.get(number - 1));
                if (list.get(number - 1) instanceof Creature) {
                    ((Creature) list.get(number - 1)).printInfo();
                }

            } catch (IndexOutOfBoundsException ex) {
                if (number != 0) {
                    System.out.println("There is no such number in the zoo! Try again.");
                } else {
                    System.out.println();
                }
            }
        }
        while (number != 0);
    }


    public static LinkedList addAnimalsToList(LinkedList list, int amountAnimals) {
        for (int i = 0; i < amountAnimals; i++) {
            list.add(new Animal("animal" + (i + 1)));
        }
        return list;
    }


}
