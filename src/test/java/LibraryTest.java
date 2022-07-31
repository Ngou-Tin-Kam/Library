import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void addItemToList() {
        Library library = new Library();
        Book item = new Book(1, "testing title", "testing author", 2000, 123456789);
        library.addNewItem(item);
        assertEquals(1, library.getAvailableItemList().get(0).getItemId());
        assertEquals("testing title", library.getAvailableItemList().get(0).getTitle());
        assertEquals("testing author", library.getAvailableItemList().get(0).getAuthor());
        assertEquals(2000, library.getAvailableItemList().get(0).getReleaseYear());
    }
}