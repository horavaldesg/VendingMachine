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
);
        }
        
    }
}
