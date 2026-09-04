package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void getFamilyReturnsKnownAnimalFamilies() {
        assertEquals(
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily()
        );
    }

    @Test(expected = Exception.class)
    public void getFoodThrowsExceptionForUnknownAnimalKind() throws Exception {
        animal.getFood("Неизвестный вид");
    }
}
