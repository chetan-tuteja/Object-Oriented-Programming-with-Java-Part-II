/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
public class Airplane {

    private String planeID;
    private int planeCap;

    public Airplane(String planeID, int planeCap) {
        this.planeID = planeID;
        this.planeCap = planeCap;
    }

    public String toString() {
        return this.planeID + " (" + this.planeCap + " ppl)";
    }

    public String planeID() {
        return this.planeID;
    }

    public int planeCap() {
        return this.planeCap;
    }

}
