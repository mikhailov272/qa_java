package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;
    private Lion lion;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void getKittensReturnsValueFromFeline() {
        when(feline.getKittens()).thenReturn(2);
        assertEquals(2, lion.getKittens());
        verify(feline).getKittens();
    }

    @Test
    public void getFoodReturnsValueFromFeline() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, lion.getFood());
        verify(feline).getFood("Хищник");
    }

    @Test
    public void constructorThrowsExceptionForUnknownSex() {
        Exception exception = assertThrows(Exception.class,
                () -> new Lion("Неизвестный пол", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка",
                exception.getMessage());
    }
}
