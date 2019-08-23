/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Chetan Tuteja
 */
public class ContainerHistory {

    private List<Double> list;

    public ContainerHistory() {
        this.list = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.list.add(situation);
    }

    public void reset() {
        this.list.clear();
    }

    @Override
    public String toString() {
        return this.list.toString();
    }

    public double maxValue() {
        if (this.list.isEmpty()) {
            return 0;
        }
        double temp = this.list.get(0);
        for (double i : this.list) {
            if (temp < i) {
                temp = i;
            }
        }
        return temp;
    }

    public double minValue() {
        if (this.list.isEmpty()) {
            return 0;
        }
        double temp = this.list.get(0);
        for (double i : this.list) {
            if (temp > i) {
                temp = i;
            }
        }
        return temp;
    }

    public double average() {
        if (this.list.isEmpty()) {
            return 0;
        }
        double temp = 0;
        for (double i : this.list) {
            temp += i;
        }
        return temp / this.list.size();
    }

    public double greatestFluctuation() {
        if (this.list.isEmpty() || this.list.size() == 1) {
            return 0;
        }
        double temp = Math.abs(this.list.get(0) - this.list.get(1));
        for (int i = 0; i < this.list.size(); i++) {
            if (i == this.list.size() - 1) {

            } else {
                double value = Math.abs(this.list.get(i) - this.list.get(i + 1));
                if (temp < value) {
                    temp = value;
                }
            }
        }
        return temp;
    }

    public double variance() {
        double temp = 0;
        for (double i : this.list) {
            temp += Math.pow((i - this.average()), 2);
        }
        return temp / (this.list.size() - 1);
    }
}
