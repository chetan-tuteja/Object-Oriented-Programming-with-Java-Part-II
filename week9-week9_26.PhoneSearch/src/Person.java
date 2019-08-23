/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.*;

public class Person {

    private Map<String, ArrayList<String>> phone;
    private Map<String, ArrayList<String>> address;

    public Person() {
        this.phone = new HashMap<String, ArrayList<String>>();
        this.address = new HashMap<String, ArrayList<String>>();
    }

    public void addPhone(String name, String number) {
        if (this.phone.containsKey(name)) {
            this.phone.get(name).add(number);
        } else {
            this.phone.put(name, new ArrayList<String>());
            this.phone.get(name).add(number);
        }
    }

    public void addAddress(String name, String address) {
        if (this.address.containsKey(name)) {
            this.address.get(name).add(address);
        } else {
            this.address.put(name, new ArrayList<String>());
            this.address.get(name).add(address);
        }
    }

    public void printAll(String keyName) {
        if (!this.address.containsKey(keyName) && !this.phone.containsKey(keyName)) {
            System.out.println("  not found");
        } else {
            if (this.address.containsKey(keyName)) {
                System.out.print("  address: ");
                this.getAddress(keyName);
            } else {
                System.out.println("  address unknown");
            }

            if (this.phone.containsKey(keyName)) {
                System.out.println("  phone numbers:");
                for (int j = 0; j < this.phone.get(keyName).size(); j++) {
                    System.out.println("   " + this.phone.get(keyName).get(j));
                }
            } else {
                System.out.println("  phone number not found");
            }
        }
    }

    public void searchNumber(String name) {
        if (this.phone.containsKey(name)) {
            this.getPhone(name);
        } else {
            System.out.println("  not found");
        }
    }

    public void searchPerson(String number) {
        boolean temp = false;
        for (String i : this.phone.keySet()) {
            if (this.phone.get(i).contains(number)) {
                System.out.println(i);
                temp = true;
            }
        }
        if (!temp) {
            System.out.println(" not found");
        }
    }

    public void deleteInfo(String name) {
        if (this.phone.containsKey(name)) {
            this.phone.remove(name);
        }
        if (this.address.containsKey(name)) {
            this.address.remove(name);
        }
    }

    public void filteredSearch(String keyword) {
        ArrayList<String> list = this.sortList();
        boolean temp = false;

        for (String i : list) {
            if (i.contains(keyword)) {
                System.out.println(" " + i);
                this.printAll(i);
                System.out.println("");
                temp = true;
            }
        }

        if (!temp) {
            for (String k : list) {
                if (this.address.containsKey(k)) {
                    ArrayList<String> addressTemp = this.address.get(k);

                    for (String x : addressTemp) {
                        if (x.contains(keyword)) {
                            System.out.println(" " + k);
                            this.printAll(k);
                            System.out.println("");
                            temp = true;
                        }
                    }

                }
            }
        }

        if (!temp) {
            System.out.println(" keyword not found");
            System.out.println("");
        }

    }

    private void getAddress(String key) {
        for (int i = 0; i < this.address.get(key).size(); i++) {
            System.out.println(this.address.get(key).get(i));
        }
    }

    private void getPhone(String key) {
        for (int i = 0; i < this.phone.get(key).size(); i++) {
            System.out.println(" " + this.phone.get(key).get(i));
        }
    }

    private ArrayList<String> sortList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String i : this.phone.keySet()) {
            list.add(i);
        }

        for (String j : this.address.keySet()) {
            if (!list.contains(j)) {
                list.add(j);
            }
        }

        Collections.sort(list);
        return list;
    }
}
