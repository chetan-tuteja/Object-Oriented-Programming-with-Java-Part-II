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

public class FlightDatabase {

    private ArrayList<Flight> list;

    public FlightDatabase() {
        this.list = new ArrayList<Flight>();
    }

    public void addFlightToDatabase(Flight toAdd) {
        this.list.add(toAdd);
    }

    public void printFlights() {
        for (Flight i : this.list) {
            System.out.println(i);
        }
    }
}
