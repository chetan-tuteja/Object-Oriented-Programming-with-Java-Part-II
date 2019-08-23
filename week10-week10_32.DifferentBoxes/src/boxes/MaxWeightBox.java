/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.*;

/**
 *
 * @author Chetan Tuteja
 */
public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> list;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<Thing>();
    }

    public void add(Thing thing) {
        if (thing.getWeight() + this.currentWeight() <= this.maxWeight) {
            this.list.add(thing);
        }
    }

    public boolean isInTheBox(Thing thing) {
        if (!this.list.contains(thing)) {
            return false;
        }
        return true;
    }

    private int currentWeight() {
        int temp = 0;
        for (Thing i : this.list) {
            temp += i.getWeight();
        }
        return temp;
    }
}
