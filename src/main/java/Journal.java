public class Journal extends Item implements DisplayInformation {
    private String location;

    public Journal(int itemId, String title, String author, int releaseYear, String location) {
        super(itemId, title, author, releaseYear);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void displayInformation() {
        System.out.println(
                "Journal ID: " + this.getItemId() +
                        ", Title: " + this.getTitle() +
                        ", Author: " + this.getAuthor() +
                        ", Release Year: " + this.getReleaseYear() +
                        ", Location: " + this.getLocation());
    }
}