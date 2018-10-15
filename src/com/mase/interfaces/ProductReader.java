/*
 * Chapter 9: Interfaces - S23
 * 15/10/2018
 * A ProductReader interface
 */
package com.mase.interfaces;

public interface ProductReader {
	Product getProduct(String code);
	String getProductsString();
}
