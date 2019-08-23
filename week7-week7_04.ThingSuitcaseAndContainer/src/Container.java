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

public class Container {

    private int max;
    private ArrayList<Suitcase> list;

    public Container(int maxWeight) {
        this.max = maxWeight;
        this.list = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int temp = this.totalWeight() + suitcase.totalWeight();
        if (temp <= this.max) {
            this.list.add(suitcase);
        }
    }

    public int totalWeight() {
        int temp = 0;
        for (Suitcase i : this.list) {
            temp += i.totalWeight();
        }
        return temp;
    }

    public String toString() {
        return this.list.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printThings() {
        for (Suitcase i : this.list) {
            i.printThings();
        }
    }
}
