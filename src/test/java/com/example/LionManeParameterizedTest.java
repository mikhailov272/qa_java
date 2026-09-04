package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class LionManeParameterizedTest {
    private final String sex;
    private final boolean expectedHasMane;

    public LionManeParameterizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters(name = "Пол: {0}, есть грива: {1}")
    public static Object[][] getParameters() {
        return new Object[][]{{"Самец", true}, {"Самка", false}};
    }

    @Test
    public void doesHaveManeReturnsValueDependingOnSex() throws Exception {
        Lion lion = new Lion(sex, mock(Feline.class));
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
