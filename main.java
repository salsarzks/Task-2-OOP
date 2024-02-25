public class main {

  public static void main(String[] args) {
    // Create two book objects
    Books book1 = new Books(
      "Annisa Lim",
      "Bendera Setengah Tiang",
      100000.0,
      222123
    );
    Books book2 = new Books("Shannin", "The Hidden Reality", 85000.0, 222126);
    Books book3 = new Books(
      "Getlicious",
      "Dua Sisi",
      120000.0,
      222125
    );

    // Calculate total price
    double totalPrice = book1.getPrice() + book2.getPrice() + book3.getPrice();

    // Display information and total price
    System.out.println("Book 1:");
    book1.displayBookInfo();

    System.out.println("\nBook 2:");
    book2.displayBookInfo();

    System.out.println("\nBook 3:");
    book3.displayBookInfo();

    System.out.println("\nTotal price: Rp. " + totalPrice);
  }
}
