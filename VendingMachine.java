 import java.util.Scanner;
public class VendingMachine {
    public static void main (String[] args){
        String[] snacks = {"Chips", "Soda", "Candy", "Pretzel", "Skittles"};
        float[] price = {1.00f, 1.25f, .50f, 1.50f, .75f};
        Scanner kb = new Scanner(System.in);

        System.out.print("Welcome! The Snacks available are: ");
        for(int i = 0; i < snacks.length; i++){
            System.out.print(i + 1 + ") " + snacks[i] + " ");
        }
        
        int choice = 0;
       System.out.println("");
       System.out.print("> ");

        choice = kb.nextInt();
        switch (choice)
        {
            case 1: System.out.println("User Selected: " + snacks[choice - 1] + " Price: " + price[choice - 1]);
            break;
            case 2: System.out.println("User Selected: " + snacks[choice - 1] + " Price: " + price[choice - 1]);
            break;
            case 3: System.out.println("User Selected: " + snacks[choice - 1] + " Price: " + price[choice - 1]);
            break;
            case 4: System.out.println("User Selected: " + snacks[choice - 1] + " Price: " + price[choice - 1]);
            break;
            case 5: System.out.println("User Selected: " + snacks[choice - 1] + " Price: " + price[choice - 1]);
            break;
            default: System.out.println("Not an Option");
            break;

        }

        float moneyBalance = 0;
        int moneyInserted = 0;
        
        Boolean doneInsteringMoney = false;
        while(doneInsteringMoney == false){
            
            System.out.println("How much money would you like to insert? (Only One Dollar Bills Accepted)");
            System.out.print("> ");
            moneyInserted = kb.nextInt();
            if(moneyInserted != 1){
                System.out.println("Only One Dollar Bills Accepted!");
                doneInsteringMoney = false;
            }
            else if(moneyInserted == 1){
               
            moneyBalance += moneyInserted;
       
            System.out.println("Money Available: " + moneyBalance);
            System.out.println("Would you like to stop inserting money? If YES press 1 if NO Press 2");
            System.out.print("> ");
            int userOption = kb.nextInt();
                if(userOption == 1){
                    doneInsteringMoney = true;
                }
                else if(userOption == 2){
                    doneInsteringMoney = false;
                }
            }
            if(moneyBalance > price[choice - 1])
            {
            	float change = 0;
            	change = moneyBalance - price[choice - 1];
            	System.out.println("Your Change is : " + change);
            	
            }
           
        }
        
    }
}
