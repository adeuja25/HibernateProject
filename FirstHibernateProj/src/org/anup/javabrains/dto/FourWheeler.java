package org.anup.javabrains.dto;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Car")
public class FourWheeler extends Vehicle {
	
	private String SteeringWheel;

	public String getSteeringWheel() {
		return SteeringWheel;
		
	}

	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}

	
}
