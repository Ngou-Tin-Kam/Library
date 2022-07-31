public class Book extends Item implements DisplayInformation {
    private int isbnNumber;

    public Book(int itemId, String title, String author, int releaseYear, int isbnNumber) {
        super(itemId, title, author, releaseYear);
        this.isbnNumber = isbnNumber;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public void displayInformation() {
        System.out.println(
                "Book ID: " + this.getItemId() +
                        ", Title: " + this.getTitle() +
                        ", Author: " + this.getAuthor() +
                        ", Release Year: " + this.getReleaseYear() +
                        ", ISBN Number: " + this.getIsbnNumber());
    }
}
