package org.example;
import java.util.ArrayList;
import java.util.Collection;

public class AddressBook {

    private Collection<BuddyInfo> addressBook;

    /**
     * Constructor for the address book
     */
    public AddressBook() {
        this.addressBook = new ArrayList<>();
    }

    /**
     * Remove a specific buddy from the address book
     * @param buddy
     */
    public void removeBuddy(BuddyInfo buddy) {
        this.addressBook.remove(buddy);
    }

    /**
     * Add a specific buddy from the address book
     * @param buddy
     */
    public void addBuddy(BuddyInfo buddy) {
        this.addressBook.add(buddy);
    }

    /**
     * Get all buddies in the address book
     */

    public Collection<BuddyInfo> getBuddies(){
        return addressBook;
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(new BuddyInfo("Homer", "new address", "123456"));
        addressBook.addBuddy(new BuddyInfo("Marge", "new address", "1234567"));
        addressBook.addBuddy(new BuddyInfo("Bart", "new address", "12345678"));

        for(BuddyInfo buddy : addressBook.getBuddies()){
            System.out.println(buddy.getName() + ", " + buddy.getAddress() + ", " + buddy.getPhoneNumber());
        }
        System.out.println("Change for git verification");

        BuddyInfo newBuddy = new BuddyInfo("Lisa", "new address", "12345678");
        addressBook.addBuddy(newBuddy);
        addressBook.removeBuddy(newBuddy);
    }
}
