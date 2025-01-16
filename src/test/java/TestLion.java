import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import java.util.List;


public class TestLion {


    @Test
    public void testGetKittens() throws Exception {
        Feline felineMock = mock(Feline.class);
        when(felineMock.getKittens()).thenReturn(3);
        Lion lion = new Lion(felineMock, "Самец");
        assertEquals(3, lion.getKittens());
    }


    @Test
    public void testDoesHaveManeMale() throws Exception {
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion(felineMock, "Самец");
        assertTrue(lion.doesHaveMane());
    }


    @Test
    public void testDoesHaveManeFemale() throws Exception {
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion(felineMock, "Самка");
        assertFalse(lion.doesHaveMane());
    }


    @Test(expected = Exception.class)
    public void testLionConstructorInvalidSex() throws Exception {
        Feline felineMock = mock(Feline.class);
        new Lion(felineMock, "Неизвестный");
    }


    @Test
    public void testGetFood() throws Exception {
        Feline felineMock = mock(Feline.class);
        when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы"));
        Lion lion = new Lion(felineMock, "Самец");
        List<String> food = lion.getFood();
        assertTrue(food.contains("Животные"));
    }
}


