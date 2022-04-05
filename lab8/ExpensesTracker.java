import java.util.Scanner;
import java.io.*;

public class ExpensesTracker {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String file = "expenses.txt"; 
		FileWriter fw = new FileWriter(file);
		PrintWriter outFile = new PrintWriter(fw);
		String name, purchase;
		double price;
		

		System.out.println("Input your name: ");
		name = scan.nextLine();

		System.out.println("What did you purchase?");
		purchase = scan.nextLine();

		System.out.println("How much did you pay?");
		price = scan.nextDouble();

		outFile.println(name + " purchased " + purchase + " for " + price + " US Dollars");
		
		scan.nextLine();
		System.out.println("Would you like to log another purchase? (y/n)");
		String proceed = scan.nextLine();
		proceed = proceed.toLowerCase();


		while (proceed.equals("y")) {
			System.out.println("Input your name: ");
			name = scan.nextLine();

			System.out.println("What did you purchase?");
			purchase = scan.nextLine();

			System.out.println("How much did you pay?");
			price = scan.nextDouble();

			outFile.println(name + " purchased " + purchase + " for " + price + " US Dollars");
			
			scan.nextLine();
			System.out.println("Would you like to log another purchase? (y/n)");
			proceed = scan.nextLine();
			proceed = proceed.toLowerCase();
		}
		
		outFile.close();
		
		
		System.out.println("Would you like to read a summary of your purchases?");
		String bonus = scan.nextLine();
		
		if(bonus.equals("y")) {
			Scanner fileScan = new Scanner (new File("expenses.txt"));
			
			System.out.println();
			while(fileScan.hasNext()) {
		
				System.out.println(fileScan.nextLine());
			}
		}
		
		
		System.out.println("Get off of ZoodMall!");
		

	}
}