import java.util.Scanner;

public class Skeleton {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] assignments = new int[5];
		int attendance;
		int midterm;
		
		for(int i=0; i<assignments.length; i++) {
			System.out.println("Input the grade of assignment: " + (i+1));
			assignments[i] = scan.nextInt();
		}
		
		System.out.println("Input the number of attended labs:");
		attendance = scan.nextInt();
		
		System.out.println("Input the midterm grade:");
		midterm = scan.nextInt();
		
		double assignmentsGrade = getAssignmentsGrade(assignments);
		double attendanceGrade = attendance * 100 * 0.05 / 7;
		double midtermGrade = midterm * 0.3;
		
		System.out.println("Assignments (30%): " + assignmentsGrade +
				"\nAttendance (5%): " + attendanceGrade +
				"\nMidterm (30%): " + midtermGrade);
	}
	
	public static double getAssignmentsGrade(int[] grades) {
		double toReturn = 0;
		for(int assignmentGrade: grades) {
			toReturn += assignmentGrade;
		}
		
		toReturn /= grades.length;
		toReturn *= 0.3;
		
		return toReturn;
	}
	
}
