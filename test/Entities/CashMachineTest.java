/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas
 */
public class CashMachineTest {
    
    @Test
    public void testWithdrawMoney() {
        CashMachine cashMachine = new CashMachine(1, 2, 3, 4);
        cashMachine.withdrawMoney(100);
        assertEquals(0, cashMachine.moneyNotes100);
        assertEquals(2, cashMachine.moneyNotes50);
        assertEquals(3, cashMachine.moneyNotes20);
        assertEquals(4, cashMachine.moneyNotes10);
        
        cashMachine.withdrawMoney(30);
        assertEquals(0, cashMachine.moneyNotes100);
        assertEquals(2, cashMachine.moneyNotes50);
        assertEquals(2, cashMachine.moneyNotes20);
        assertEquals(3, cashMachine.moneyNotes10);
        
        cashMachine.withdrawMoney(50);
        assertEquals(0, cashMachine.moneyNotes100);
        assertEquals(1, cashMachine.moneyNotes50);
        assertEquals(2, cashMachine.moneyNotes20);
        assertEquals(3, cashMachine.moneyNotes10);
    }
    
    @Test (expected = RuntimeException.class)
    public void testFailWithdrawMoneyAboveAllowable() 
    {
        CashMachine cashMachine = new CashMachine(1, 0, 0, 0);
        cashMachine.withdrawMoney(101);
    }
    
    @Test (expected = RuntimeException.class)
    public void testFailWithdrawCashInsufficientNotes()
    {
        CashMachine cashMachine = new CashMachine(1, 0, 0, 0);
        cashMachine.withdrawMoney(50);
    }
}
