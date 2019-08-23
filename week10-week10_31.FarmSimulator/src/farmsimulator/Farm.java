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
public class Farm implements Alive {
    
    private String name;
    private Barn barn;
    private List<Cow> herd;
    
    public Farm(String name, Barn barn) {
        this.name = name;
        this.barn = barn;
        this.herd = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow) {
        this.herd.add(cow);
    }
    
    public String getOwner() {
        return this.name;
    }
    
    public String toString() {
        String result = "";
        result += "Farm Owner: " + this.name + "\n";
        result += "Barn bulk tank: " + this.toString() + "\n";
        if (this.herd.isEmpty()) {
            result += "No cows.";
        } else {
            result += "Animals:\n";
            for (Cow i : this.herd) {
                result += "        " + i.toString() + "\n";
            }
        }
        return result;
    }
    
    public void liveHour() {
        for (Cow i : this.herd) {
            i.liveHour();
        }
    }
    
    public void manageCows() {
        for (Cow i : this.herd) {
            this.barn.takeCareOf(i);
        }
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }
    
}
