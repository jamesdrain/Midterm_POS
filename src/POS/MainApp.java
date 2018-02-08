
package POS;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Point of Sale App for a party store 
 *
 * @authors Vince Beekel, Blaise Gakwaya, James Drain
 *
 * 2/7/2018
*/
public class MainApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int itemNum;

		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {

			String orderComplete = "n";
			while (orderComplete.equalsIgnoreCase("n")) {

				System.out.println("Welcome to our store.\nReady to party?   WE CAN HELP!!! ");

				// get inventory.txt populate ArrayList productList

				ArrayList<Products> productList = new ArrayList<Products>();

				System.out.println("\nHere is a list of our inventory: ");
				System.out.println("----------------------------");
				for (int i = 1; i < 13; i++) {
					System.out.println(i + ". " + productList.get(i - 1).toString());
				}

				itemNum = Validator.getInt(scnr, "\nWhich item would you like today? (Enter number): ", 1, 12 );
				System.out.println("\n" + productList.get(itemNum - 1).toString());
				System.out.println("Ok, how many would you like? ");

				// calculate purchase using money Class, either methods in money or subclasses
				// like...
				// purchase = money.productList.get(itemNum)
				// or something like that

				System.out.println("Will that complete your order? (y/n) ");
				orderComplete = scnr.nextLine();

				// if the order is not complete, it will loop back up to
				// print the product list again, then prompt user

			}
			
			// get total bill (through money Class) and ask for payment
			// calculate total and print receipt
			

			System.out.println("Would you like to place another order? (y/n) ");
			cont = scnr.nextLine();

			System.out.println("Thank you for your patronage. ");
			scnr.close();
		}

	}

}


