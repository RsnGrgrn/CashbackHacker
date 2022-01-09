package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();


    @Test
    public void shouldTestRemainZero() {
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainMean() {
        int amount = 1500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainAboveBoundary() {
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainBelowBoundary() {
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainZeroAmount() {
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainBelowZero() {
        int amount = -200;
        int actual = cashbackHackService.remain(amount);
        int expected = 1200;

        assertEquals(actual, expected);
    }

}