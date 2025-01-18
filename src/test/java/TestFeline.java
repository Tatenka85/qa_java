import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class TestFeline {

    private Feline feline; // Объект, который будет использоваться в тестах

    @Before
    public void setUp() {
        feline = new Feline(); // Инициализация объекта перед каждым тестом
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> food = feline.eatMeat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба"); // Инициализация expectedFood
        assertEquals(expectedFood, food); // Проверка полного списка
    }

    @Test
    public void testGetKittens() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithParameter() {
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }
}
