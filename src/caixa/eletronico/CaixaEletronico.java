package caixa.eletronico;

import Entities.CashMachine;
import Entities.MoneyKeeper;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class CaixaEletronico 
{

    public static void main(String[] args) 
    {
        CashMachine cm = new CashMachine(3, 4, 5, 16);
        boolean run = true;
        
        
        do {
            
            System.out.println("Quantidade de notas no caixa eletrônico:");
            System.out.print("R$100: "+ cm.getMoneyNotes100() +" - ");
            System.out.print("R$50: "+ cm.getMoneyNotes50() +" - ");
            System.out.print("R$20: "+ cm.getMoneyNotes20() +" - ");
            System.out.print("R$10: "+ cm.getMoneyNotes10() +" \n");


            System.out.print("Valor do saque (digite 0 para encerrar): ");

            try {
                Scanner scanner = new Scanner(System.in);
                int value = scanner.nextInt();
                
                if (value <= 0) {
                    run = false; continue;
                }

                MoneyKeeper am = cm.withdrawMoney(value);

                System.out.println("Notas entregues:");
                System.out.println("R$100: "+ am.getMoneyNotes100());
                System.out.println("R$50: "+ am.getMoneyNotes50());
                System.out.println("R$20: "+ am.getMoneyNotes20());
                System.out.println("R$10: "+ am.getMoneyNotes10());
                
                System.out.print("--------------------------------------\n\n");
            }catch (InputMismatchException e) {
                System.out.println("\nErro: Valor inválido \n");
                System.out.print("--------------------------------------\n\n");
            } catch (RuntimeException e) {
                System.out.println("\nErro: " + e.getMessage() + "\n");
                System.out.print("--------------------------------------\n\n");
            }
            
        } while (run);
    }
    
}
