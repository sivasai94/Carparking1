package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Parking {
	
	@Id
	@Column(name="vehicleNo")
	private int vehicleNo;
	
	@Column(name="customerName")
	private String customerName;
	
	@Column(name="parkingCode")
	private int parkingCode;
	
	public int getVehicleNo() {
		return vehicleNo;
	}
	
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getParkingCode() {
		return parkingCode;
	}
	public void setParkingCode(int parkingCode) {
		this.parkingCode = parkingCode;
	}
	
	
	
	public Parking(int vehicleNo, String customerName, int parkingCode) {
		super();
		this.vehicleNo = vehicleNo;
		this.customerName = customerName;
		this.parkingCode = parkingCode;
	}

	public Parking() {
		
	}
	@Override
	public String toString() {
		return "Parking [vehicleNo=" + vehicleNo + ", customerName=" + customerName + ", parkingCode=" + parkingCode
				+ "]";
	}

}
