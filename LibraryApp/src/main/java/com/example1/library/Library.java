package com.example1.library;

public class Library {
	
	private Address address;

    public Library(Address address) {
        this.address = address;
    }

    public void showAddress() {
        System.out.println("Library Address: " + address.getStreet() + ", " + address.getCity());
    }

}
