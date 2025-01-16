import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


import java.util.List;


public class TestCat {


    @Test
    public void testGetSound() {
        Cat cat = new Cat(Mockito.mock(Feline.class));
        Assert.assertEquals("Мяу", cat.getSound());
    }


    @Test
    public void testGetFood() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы"));
        Cat cat = new Cat(felineMock);
        List<String> food = cat.getFood();
        Assert.assertTrue(food.contains("Животные"));
    }
}


