package com.mase.petmain;

public class NameableImpl implements Nameable{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
