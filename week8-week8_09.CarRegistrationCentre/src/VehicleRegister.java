/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> hash;

    public VehicleRegister() {
        this.hash = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        for (RegistrationPlate i : this.hash.keySet()) {
            if (i.equals(plate)) {
                return false;
            }
        }
        this.hash.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        String toRet = null;
        if (this.hash.containsKey(plate)) {
            toRet = this.hash.get(plate);
        }
        return toRet;
    }

    public boolean delete(RegistrationPlate plate) {
        for (RegistrationPlate i : this.hash.keySet()) {
            if (i.equals(plate)) {
                this.hash.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate i : this.hash.keySet()) {
            System.out.println(i);
        }
    }

    public void printOwners() {
        ArrayList<String> temp = new ArrayList<String>();

        for (RegistrationPlate i : this.hash.keySet()) {
            if (temp.contains(this.hash.get(i))) {

            } else {
                temp.add(this.hash.get(i));
            }
        }

        for (String i : temp) {
            System.out.println(i);
        }
    }
}
