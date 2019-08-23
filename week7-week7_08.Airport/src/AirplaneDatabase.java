/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.ArrayList;

public class AirplaneDatabase {

    private ArrayList<Airplane> list;

    public AirplaneDatabase() {
        this.list = new ArrayList<Airplane>();
    }

    public void addAirplaneToDatabase(Airplane info) {
        this.list.add(info);
    }

    public void printPlanes() {
        for (Airplane i : this.list) {
            System.out.println(i);
        }
    }

    public void planeInfo(String planeID) {
        for (Airplane i : this.list) {
            if (i.planeID().equals(planeID)) {
                System.out.println(i);
            }
        }
    }

    public Airplane retAirplane(String planeID) {
        for (Airplane i : this.list) {
            if (i.planeID().equals(planeID)) {
                return i;
            }
        }
        return null;
    }
}
