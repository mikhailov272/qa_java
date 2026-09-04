package com.example;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class LionAlexTest {
    private LionAlex alex;

    @Before
    public void setUp() throws Exception {
        alex = new LionAlex(mock(Feline.class));
    }

    @Test
    public void getFriendsReturnsAlexFriends() {
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsNewYorkZoo() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensReturnsZero() {
        assertEquals(0, alex.getKittens());
    }
}
