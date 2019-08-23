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
public class Vampires {

    private int length;
    private int height;
    private int xAxis;
    private int yAxis;

    public Vampires(int length, int height) {
        this.length = length;
        this.height = height;
        this.assignPositions();
    }

    public String toString() {
        return "v " + this.xAxis + " " + this.yAxis;
    }

    public int getXAxis() {
        return this.xAxis;
    }

    public int getYAxis() {
        return this.yAxis;
    }

    public void assignPositions() {
        this.xAxis = new Random().nextInt(this.length);
        this.yAxis = new Random().nextInt(this.height);
    }

}
