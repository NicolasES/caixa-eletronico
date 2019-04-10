package Entities;

/**
 *
 * @author Nicolas
 */
public class MoneyKeeper 
{
    protected int moneyNotes100 = 0;
    protected int moneyNotes50 = 0;
    protected int moneyNotes20 = 0;
    protected int moneyNotes10 = 0;
    
    public int getTotalMoney()
    {
        return  (this.moneyNotes100 * 100) + 
                (this.moneyNotes50 * 50) +
                (this.moneyNotes20 * 20) +
                (this.moneyNotes10 * 10);
    }
    
    public void addNote(int value) {
        switch (value) {
            case 100: this.moneyNotes100++; break;
            case 50: this.moneyNotes50++; break;
            case 20: this.moneyNotes20++; break;
            case 10: this.moneyNotes10++; break;
            default: throw new RuntimeException("O de nota inválido inválido.");
        }
    }
    
    public int getMoneyNotes100()
    {
        return this.moneyNotes100;
    }
    
    public int getMoneyNotes50()
    {
        return this.moneyNotes50;
    }
    
    public int getMoneyNotes20()
    {
        return this.moneyNotes20;
    }
    
    public int getMoneyNotes10()
    {
        return this.moneyNotes10;
    }
}
