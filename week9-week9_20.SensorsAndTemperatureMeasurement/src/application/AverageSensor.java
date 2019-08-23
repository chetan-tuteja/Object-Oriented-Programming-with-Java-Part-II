/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Chetan Tuteja
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> list;
    private List<Integer> readings;

    public AverageSensor() {
        this.list = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        this.list.add(additional);
    }

    @Override
    public boolean isOn() {
        boolean temp = true;
        for (Sensor i : this.list) {
            if (!i.isOn()) {
                temp = false;
            }
        }
        return temp;
    }

    @Override
    public void on() {
        for (Sensor i : this.list) {
            i.on();
        }
    }

    @Override
    public void off() {
        for (Sensor i : this.list) {
            i.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn() || this.list.isEmpty()) {
            throw new IllegalStateException();
        }
        int avg = 0;
        for (Sensor i : this.list) {
            avg += i.measure();
        }
        avg = avg / this.list.size();
        this.readings.add(avg);
        return avg;
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
