package org.crud.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Itemspm {
	@Id
	private int itemno;
	private String price;
	private String floor;
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
}
