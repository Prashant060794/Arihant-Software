package com.arihant.bio.abesoft.model;

public class Customer {
	private String id;
	private String name;
	private String address;
	private String phoneNo;
	private String RSTNo;
	private String receiptNo;
	private String vehicleNo;
	private MaterialCategory materialCategory;
	
	public String getId() {
		return id;
	}
	
	public String getRSTNo() {
		return RSTNo;
	}

	public void setRSTNo(String rSTNo) {
		RSTNo = rSTNo;
	}

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public MaterialCategory getMaterialCategory() {
		return materialCategory;
	}
	public void setMaterialCategory(MaterialCategory materialCategory) {
		this.materialCategory = materialCategory;
	}

}
