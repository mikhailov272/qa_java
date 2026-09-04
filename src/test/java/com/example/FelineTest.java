package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    private final Feline feline = new Feline();

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutArgumentReturnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithArgumentReturnsSpecifiedCount() {
        assertEquals(5, feline.getKittens(5));
    }
}
