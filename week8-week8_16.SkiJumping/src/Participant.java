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

public class Participant {

    private String name;
    private int points;
    private ArrayList<Integer> jumpLength;

    public Participant(String name) {
        this.name = name;
        this.points = 0;
        this.jumpLength = new ArrayList<Integer>();
    }

    public String name() {
        return this.name;
    }

    public int points() {
        return this.points;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.points() + " points)";
    }

    public void updatePoints(int points) {
        this.points += points;
    }

    public void addJump(int jumps) {
        this.jumpLength.add(jumps);
    }

    public void printJumps() {
        System.out.print("jump lengths: ");
        for (int i = 0; i < this.jumpLength.size(); i++) {
            if (i == this.jumpLength.size() - 1) {
                System.out.print(this.jumpLength.get(i) + " m");
            } else {
                System.out.print(this.jumpLength.get(i) + " m, ");
            }
        }
    }

}
