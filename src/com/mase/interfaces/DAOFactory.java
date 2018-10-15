/*
 * Chapter 9: Interfaces - S33
 * DAOFactory class
 * 15/10/2018
 */
package com.mase.interfaces;

public class DAOFactory {
	public static ProductDAO getProductDAO() {
		ProductDAO pDAO = new ProductTextFile();
		return pDAO;
	}
}
