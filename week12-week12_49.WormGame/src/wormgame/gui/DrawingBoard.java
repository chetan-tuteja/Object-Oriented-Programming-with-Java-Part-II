/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.*;
import javax.swing.*;
import wormgame.game.WormGame;
import wormgame.domain.*;

/**
 *
 * @author Chetan Tuteja
 */
public class DrawingBoard extends JPanel implements Updatable {

    private WormGame game;
    private int pieceLength;

    public DrawingBoard(WormGame game, int pieceLength) {
        this.game = game;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.setColor(Color.BLACK);
        for (Piece i : this.game.getWorm().getPieces()) {
            graphics.fill3DRect(i.getX() * pieceLength, i.getY() * pieceLength, pieceLength, pieceLength, true);
        }
        graphics.setColor(Color.red);
        graphics.fillOval(game.getApple().getX() * pieceLength, game.getApple().getY() * pieceLength, pieceLength, pieceLength);

    }

    @Override
    public void update() {
        super.repaint();
    }
}
