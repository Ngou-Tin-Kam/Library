public class Magazine extends Item implements DisplayInformation {
    private String headline;

    public Magazine(int itemId, String title, String author, int releaseYear, String headline) {
        super(itemId, title, author, releaseYear);
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Override
    public void displayInformation() {
        System.out.println(
                "Magazines ID: " + this.getItemId() +
                        ", Title: " + this.getTitle() +
                        ", Author: " + this.getAuthor() +
                        ", Release Year: " + this.getReleaseYear() +
                        ", Headline: " + this.getHeadline());
    }
}