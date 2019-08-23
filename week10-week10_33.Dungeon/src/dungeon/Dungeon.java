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
public class Dungeon {

    private int length, height, vampires, moves;
    private boolean vampiresMove;
    private Player player;
    private VampiresDatabase database;
    private Scanner reader;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.reader = new Scanner(System.in);
        this.vampiresMove = vampiresMove;
        this.player = new Player(reader, length, height);
        this.database = new VampiresDatabase();
        this.database.addNew(vampires, length, height);
    }

    public void run() {
        int temp = this.moves;
        while (this.moves > 0) {
            this.printMoves();
            this.playerInitialize();
            this.vampireInitialize();
            this.printBoard();
            this.updatePlayer();
            if (this.database.returnSize() == 0) {
                System.out.println("YOU WIN");
                break;
            }
            this.moves--;
        }
        this.printFinalResult();
    }

    private void printMoves() {
        System.out.println(this.moves);
        System.out.println("");
    }

    private void playerInitialize() {
        System.out.println(this.player.toString());
    }

    private void vampireInitialize() {
        if (this.vampiresMove) {
            this.database.randomizePositions();
        }
        this.database.printAll();
    }

    private void printBoard() {
        System.out.println("");
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.length; j++) {
                if (this.player.playerCheck(j, i)) {
                } else if (this.database.vampireCheck(j, i)) {

                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private void updatePlayer() {
        //this.database.positionCheck(this.player.getXAxis(), this.player.getYAxis());
        this.player.updatePosition();
        this.database.positionCheck(this.player.getXAxis(), this.player.getYAxis());
    }

    private void printFinalResult() {
        if (this.moves == 0) {
            System.out.println("YOU LOSE");
        }
    }
}
