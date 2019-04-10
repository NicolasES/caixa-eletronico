package Entities;

/**
 *
 * @author Nicolas
 */
public class CashMachine extends MoneyKeeper
{
 
    public CashMachine (
        int moneyNotes100, 
        int moneyNotes50,
        int moneyNotes20,
        int moneyNotes10
    )
    {
        this.moneyNotes100 = moneyNotes100;
        this.moneyNotes50 = moneyNotes50;
        this.moneyNotes20 = moneyNotes20;
        this.moneyNotes10 = moneyNotes10;
    }
    
    public MoneyKeeper withdrawMoney(int value)
    {
        if (value > this.getTotalMoney()) {
            throw new RuntimeException("O valor no caixa eletrônico é insuficente para este saque.");
        }
        
        MoneyKeeper amountMoney = new MoneyKeeper();
        this.processValue(amountMoney, value);
        
        return amountMoney;
    }
    
    private void processValue(MoneyKeeper amountMoney, int value) 
    {
        while (value > 0) {
            if (value >= 100 && this.moneyNotes100 > 0) {
                amountMoney.addNote(100);
                this.moneyNotes100--;
                value -= 100;
                continue;
            }
            if (value >= 50 && this.moneyNotes50 > 0) {
                amountMoney.addNote(50);
                this.moneyNotes50--;
                value -= 50;
                continue;
            }
            if (value >= 20 && this.moneyNotes20  > 0) {
                amountMoney.addNote(20);
                this.moneyNotes20--;
                value -= 20;
                continue;
            }
            if (value >= 10 && this.moneyNotes10  > 0) {
                amountMoney.addNote(10);
                this.moneyNotes10--;
                value -= 10;
                continue;
            }
            
            throw new RuntimeException("Não é possivel efetuar saques nesse valor devido a quantidade de notas no caixa eletrônico.");
        }
    }
}


