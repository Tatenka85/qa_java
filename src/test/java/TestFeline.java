import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.*;


import java.util.List;


public class TestFeline {


    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("Животные"));
    }


    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }


    @Test
    public void testGetKittensWithParameter() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }


    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}


