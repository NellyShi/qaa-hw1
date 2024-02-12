package ru.netology;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 100;
        int expected = cashbackHackService.remain(900);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = 0;
        int expected = cashbackHackService.remain(1000);
        Assert.assertEquals(actual, expected);
    }
}