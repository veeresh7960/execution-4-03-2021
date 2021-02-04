package com.xworkz.electricalshop.dto;

import java.util.Objects;

public class ElectricalShopDTO {
	private String name;
	private String location;
	private String ownerName;
	private long phoneNo;
	private int noOfWorkers;

	public ElectricalShopDTO() {

	}

	/**
	 * @param name
	 * @param location
	 * @param ownerName
	 * @param phoneNo
	 * @param noOfWorkers
	 */
	public ElectricalShopDTO(String name, String location, String ownerName, long phoneNo, int noOfWorkers) {
		super();
		this.name = name;
		this.location = location;
		this.ownerName = ownerName;
		this.phoneNo = phoneNo;
		this.noOfWorkers = noOfWorkers;
	}

	@Override
	public String toString() {
		return "ElectricalShopDTO [name=" + name + ", location=" + location + ", ownerName=" + ownerName + ", phoneNo="
				+ phoneNo + ", noOfWorkers=" + noOfWorkers + "]";
	}


	

	@Override
	public int hashCode() {
		return Objects.hash(location, name, noOfWorkers, ownerName, phoneNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			
		}
		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

}
