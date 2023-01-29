import java.util.Scanner;
public class SammysRentalPrice {
	public static void main(String[] arg) {
	
		Scanner input = new Scanner(System.in);
		
		final int MINUTES_PER_HOUR = 60;
		final int HOUR_RATE = 40;
		int minutes, hours, extraMinutes, total;
		
		System.out.print("Enter minutes >> ");
		minutes = input.nextInt();
		
		hours = minutes / MINUTES_PER_HOUR;
		extraMinutes = minutes % MINUTES_PER_HOUR;
		total = hours * HOUR_RATE + extraMinutes;
		
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S                                    S");
		System.out.println("S  Sammy's makes it fun in the sun.  S");
		System.out.println("S                                    S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		
		System.out.println(hours + " hour(s) and " + extraMinutes + " minute(s), the total price is $" + total);
	}
}
