import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class testExamples {

    @Test
    public void shouldThrowException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            throw new ArithmeticException("You caught an ArithmeticException");
        });
        assertEquals(exception.getMessage(), "You caught an ArithmeticException");
    }

    @Test
    public void failingTest() {
        int a = 2, b = 3;
        if (a > b) {
            fail();
        }
    }

}
