import java.util.Scanner;

public class InvoiceApp {
	
	public static void main(String[] args)

	{
		//display a welcome message
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();
		
		
		//get the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  subtotal:    ");
		double subtotal = sc.nextDouble();
		
		//calculate the discount amount and total
		double discountPercent = 0.2;
		double discountAmount = subtotal * discountPercent;
		double invoiceTotal = subtotal - discountAmount;
		
		//format and display
		String message = "Subtotal Amount\t" + subtotal + "\nDiscount Amount\t" + discountAmount + "\nInvoice Total\t" + invoiceTotal + "\n"; 
		System.out.println(message);
	}
}
