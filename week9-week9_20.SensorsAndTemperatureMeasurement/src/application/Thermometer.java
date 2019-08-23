/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Chetan Tuteja
 */
import java.util.Random;

public class Thermometer implements Sensor {

    private Random random = new Random();
    private boolean value;

    public Thermometer() {
        this.value = false;
    }

    @Override
    public boolean isOn() {
        return this.value;
    }

    @Override
    public void on() {
        this.value = true;
    }

    @Override
    public void off() {
        this.value = false;
    }

    @Override
    public int measure() {
        if (isOn()) {
            return (random.nextInt(61) - 30);
        } else {
            throw new IllegalStateException();
        }
    }
}
