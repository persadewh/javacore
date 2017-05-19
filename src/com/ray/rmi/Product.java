package com.ray.rmi;

import java.io.Serializable;

/**
 * @author : ray
 * @date : 2017年5月15日
 */
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -669316538681108592L;
	private String description;
	private double price;
	private Warehouse location;
	
	
	public Product(String description , double price)
	{
		this.description = description;
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Warehouse getLocation() {
		return location;
	}
	public void setLocation(Warehouse location) {
		this.location = location;
	}
	
	
	
}
