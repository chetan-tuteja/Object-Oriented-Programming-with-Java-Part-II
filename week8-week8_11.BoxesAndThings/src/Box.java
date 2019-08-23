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

public class Box implements ToBeStored {

    private ArrayList<ToBeStored> list;
    private double maxWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        list = new ArrayList<ToBeStored>();
    }

    public double weight() {
        double temp = 0;
        for (ToBeStored i : this.list) {
            temp += i.weight();
        }
        return temp;
    }

    public void add(ToBeStored item) {
        if ((this.weight() + item.weight()) <= this.maxWeight) {
            this.list.add(item);
        }
    }

    public String toString() {
        return "Box: " + this.list.size() + " things, total weight " + weight() + " kg";
    }
}
