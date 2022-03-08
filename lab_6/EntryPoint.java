import java.util.Scanner;
import java.util.Random;

public class EntryPoint{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		String proceed;
		
		do {
			System.out.println("Which service would you like to use?");
			System.out.println("[1]: Basic week visualizer");
			System.out.println("[2]: Advanced week visualizer");
			System.out.println("[3]: Basic calculator");
			System.out.println("[4]: Employee repertoire");
			int choice = scan.nextInt();	
			
			System.out.println();
			
			switch(choice) {
			case 1:
				System.out.println(BasicWeek.printDays());
				System.out.println();
				break;
			case 2:
				System.out.println(AdvancedWeek.printDays());
				System.out.println();
				break;
			case 3:
				System.out.print("Input the first number: ");
				int val1 = scan.nextInt();
				scan.nextLine();
				System.out.print("\nInput the operator: ");
				String op = scan.nextLine();
				System.out.print("\nInput the second number: ");
				System.out.println();
				int val2 = scan.nextInt();
				if(op.equals("+"))
					System.out.println(Calculator.add(val1, val2));
				else if(op.equals("-"))
					System.out.println(Calculator.subtract(val1, val2));
				else if(op.equals("*"))
					System.out.println(Calculator.multiply(val1, val2));
				else
					System.out.println(Calculator.divide(val1, val2));
				System.out.println();
				break;
			case 4:
				employees();
				System.out.println();
				break;
			}
			
			if(choice>4 || choice<1) {
				System.out.println("Please make sure you input a number between 1 and 4.");
			}else {
				scan.nextLine();
				System.out.println("Would you like to perform another operation? (y/n)");
				proceed = scan.nextLine();
				if(proceed.equals("n"))
					flag = false;
			}
		}while(flag);

	}
	
	public static void employees() {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int insertions = rnd.nextInt(5)+1;
		Employee[] eArray = new Employee[insertions];
		
		for(int i=0; i<insertions; i++) {
			System.out.println("You have "+(insertions-i)+" insertions left");
			System.out.println("Please input the employee's first name:");
			String first = scan.nextLine();
			System.out.println("Please input the employee's last name:");
			String last = scan.nextLine();
			System.out.println("Please input the employee's age:");
			int age = scan.nextInt();
			System.out.println("Please input the employee's monthly salary:");
			double salary = scan.nextDouble();
			scan.nextLine();
			
			Employee e = new Employee(first, last, age, salary);
			eArray[i] = e;
		}
		
		System.out.println();

		for(int i=0; i<eArray.length; i++) {
			System.out.println("Employee information: "+eArray[i].getFirstName()+" "+eArray[i].getLastName()+", "+
		    eArray[i].getAge()+", "+eArray[i].getMonthlySalary());
		}
	}
}