package com.servlet.elements;

public class LaptopDetails {
	private String laptopName;
	private String laptopBrand;
	private String laptopPrice;
	private String touchScreen;
	private String fastCharging;
	private String processor;
	private String ramSize;
	private String storageCapacity;
	

	public LaptopDetails(){
		super();
	}

	public LaptopDetails(String laptopName, String laptopBrand, String laptopPrice, String touchScreen,
			String fastCharging, String processor, String ramSize, String storageCapacity) {
		super();
		this.laptopName = laptopName;
		this.laptopBrand = laptopBrand;
		this.laptopPrice = laptopPrice;
		this.touchScreen = touchScreen;
		this.fastCharging = fastCharging;
		this.processor = processor;
		this.ramSize = ramSize;
		this.storageCapacity = storageCapacity;
		
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	public String getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(String laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	public String getTouchScreen() {
		return touchScreen;
	}

	public void setTouchScreen(String touchScreen) {
		this.touchScreen = touchScreen;
	}

	public String getFastCharging() {
		return fastCharging;
	}

	public void setFastCharging(String fastCharging) {
		this.fastCharging = fastCharging;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(String storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public String toString() {
//		return super.toString();
	     return "Laptop Details are{"+"LaptopName=" + laptopName +",laptopBrand" +laptopBrand+"laptopPrice"+laptopPrice+touchScreen+fastCharging+processor+ramSize+storageCapacity+'}';
	}      
 

}

