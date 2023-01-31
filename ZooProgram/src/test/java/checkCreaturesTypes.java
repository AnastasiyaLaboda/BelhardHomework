import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class checkCreaturesTypes {

    @BeforeAll
    public static void startTest() {
        System.out.println("Start");
    }

    @Test
    public void checkAnimalType() {
        Animal animal = new Animal("Some animal");
        Assertions.assertEquals(TypesCreatures.ANIMAL.toString(), animal.getType());
    }

    @Test
    public void checkBirdType() {
        Bird bird = new Bird("Some bird");
        Assertions.assertEquals(TypesCreatures.BIRD.toString(), bird.getType());
    }

    @Test
    public void checkFishType() {
        Fish fish = new Fish("Some fish");
        Assertions.assertEquals(TypesCreatures.FISH.toString(), fish.getType());
    }

    @AfterAll
    public static void finishTest() {
        System.out.println("Finish");
    }

}
