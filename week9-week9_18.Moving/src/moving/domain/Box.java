/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Chetan Tuteja
 */
import java.util.ArrayList;

public class Box implements Thing {

    private int maxCapacity;
    private ArrayList<Thing> list;

    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.list = new ArrayList<Thing>();
    }

    public int getVolume() {
        int total = 0;
        for (Thing i : this.list) {
            total += i.getVolume();
        }
        return total;
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() <= this.maxCapacity) {
            this.list.add(thing);
            return true;
        }
        return false;
    }

}
