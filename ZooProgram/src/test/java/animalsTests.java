import org.junit.jupiter.api.*;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class animalsTests {

    @Test
    @Order(1)
    public void checkAnimalsName() {
        LinkedList<Animal> list = new LinkedList<>();
        ZooProgram.addAnimalsToList(list, 7);
        for (Animal animal : list) {
            assertNotNull(animal.name);
        }
    }

    @Test
    @Order(2)
    public void checkNumberAddAnimalsToList() {
        LinkedList<Animal> list = new LinkedList<>();
        ZooProgram.addAnimalsToList(list, 5);
        assertEquals(list.size(), 5, "The method adds the wrong number of animals.");
    }

    @Test
    @Order(3)
    public void checkAddAnimalsToList() {
        LinkedList<Animal> list = new LinkedList<>();
        ZooProgram.addAnimalsToList(list, 10);
        for (Animal animal : list) {
            assertSame(animal.getClass(), Animal.class);
        }
    }


}
