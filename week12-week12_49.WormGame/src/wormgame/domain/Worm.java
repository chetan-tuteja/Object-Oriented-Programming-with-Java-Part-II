/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import wormgame.Direction;
import java.util.*;

/**
 *
 * @author Chetan Tuteja
 */
public class Worm {

    private int originalX;
    private int originalY;
    private Direction originalDirection;
    private List<Piece> list;
    private boolean flag = false;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.originalX = originalX;
        this.originalY = originalY;
        this.originalDirection = originalDirection;
        this.list = new ArrayList<Piece>();
        this.list.add(new Piece(this.originalX, this.originalY));
    }

    public Direction getDirection() {
        return this.originalDirection;
    }

    public void setDirection(Direction dir) {
        this.originalDirection = dir;
    }

    public int getLength() {
        return this.list.size();
    }

    public List<Piece> getPieces() {
        return this.list;
    }

    public void move() {
        if (this.getLength() < 3 || flag) {
            this.moveByAddition();
            this.flag = false;
        } else {
            this.list.remove(0);
            this.moveByAddition();
        }
    }

    public void grow() {
        this.flag = true;
    }

    public boolean runsInto(Piece piece) {
        Boolean temp = false;
        for (Piece i : this.list) {
            if (i.runsInto(piece)) {
                temp = true;
            }
        }
        return temp;
    }

    public boolean runsIntoItself() {
        Piece head = this.getWormHead();
        Boolean temp = false;
        for (int i = 0; i < this.list.size() - 1; i++) {
            if (this.list.get(i).runsInto(head)) {
                temp = true;
            }
        }
        return temp;
    }

    public Piece getWormHead() {
        return this.list.get(this.getLength() - 1);
    }

    private void moveByAddition() {
        int curX = this.list.get(this.getLength() - 1).getX();
        int curY = this.list.get(this.getLength() - 1).getY();

        if (this.originalDirection.equals(Direction.LEFT)) {
            this.list.add(new Piece(curX - 1, curY));
        } else if (this.originalDirection.equals(Direction.RIGHT)) {
            this.list.add(new Piece(curX + 1, curY));
        } else if (this.originalDirection.equals(Direction.DOWN)) {
            this.list.add(new Piece(curX, curY + 1));
        } else if (this.originalDirection.equals(Direction.UP)) {
            this.list.add(new Piece(curX, curY - 1));
        }
    }
}
