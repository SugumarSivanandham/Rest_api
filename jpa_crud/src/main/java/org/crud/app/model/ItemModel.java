package org.crud.app.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemModel")
public class ItemModel {
	
	@Id
	@Column(name = "item_id")
	private int item_id;
	private String item_name;
	private int quantity;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Itemspm ispm;
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Itemspm getIspm() {
		return ispm;
	}
	public void setIspm(Itemspm ispm) {
		this.ispm = ispm;
	}
	

}