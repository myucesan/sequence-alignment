
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MainTest {

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void example() {
        String a = "kitten";
        String b = "sitting";
        Assertions.assertEquals(3, Main.solve(a, b));
    }
}
