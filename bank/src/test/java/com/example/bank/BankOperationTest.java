package com.example.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BankOperationTest {

    @Test
    public void InitialBalanceIsZeroTest(){
        BankOperation customer = new BankOperation();
        assertEquals(0,customer.getBalance(),"Initial balance is not ZERO");
    }

    @Test
    public void whenMakingDepositBalanceIncreasesByThatAmount(){
        BankOperation customer = new BankOperation();
        customer.deposit(1000);
        assertEquals(1000,customer.getBalance(),"Account Balance is not Correct");
    }
}
