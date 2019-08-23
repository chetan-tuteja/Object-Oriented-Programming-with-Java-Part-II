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

public class Suitcase {

    private int max;
    private ArrayList<Thing> list;

    public Suitcase(int maxWeight) {
        this.max = maxWeight;
        list = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        int temp = this.totalWeight() + thing.getWeight();
        if (temp <= this.max) {
            this.list.add(thing);
        }
    }

    public String toString() {
        if (this.list.isEmpty()) {
            return "empty (" + this.totalWeight() + " kg)";
        } else if (this.list.size() == 1) {
            return this.list.size() + " thing (" + this.totalWeight() + " kg)";
        }
        return this.list.size() + " things (" + this.totalWeight() + " kg)";
    }

    public int totalWeight() {
        int temp = 0;
        for (Thing i : this.list) {
            temp += i.getWeight();
        }
        return temp;
    }

    public void printThings() {
        for (Thing i : this.list) {
            System.out.println(i);
        }
    }

    public Thing heaviestThing() {
        if (this.list.isEmpty()) {
            return null;
        }
        Thing current = this.list.get(0);
        for (Thing i : this.list) {
            if (current.getWeight() < i.getWeight()) {
                current = i;
            }
        }
        return current;
    }

}
