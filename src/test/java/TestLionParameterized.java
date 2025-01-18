import com.example.Feline;
import com.example.Lion;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class TestLionParameterized {


    private final String sex;
    private final List<String> expectedFood;


    public TestLionParameterized(String sex, List<String> expectedFood) {
        this.sex = sex;
        this.expectedFood = expectedFood;
    }


    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Самец", List.of("Животные", "Птицы", "Рыба") },
                { "Самка", List.of("Животные", "Птицы", "Рыба") }
        });
    }


    @Test
    public void testLionGetFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedFood, lion.getFood());
    }
}


