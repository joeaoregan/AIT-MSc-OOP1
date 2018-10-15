/*
 * Chapter 9: Interfaces - S26
 * 15/10/2018
 * A ProductDAO interface that inherits all three interfaces
 */
package com.mase.interfaces;

public class ProductDB implements ProductDAO {

	@Override
	public Product getProduct(String code) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public String getProductsString() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean addProduct(Product p) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean updateProduct(Product p) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean deleteProduct(Product p) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}