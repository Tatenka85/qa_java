import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)  // Инициализация моков с помощью аннотаций
public class TestCat {

    @Mock
    private Feline felineMock; // Мок объекта Feline

    @Test
    public void testGetSound() {
        Cat cat = new Cat(felineMock);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы"));
        Cat cat = new Cat(felineMock);
        List<String> food = cat.getFood();
        Assert.assertTrue(food.contains("Животные"));
    }
}
