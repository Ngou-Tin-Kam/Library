import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {

    private static List<Item> availableItemList = new ArrayList<>();
    private static HashMap<Person, Item> personBorrowedItemList = new HashMap<>();
    private static List<Person> personList = new ArrayList<>();


    public List<Item> getAvailableItemList() {
        System.out.println("These are all the items available:");
        availableItemList.forEach(item -> item.displayInformation());
        return availableItemList;
    }

    public void setAvailableItemList(List<Item> availableItemList) {
        Library.availableItemList = availableItemList;
    }

    public HashMap<Person, Item> getPersonBorrowedItemList() {
        System.out.println("Currently, these are the items borrowed by each person:");
        personBorrowedItemList.forEach((person, item) -> System.out.println(person.getFullName() + " borrowed: " + item.getTitle()));
        return personBorrowedItemList;
    }

    public static void setPersonBorrowedItemList(HashMap<Person, Item> personBorrowedItemList) {
        Library.personBorrowedItemList = personBorrowedItemList;
    }

    public List<Person> getPersonList() {
        personList.forEach(person -> System.out.println(person.getFullName()));
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        Library.personList = personList;
    }

    public void checkInItem(Person person, Item item) {
        if (!availableItemList.contains(item)) {
            System.out.println(item.getTitle() + ", is currently not available");
        } else {
            availableItemList.remove(item);
            personBorrowedItemList.put(person, item);
            System.out.println(item.getTitle() + ", has successfully checked in by " + person.getFullName());
        }
    }

    public void checkOutItem(Person person, Item item) {
        if (!personBorrowedItemList.containsKey(person)) {
            System.out.println(person.getFullName() + " has not borrowed any item");
        } else if (!personBorrowedItemList.containsValue(item)) {
            System.out.println(item.getTitle() + " has not been borrowed by anyone");
        } else {
            personBorrowedItemList.remove(person);
            availableItemList.add(item);
            System.out.println(person.getFullName() + " has returned the following item: " + item.getTitle());
        }
    }

    public String addNewItem(Item item) {
        availableItemList.add(item);
        return "A new item has been successfully added";
    }

    public String removeItem(Item item) {
        availableItemList.remove(item);
        return "The item has been successfully removed";
    }

    public String updateItem(Item oldItem, Item newItem) {
        availableItemList.remove(oldItem);
        availableItemList.add(newItem);
        return "The item has been successfully updated";
    }

    public String registerPerson(Person person) {
        personList.add(person);
        return "A new person has been added to the system";
    }

    public String removePerson(Person person) {
        personList.remove(person);
        return "This person has been removed from the system";
    }

    public String updatePerson(Person oldPerson, Person newPerson) {
        int indexToUpdate = personList.indexOf(oldPerson);
        personList.get(indexToUpdate).setFullName(newPerson.getFullName());
        return "This person has been updated on the system";
    }
}