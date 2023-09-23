package org.example;

public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
        this.name = null;
        this.address = null;
        this.phoneNumber = null;
    }
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        BuddyInfo buddyInfo = new BuddyInfo("Homer", "101 Champagne Ave", "2898878557");
        System.out.println(buddyInfo.name + ", " + buddyInfo.address + ", " + buddyInfo.phoneNumber);

    }
}
