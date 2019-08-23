/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
public class Flight {

    private Airplane plane;
    private String depCode;
    private String destCode;

    public Flight(Airplane plane, String depCode, String destCode) {
        this.plane = plane;
        this.depCode = depCode;
        this.destCode = destCode;
    }

    public String toString() {
        return this.plane.toString() + " (" + this.depCode + "-" + this.destCode + ")";
    }
}
