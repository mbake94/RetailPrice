/*
set rate to 2.50
set cost to retail * rate
prompt user to imput retain cost
multiply input by rate
print cost
 */
import java.util.Scanner;

public class RetailPrice {
    public static void main(String[] args) {
        String cont;
        double cost, retail, rate;
        rate = 2.50;
        cont = "quit";
        do {
        System.out.printf("Enter retail cost: ");
        Scanner keybd = new Scanner(System.in);
        retail = keybd.nextDouble();
        cost = retail * rate;
        System.out.print("The whole sale cost is: $" + cost);
        } while(cont != "quit");
    }
}

