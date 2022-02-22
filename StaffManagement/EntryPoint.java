import java.util.Scanner;
import java.util.Random;

public class EntryPoint{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		
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