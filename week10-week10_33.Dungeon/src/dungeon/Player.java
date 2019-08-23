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
public class Player {

    private int xAxis;
    private int yAxis;
    private int length;
    private int height;
    private Scanner reader;

    public Player(Scanner reader, int length, int height) {
        this.xAxis = 0;
        this.yAxis = 0;
        this.reader = reader;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return "@ " + this.xAxis + " " + this.yAxis;
    }

    public int getXAxis() {
        return this.xAxis;
    }

    public int getYAxis() {
        return this.yAxis;
    }

    public boolean playerCheck(int len, int hgt) {
        if (len == this.xAxis && hgt == this.yAxis) {
            System.out.print("@");
            return true;
        }
        return false;
    }

    public void updatePosition() {
        String command = reader.nextLine();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'w') {
                if (this.yAxis > 0) {
                    this.yAxis--;
                }
            } else if (command.charAt(i) == 'a') {
                if (this.xAxis > 0) {
                    this.xAxis--;
                }

            } else if (command.charAt(i) == 's') {
                if (this.yAxis < this.height - 1) {
                    this.yAxis++;
                }

            } else if (command.charAt(i) == 'd') {
                if (this.xAxis < this.length - 1) {
                    this.xAxis++;
                }

            }
        }
    }
}
