/*
 * Chapter 9: Interfaces - S23
 * 15/10/2018
 * A ProductWriter interface
 */
package com.mase.interfaces;

public interface ProductWriter {
	boolean addProduct(Product p);
	boolean updateProduct(Product p);
	boolean deleteProduct(Product p);
}
