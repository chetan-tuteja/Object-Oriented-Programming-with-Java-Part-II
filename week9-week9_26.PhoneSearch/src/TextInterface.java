/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.Scanner;

public class TextInterface {

    private Scanner reader;
    private Person database;

    public TextInterface(Scanner reader) {
        this.reader = reader;
        this.database = new Person();
    }

    public void start() {
        this.openingText();

        while (true) {
            System.out.println("command: ");
            String command = this.reader.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equalsIgnoreCase("1")) {
                addNumber();
            } else if (command.equals("2")) {
                searchNumber();
            } else if (command.equals("3")) {
                searchPerson();
            } else if (command.equals("4")) {
                addAddress();
            } else if (command.equals("5")) {
                searchPersonalInfo();
            } else if (command.equals("6")) {
                deleteInfo();
            } else if (command.equals("7")) {
                filteredList();
            }
        }
    }

    private void addNumber() {
        System.out.println("whose number: ");
        String name = reader.nextLine();
        System.out.println("number: ");
        String number = reader.nextLine();
        this.database.addPhone(name, number);
        System.out.println("");
    }

    private void searchNumber() {
        System.out.println("whose number: ");
        String name = reader.nextLine();
        this.database.searchNumber(name);
        System.out.println("");
    }

    private void searchPerson() {
        System.out.println("number: ");
        String number = reader.nextLine();
        this.database.searchPerson(number);
        System.out.println("");
    }

    private void addAddress() {
        System.out.println("whose address: ");
        String name = reader.nextLine();
        System.out.println("street: ");
        String street = reader.nextLine();
        System.out.println("city: ");
        String city = reader.nextLine();
        String address = street + " " + city;
        this.database.addAddress(name, address);
        System.out.println("");
    }

    private void searchPersonalInfo() {
        System.out.println("whose information: ");
        String name = reader.nextLine();
        this.database.printAll(name);
        System.out.println("");
    }

    private void deleteInfo() {
        System.out.println("whose information: ");
        String name = reader.nextLine();
        this.database.deleteInfo(name);
        System.out.println("");
    }

    private void filteredList() {
        System.out.println("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        this.database.filteredSearch(keyword);
    }

    private void openingText() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        System.out.println("");
    }
}
