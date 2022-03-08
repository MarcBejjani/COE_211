public class AdvancedWeek {
	public static String printDays() {
		int index = 1;
		String day_1 = "Monday";
		String day_2 = "Tuesday";
		String day_3 = "Wednesday";
		String day_4 = "Thursday";
		String day_5 = "Friday";
		String day_6 = "Saturday";
		String day_7 = "Sunday";
		
		return "The advanced days of the week are:\n" + index + ": " + day_1 + ",\n" + (index + 1) + ": " + day_2 + ",\n" + (index + 2) + ": "
				+ day_3 + ",\n" + (index + 3) + ": " + day_4 + ",\n" + (index + 4) + ": " + day_5 + ",\n" + (index + 5)
				+ ": " + day_6 + ",\n" + (index + 6) + ": " + day_7 + ".";
	}
}