// import java.util.Scanner;
public class VendingMachine {
    public static void main (String[] args){
        String[] snacks = {"Chips", "Soda", "Candy", "Pretzel", "Skittles"};
        float[] price = {1.00f, 1.25f, .50f, 1.50f, .75f};

        System.out.print("Welcome! The Snacks available are: ");
        for(int i = 0; i < snacks.length; i++){
            System.out.print(i + 1 + ") " + snacks[i] + " ");
        }

        
    }
}
