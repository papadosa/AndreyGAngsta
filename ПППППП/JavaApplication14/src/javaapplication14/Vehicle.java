/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author Student
 */
public class Vehicle {

    private int passengers;
    private int fuelcar;
    private int mpg;
    private boolean bool;
    private int range;

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public boolean getInfo(int range) {
        if (getFuelcar() * getMpg() <= range) {
            return false;
        } else {
            return true;
        }
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getPassenger() {
        return passengers;
    }

    public void setPassenger(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcar() {
        return fuelcar;
    }

    public void setFuelcar(int fuelcar) {
        this.fuelcar = fuelcar;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public Vehicle(int passengers, int fuelcar, int mpg) {
        this.passengers = passengers;
        this.fuelcar = fuelcar;
        this.mpg = mpg;
    }
}
