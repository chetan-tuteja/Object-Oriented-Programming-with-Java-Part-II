/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
public class Calculator {

    private Reader reader;
    private int count;

    public Calculator() {
        this.reader = new Reader();
        this.count = 0;
    }

    public void start() {
        while (true) {
            System.out.println("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
            }
            if (command.equals("difference")) {
                difference();
            }
            if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }

    private int[] readValues() {
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        int[] ret = {value1, value2};
        return ret;
    }

    private void sum() {
        int[] value = readValues();
        System.out.println("sum of the values " + (value[0] + value[1]));
        count++;
    }

    private void difference() {
        int[] value = readValues();
        System.out.println("difference of the values " + (value[0] - value[1]));
        count++;
    }

    private void product() {
        int[] value = readValues();
        System.out.println("product of the values " + (value[0] * value[1]));
        count++;
    }

    private void statistics() {
        System.out.println("calculations done " + this.count);
    }
}
