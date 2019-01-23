package cs1302.ce06.impl;

import cs1302.ce06.contract.Drivable;

public class Car implements Drivable {
    private double speed; // in mph
    private double maxSpeed; // in mph
        
    public Car(double maxSpeed) {
	speed = 0;
	if(maxSpeed >= 0) {
	    this.maxSpeed = maxSpeed;
	} // if
    } //Car
    
    public boolean speedUp(double amount) {
	boolean success = false;
	if(speed + amount <= maxSpeed) {
	    speed += amount;
	    success = true;
	} // if
	return success;
    } // speedUp

    public boolean slowdown(double amount) {
	boolean success = false;
	if(speed - amount >= 0) {
	    speed -= amount;
	    success = true;
	}
	return success;
    } // slowDown
    
    public String toString() {
	return String.format("Car(speed: %.2f, maxspeed: %.2f)", speed, maxSpeed);
    }
} // Car
