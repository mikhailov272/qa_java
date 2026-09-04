package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
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
    }

    @Test
    public void getFoodReturnsValueFromFeline() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);

        assertEquals(expectedFood, lion.getFood());
    }

    @Test(expected = Exception.class)
    public void constructorThrowsExceptionForUnknownSex() throws Exception {
        new Lion("Неизвестный пол", feline);
    }
}
