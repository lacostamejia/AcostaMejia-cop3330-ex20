/*
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia

 What is the order amount? 10
What state do you live in? Wisconsin
What county do you live in? Dane
The tax is $0.50.
The total is $10.50.
 */

 import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Here is the scanner method used.

        //Variables used.
        int order_amount;
        String state;
        String county;
        double tax;
        double total;

        System.out.print("What is the order amount? ");
        order_amount = in.nextInt();

        System.out.print("What state do you live in? ");
        state = in.next();

        state = state.toUpperCase();
        if(state.equals("WISCONSIN"))
        {
            tax = order_amount * (0.05);
            System.out.print("What county do you live in? ");
            county = in.next();
            county = county.toUpperCase();

            if (county.equals("EAU CLAIRE")){
                tax = tax + (order_amount * 0.005);

            }
            else if(county.equals("DUNN"));
            {
                tax = tax + (order_amount * 0.004);
            }
            total = order_amount + tax;
            System.out.printf("The tax is $%.2f",tax);
            System.out.println(" ");
            System.out.printf("The total is $%.2f",(total));
        }
        else if(state.equals("ILLINOIS")){
            tax = order_amount * (0.08);
            total = tax + order_amount;
            System.out.printf("The tax is $%.2f",tax);
            System.out.println(" ");
            System.out.printf("The total is $%.2f",(total));
        }
        else{
            total = order_amount;
            System.out.printf("The total is $%2.f",total);
        }

        

    }
}
