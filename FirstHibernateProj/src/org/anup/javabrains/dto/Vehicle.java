package org.anup.javabrains.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity //tells it is a entity class
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="VEHICLE_TYPE",discriminatorType=DiscriminatorType.STRING	) // single table
public class Vehicle {
	
	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;
	
/*	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE) // if user is not found then what to do then do action
	private UserDetails user;*/
	
	/*@ManyToOne
	@JoinColumn(name="USER_ID")*/	
	/*@ManyToMany(mappedBy="vehicle")
	private Collection<UserDetails> userList = new ArrayList<>();
	
	public Collection<UserDetails> getUserList() {
		return userList;
	}
	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
	}
*/	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
}
