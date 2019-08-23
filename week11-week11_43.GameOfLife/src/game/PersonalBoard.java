/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;

/**
 *
 * @author Chetan Tuteja
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void turnToLiving(int x, int y) {
        if ((x >= 0 && x <= super.getWidth()) && (y >= 0 && y <= super.getHeight())) {
            super.getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if ((x >= 0 && x <= super.getWidth()) && (y >= 0 && y <= super.getHeight())) {
            super.getBoard()[x][y] = false;
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if ((x >= super.getWidth() || x < 0) || (y >= super.getHeight() || y < 0)) {
            return false;
        }
        return super.getBoard()[x][y];
    }

    @Override
    public void initiateRandomCells(double probabiltyForEachCell) {
        int prob = (int) ((super.getWidth() * super.getHeight()) * probabiltyForEachCell);
        int count = 0;
        for (int i = 0; i < super.getWidth(); i++) {
            for (int j = 0; j < super.getHeight(); j++) {
                if (count < prob) {
                    super.getBoard()[i][j] = true;
                    count++;
                }
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int count = 0;
        if ((x > 0 && x < super.getWidth() - 1) && (y > 0 && y < super.getWidth() - 1)) {
            if (super.getBoard()[x][y - 1]) {
                count++;
            }
            if (super.getBoard()[x][y + 1]) {
                count++;
            }
            if (super.getBoard()[x - 1][y]) {
                count++;
            }
            if (super.getBoard()[x + 1][y]) {
                count++;
            }
            if (super.getBoard()[x - 1][y - 1]) {
                count++;
            }
            if (super.getBoard()[x + 1][y + 1]) {
                count++;
            }
            if (super.getBoard()[x - 1][y + 1]) {
                count++;
            }
            if (super.getBoard()[x + 1][y - 1]) {
                count++;
            }

        } else if ((x == 0 && y == 0)) {
            if (super.getBoard()[x][y + 1]) {
                count++;
            }
            if (super.getBoard()[x + 1][y]) {
                count++;
            }
            if (super.getBoard()[x + 1][y + 1]) {
                count++;
            }

        } else if (x == super.getWidth() - 1 && y == super.getHeight() - 1) {
            if (super.getBoard()[x - 1][y]) {
                count++;
            }
            if (super.getBoard()[x][y - 1]) {
                count++;
            }
            if (super.getBoard()[x - 1][y - 1]) {
                count++;
            }

        } else if (x == 0 && y == super.getHeight() - 1) {
            if (super.getBoard()[x][y - 1]) {
                count++;
            }
            if (super.getBoard()[x + 1][y]) {
                count++;
            }
            if (super.getBoard()[x + 1][y - 1]) {
                count++;
            }

        } else if (x == super.getWidth() - 1 && y == 0) {
            if (super.getBoard()[x - 1][y]) {
                count++;
            }
            if (super.getBoard()[x][y + 1]) {
                count++;
            }
            if (super.getBoard()[x - 1][y + 1]) {
                count++;
            }

        } else if (x == 0 && (y < super.getHeight() - 1 && y > 0)) {
            if (super.getBoard()[x][y - 1]) {
                count++;
            }
            if (super.getBoard()[x][y + 1]) {
                count++;
            }
            if (super.getBoard()[x + 1][y]) {
                count++;
            }
            if (super.getBoard()[x + 1][y - 1]) {
                count++;
            }
            if (super.getBoard()[x + 1][y + 1]) {
                count++;
            }

        } else if (x == super.getWidth() - 1 && (y < super.getHeight() - 1 && y > 0)) {
            if (super.getBoard()[x][y - 1]) {
                count++;
            }
            if (super.getBoard()[x][y + 1]) {
                count++;
            }
            if (super.getBoard()[x - 1][y]) {
                count++;
            }
            if (super.getBoard()[x - 1][y - 1]) {
                count++;
            }
            if (super.getBoard()[x - 1][y + 1]) {
                count++;
            }

        } else if ((x < super.getWidth() - 1 && x > 0) && y == 0) {

            if (super.getBoard()[x - 1][y]) {
                count++;
            }
            if (super.getBoard()[x + 1][y]) {
                count++;
            }
            if (super.getBoard()[x][y + 1]) {
                count++;
            }
            if (super.getBoard()[x - 1][y + 1]) {
                count++;
            }
            if (super.getBoard()[x + 1][y + 1]) {
                count++;
            }

        } else if ((x < super.getWidth() - 1 && x > 0) && y == super.getHeight() - 1) {
            if (super.getBoard()[x - 1][y]) {
                count++;
            }
            if (super.getBoard()[x + 1][y]) {
                count++;
            }
            if (super.getBoard()[x][y - 1]) {
                count++;
            }
            if (super.getBoard()[x - 1][y - 1]) {
                count++;
            }
            if (super.getBoard()[x + 1][y - 1]) {
                count++;
            }

        }
        return count;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (livingNeighbours < 2 || livingNeighbours > 3) {
            this.turnToDead(x, y);
        } else if (livingNeighbours == 3) {
            this.turnToLiving(x, y);
        }

    }

}
