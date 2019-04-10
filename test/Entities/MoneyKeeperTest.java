
package Entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas
 */
public class MoneyKeeperTest {
   
    @Test
    public void testGetTotalMoney() {
        MoneyKeeper moneyKeeper = new MoneyKeeper();
        moneyKeeper.addNote(20);
        moneyKeeper.addNote(100);
        assertEquals(120, moneyKeeper.getTotalMoney());
    }

    @Test
    public void testAddNoteAndGetNote() {
        MoneyKeeper moneyKeeper = new MoneyKeeper();
        moneyKeeper.addNote(10);
        moneyKeeper.addNote(20);
        moneyKeeper.addNote(50);
        moneyKeeper.addNote(100);
        
        assertEquals(1, moneyKeeper.getMoneyNotes10());
        assertEquals(1, moneyKeeper.getMoneyNotes20());
        assertEquals(1, moneyKeeper.getMoneyNotes50());
        assertEquals(1, moneyKeeper.getMoneyNotes100());
        
        moneyKeeper.addNote(20);
        moneyKeeper.addNote(20);
        assertEquals(3, moneyKeeper.getMoneyNotes20());
    }
    
    @Test (expected = RuntimeException.class)
    public void testFailAddNote() 
    {
        MoneyKeeper moneyKeeper = new MoneyKeeper();
        moneyKeeper.addNote(30);
    }
//
//    /**
//     * Test of getMoneyNotes100 method, of class MoneyKeeper.
//     */
//    @Test
//    public void testGetMoneyNotes100() {
//        System.out.println("getMoneyNotes100");
//        MoneyKeeper instance = new MoneyKeeper();
//        int expResult = 0;
//        int result = instance.getMoneyNotes100();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMoneyNotes50 method, of class MoneyKeeper.
//     */
//    @Test
//    public void testGetMoneyNotes50() {
//        System.out.println("getMoneyNotes50");
//        MoneyKeeper instance = new MoneyKeeper();
//        int expResult = 0;
//        int result = instance.getMoneyNotes50();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMoneyNotes20 method, of class MoneyKeeper.
//     */
//    @Test
//    public void testGetMoneyNotes20() {
//        System.out.println("getMoneyNotes20");
//        MoneyKeeper instance = new MoneyKeeper();
//        int expResult = 0;
//        int result = instance.getMoneyNotes20();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMoneyNotes10 method, of class MoneyKeeper.
//     */
//    @Test
//    public void testGetMoneyNotes10() {
//        System.out.println("getMoneyNotes10");
//        MoneyKeeper instance = new MoneyKeeper();
//        int expResult = 0;
//        int result = instance.getMoneyNotes10();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
