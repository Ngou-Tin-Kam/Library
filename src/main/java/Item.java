public abstract class Item implements DisplayInformation {
    private int itemId;
    private String title;
    private String author;
    private int releaseYear;

    public Item(int itemId, String title, String author, int releaseYear) {
        super();
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
