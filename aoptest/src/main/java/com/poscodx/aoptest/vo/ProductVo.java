package com.poscodx.aoptest.vo;

public class ProductVo {
	private String name;
	
	
	public ProductVo(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ProductVo] : name : "+name;
	}
	
	

}
