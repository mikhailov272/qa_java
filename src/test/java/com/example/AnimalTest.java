package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void getFamilyReturnsKnownAnimalFamilies() {
        assertEquals(
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily()
        );
    }

    @Test
    public void getFoodThrowsExceptionForUnknownAnimalKind() {
        Exception exception = assertThrows(
                Exception.class,
                () -> animal.getFood("Неизвестный вид")
        );

        assertEquals(
                "Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage()
        );
    }
}
