/*
 * Chapter 9: Interfaces - S34
 * ProductTextFile class
 * 15/10/2018
 */
package com.mase.interfaces;

public class ProductTextFile implements ProductDAO {


	public ProductTextFile() {
		// init fields
	}

	@Override
	public Product getProduct(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProductsString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}
}
