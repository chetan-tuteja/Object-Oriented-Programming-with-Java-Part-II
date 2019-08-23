/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Chetan Tuteja
 */
public class Organism implements Movable {

    private int xCo;
    private int yCo;

    public Organism(int x, int y) {
        this.xCo = x;
        this.yCo = y;
    }

    @Override
    public String toString() {
        return "x: " + this.xCo + "; y: " + this.yCo;
    }

    @Override
    public void move(int dx, int dy) {
        this.xCo += dx;
        this.yCo += dy;
    }
}
