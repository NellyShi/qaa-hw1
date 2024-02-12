package ru.netology;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected  = 100;
        int actual = cashbackHackService.remain(900);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        Assert.assertEquals(expected, actual);
    }
}