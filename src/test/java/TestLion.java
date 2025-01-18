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
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(3, lion.getKittens());
    }


    @Test
    public void testDoesHaveManeMale() throws Exception {
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion("Самец", felineMock);
        assertTrue(lion.doesHaveMane());
    }


    @Test
    public void testDoesHaveManeFemale() throws Exception {
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion("Самка", felineMock);
        assertFalse(lion.doesHaveMane());
    }


    @Test(expected = Exception.class)
    public void testLionConstructorInvalidSex() throws Exception {
        Feline felineMock = mock(Feline.class);
        new Lion("Неизвестный", felineMock);
    }


    @Test
    public void testGetFood() throws Exception {
        Feline felineMock = mock(Feline.class);
        when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы"));
        Lion lion = new Lion("Самец", felineMock);
        List<String> food = lion.getFood();
        List<String> expectedFood = List.of("Животные", "Птицы"); // Инициализация expectedFood
        assertEquals(expectedFood, food); // Проверка полного списка
    }
}


