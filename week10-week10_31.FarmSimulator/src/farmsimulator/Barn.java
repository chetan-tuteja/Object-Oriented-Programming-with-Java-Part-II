/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.*;

/**
 *
 * @author Chetan Tuteja
 */
public class Barn {
    
    private BulkTank tank;
    private MilkingRobot robo;
    
    public Barn(BulkTank tank) {
        this.tank = tank;
    }
    
    public BulkTank getBulkTank() {
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robo = milkingRobot;
        this.robo.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow) {
        if (this.robo == null) {
            throw new IllegalStateException();
        } else {
            this.robo.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        if (this.robo == null) {
            throw new IllegalStateException();
        } else {
            for (Cow i : cows) {
                this.robo.milk(i);
            }
        }
    }
    
    public String toString() {
        return this.tank.toString();
    }
}
