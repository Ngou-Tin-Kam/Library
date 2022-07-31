import java.util.*;

public class Runner {

    public static void main(String[] args) {

        Library library = new Library();

        // Pre-load data with some items and persons
        List<Item> itemsList = itemsData();
        List<Person> personsList = personsData();

        library.setAvailableItemList(itemsList);
        library.setPersonList(personsList);

        Person personOne = personsList.get(0);
        Item itemOne = itemsList.get(0);

        Person personTwo = personsList.get(1);
        Item itemTwo = itemsList.get(1);

        // Using the checkInItem method in Library class to check in an item for a person
        library.checkInItem(personOne, itemOne);
        library.checkInItem(personTwo, itemTwo);

        // Demonstration by printing out which person has borrowed which item
        library.getPersonBorrowedItemList();

        // Using the checkOutItem method in Library class to check out an item for a person
        library.checkOutItem(personTwo, itemTwo);

        // Demonstration by printing out which person has borrowed which item, an item should have been checked out
        library.getPersonBorrowedItemList();

        // Using the addNewItem method to add a new item into the Library
        Item newItem = new Book(10, "A new Book to learn java", "Sky", 2022, 123456789);
        library.addNewItem(newItem);

        // Demonstration by printing out all available items, a new item should have been added
        library.getAvailableItemList();

        // Using the removeItem method to remove the item from the Library
        library.removeItem(newItem);

        // Demonstration by printing out all available items, the previous added item should have been added
        library.getAvailableItemList();

        // Using updateItem to update the existing book with another book information
        Book updatedBook = new Book(2, "How to write HTML", "Guido van Rossum", 1992, 123456789);
        library.updateItem(itemTwo, updatedBook);

        // Demonstration by printing out all available items, where book title has been updated
        library.getAvailableItemList();

        // Using registerPerson to add a new person
        Person newPerson = new Person("Vin Diesel");
        library.registerPerson(newPerson);

        // Demonstration by printing out all persons
        library.getPersonList();

        // Using registerPerson to remove a person
        library.removePerson(newPerson);

        // Demonstration by printing out all persons, and the last person added has been removed
        library.getPersonList();

        // Using updatePerson to update a person's name
        Person updatedPerson = new Person("John Mick");
        library.updatePerson(personOne, updatedPerson);

        // Demonstration by printing out all persons, and the the first person's name has been updated
        library.getPersonList();
    }

    private static List<Person> personsData() {
        Person personOne = new Person("John Wick");
        Person personTwo = new Person("Harry Potter");
        Person personThree = new Person("Luke Skywalker");

        List<Person> list = new ArrayList<>();
        list.add(personOne);
        list.add(personTwo);
        list.add(personThree);

        return list;
    }

    private static List<Item> itemsData() {
        Book bookOne = new Book(1, "How to write java", "James Gosling", 1996, 123456789);
        Book bookTwo = new Book(2, "How to write python", "Guido van Rossum", 1994, 123456789);
        Book bookThree = new Book(3, "How to write javascript", "Brendan Eich", 1995, 123456789);

        Journal journalOne = new Journal(4, "The programming journal", "AOSA", 2022, "London");
        Journal journalTwo = new Journal(5, "Science of Computer Programming", "M.R. Mousavi", 2020, "France");
        Journal journalThree = new Journal(6, "Journal of Functional Programming", "Derek Dreyer", 2019, "China");

        Magazine magazineOne = new Magazine(7, "Star Wars: The official magazine 1", "Real-world articles", 1996, "Fashion");
        Magazine magazineTwo = new Magazine(8, "Star Wars: The official magazine 2", "Real-world articles", 1997, "Smart");
        Magazine magazineThree = new Magazine(9, "Star Wars: The official magazine 3", "Real-world articles", 1998, "Time");

        List<Item> list = new ArrayList<>();
        list.add(bookOne);
        list.add(bookTwo);
        list.add(bookThree);

        list.add(journalOne);
        list.add(journalTwo);
        list.add(journalThree);

        list.add(magazineOne);
        list.add(magazineTwo);
        list.add(magazineThree);

        return list;
    }
}
