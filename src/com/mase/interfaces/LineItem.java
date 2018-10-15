/*
 * Chapter 9: Interfaces - S46
 * A LineItem class that implements the Cloneable interface
 * 15/10/2018
 */
package com.mase.interfaces;

public class LineItem implements Cloneable{
	private ProductClone product;
	private int quantity;
	private double total;

	//LineItem(ProductClone product, int quantity, double total) {
	LineItem(ProductClone product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		LineItem li = (LineItem) super.clone();
		ProductClone p = (ProductClone) product.clone();
		li.setProduct(p);
		return li;
	}

	public ProductClone getProduct() {
		return product;
	}

	public void setProduct(ProductClone product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
