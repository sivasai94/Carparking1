package com.example.demo.dto;

import javax.validation.constraints.NotEmpty;

public class ParkingDto {

	@NotEmpty(message="vehicle number cannot be empty")
	private int vehicleNo;
	
	@NotEmpty(message="Coustomer name must be told")
	private String coustomerName;
	
	@NotEmpty(message="parking code needs to be filled")
	private int parkingCode;

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getCoustomerName() {
		return coustomerName;
	}

	public void setCoustomerName(String coustomerName) {
		this.coustomerName = coustomerName;
	}

	public int getParkingCode() {
		return parkingCode;
	}

	public void setParkingCode(int parkingCode) {
		this.parkingCode = parkingCode;
	}

}
