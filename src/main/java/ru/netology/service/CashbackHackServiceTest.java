package ru.netology.service;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

    public class CashbackHackServiceTest {

        CashbackHackService cashbackHackService = new CashbackHackService();

        @Test
        public void shouldCalculateRemainWithZeroAmount() {
            int amount = 0;

            int actual = cashbackHackService.remain(amount);
            int expected = 1000;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void shouldCalculateRemainWithAmountUnderBoundary() {
            int amount = 999;

            int actual = cashbackHackService.remain(amount);
            int expected = 1;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void shouldCalculateRemainWithAmountOverBoundary() {
            int amount = 1001;

            int actual = cashbackHackService.remain(amount);
            int expected = 999;

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void shouldCalculateRemainWithAmountEqualsBoundary() {
            int amount = 10000;

            int actual = cashbackHackService.remain(amount);
            int expected = 0;

            Assert.assertEquals(actual, expected);
        }
    }
