import java.util.Scanner;
public class Membershipstatus {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter your membership status (premium/non-premium): ");
	        String membershipStatus = scanner.nextLine().trim().toLowerCase();
	        System.out.print("Enter your total purchase amount: ");
	        double purchaseAmount = scanner.nextDouble();
	        double discount = calculateDiscount(membershipStatus, purchaseAmount);
	        displayFinalAmount(purchaseAmount, discount);
	        scanner.close();
	    }
	// Function to calculate the discount
	    public static double calculateDiscount(String membershipStatus, double purchaseAmount) {
	        double discount = 0.0;
	        if (membershipStatus.equals("premium") && purchaseAmount > 1000) {
	            discount = 0.20 * purchaseAmount;
	        } else if (membershipStatus.equals("non-premium") && purchaseAmount > 2000) {
	            discount = 0.15 * purchaseAmount;
	        }
	        return discount;
	    }
	    // Function to display the final amount after discount
	    public static void displayFinalAmount(double purchaseAmount, double discount) {
	        double finalAmount = purchaseAmount - discount;
	        System.out.println("The discount amount is: " + discount);
	        System.out.println("The final amount after discount is: " + finalAmount);
	    }
	    
}
