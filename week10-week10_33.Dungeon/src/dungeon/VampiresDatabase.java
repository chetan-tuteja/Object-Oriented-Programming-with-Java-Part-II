/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.*;

/**
 *
 * @author Chetan Tuteja
 */
/* This code passes all the test case 2/10 times and I don't know the reason why. I'll try to figure it and fix it */
public class VampiresDatabase {

    private List<Vampires> list;

    public VampiresDatabase() {
        this.list = new ArrayList<Vampires>();
    }

    public void addNew(int total, int length, int height) {
        while (this.list.size() < total) {
            Vampires temp = new Vampires(length, height);
            if (!this.list.contains(temp)) {
                this.list.add(temp);
            }
        }
    }

    public void printAll() {
        for (Vampires i : this.list) {
            System.out.println(i);
        }
    }

    public boolean vampireCheck(int len, int hgt) {
        boolean temp = false;
        for (Vampires i : this.list) {
            if (len == i.getXAxis() && hgt == i.getYAxis()) {
                System.out.print("v");
                temp = true;
            }
        }
        return temp;
    }

    public void randomizePositions() {
        if (!this.list.isEmpty()) {
            if (this.list.size() == 1) {
                this.list.get(0).assignPositions();
            } else {
                int x = this.list.get(0).getXAxis();
                int y = this.list.get(0).getYAxis();

                for (Vampires i : this.list) {
                    if (i.getXAxis() != x && i.getYAxis() != y) {
                        i.assignPositions();
                    }
                }
            }
        }
    }

    public void positionCheck(int x, int y) {
        ArrayList<Vampires> toBeRemoved = new ArrayList<Vampires>();
        for (Vampires i : this.list) {
            if (i.getXAxis() == x || i.getYAxis() == y) {
                toBeRemoved.add(i);
            }
        }
        this.list.removeAll(toBeRemoved);
    }

    public int returnSize() {
        return this.list.size();
    }
}
