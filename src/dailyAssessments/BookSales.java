package dailyAssessments;

public class BookSales {
	
    private String title;
    private String author;
    private double price;

    public BookSales(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
 // Method to apply a discount to the price
    public void applyDiscount(double discount) {
        if (discount > 0 && discount < 100) {
            price = price - (price * discount / 100);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + String.format("%.2f", price));
    }

	public static void main(String[] args) {
		
		 
        BookSales b = new BookSales("Java Programming", "Rajesh", 69.99);

        // Displaying book details before applying discount
        System.out.println("Before discount:");
        b.displayDetails();

        
        b.applyDiscount(10); // Applying a 10% discount

        
        System.out.println("\nAfter discount:");
        b.displayDetails();
		
		

	}

}
