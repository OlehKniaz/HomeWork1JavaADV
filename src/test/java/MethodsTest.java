import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MethodsTest {
    private Methods methods;

    @BeforeEach
    public void init() {
        methods = new Methods();
    }
    @Test
    @DisplayName("ShooudCheckAge")
    public void FullAgeTest() throws Exeptions {
    int age = 20;
    String actual = methods.FullAge(age);
    String expectet = "U ar Welcome";
        Assertions.assertEquals(expectet,actual);
    }

}
