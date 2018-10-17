package model;

import java.util.Arrays;

public class Car {
	private Tire[] tires = new Tire[4];
	private Radio radio;
	public Tire[] getTires() {
		return tires;
	}
	public void setTires(Tire[] tires) {
		this.tires = tires;
	}
	public Radio getRadio() {
		return radio;
	}
	public void setRadio(Radio radio) {
		this.radio = radio;
	}
	@Override
	public String toString() {
		return String.format("Car [%s, %s]", 
		  Arrays.toString(tires), radio);
	}
	
	
}
