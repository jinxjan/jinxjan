import java.util.Scanner;
public class CarlysEventPrice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double PRICE_PER_GUEST = 35;
		final int LARGE_EVENT = 50;
		double totalPrice;
		int guestNumber;
		
		System.out.print("Enter number of guest >> ");
		guestNumber = input.nextInt();
		
		totalPrice = guestNumber * PRICE_PER_GUEST;
		
		System.out.println("****************************************************");
		System.out.println("*                                                  *");
		System.out.println("*  Carly's makes the food that makes it a party.   *");
		System.out.println("*                                                  *");
		System.out.println("****************************************************");
		
		System.out.println(guestNumber + " guests, at the price $" + PRICE_PER_GUEST + " per guest, the total for the party is $" + totalPrice + ".");
		System.out.println("Would this be a large party is " + (guestNumber >= LARGE_EVENT));
		
	}
}
