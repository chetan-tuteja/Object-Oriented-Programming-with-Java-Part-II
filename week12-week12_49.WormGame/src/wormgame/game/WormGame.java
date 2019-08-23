package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.gui.Updatable;
import wormgame.domain.*;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm gameWorm;
    private Apple gameApple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        this.gameWorm = new Worm((width / 2), (height / 2), Direction.DOWN);
        this.gameApple = new Apple(new Random().nextInt(width), new Random().nextInt(height));

        while (gameWorm.runsInto(gameApple)) {
            this.gameApple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
        }

        addActionListener(this);
        setInitialDelay(2000);

    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.gameWorm.move();
        Piece wormHead = gameWorm.getWormHead();

        if (this.gameWorm.runsInto(gameApple)) {
            while (gameWorm.runsInto(gameApple)) {
                this.gameApple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
            }
            this.gameWorm.grow();
        } else if (this.gameWorm.runsIntoItself()) {
            continues = false;
        } else if (wormHead.getX() == this.width || wormHead.getX() < 0) {
            continues = false;
        } else if (wormHead.getY() == this.height || wormHead.getY() < 0) {
            continues = false;
        }

        updatable.update();
        super.setDelay(1000 / this.gameWorm.getLength());

        if (!continues) {
            return;
        }
    }

    public Worm getWorm() {
        return this.gameWorm;
    }

    public void setWorm(Worm worm) {
        this.gameWorm = worm;
    }

    public Apple getApple() {
        return this.gameApple;
    }

    public void setApple(Apple apple) {
        this.gameApple = apple;
    }

}
