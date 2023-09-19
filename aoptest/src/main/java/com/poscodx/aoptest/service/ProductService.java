package com.poscodx.aoptest.service;

import org.springframework.stereotype.Service;

import com.poscodx.aoptest.vo.ProductVo;

@Service
public class ProductService {
	
	public ProductVo find(String keyword) throws RuntimeException{
		ProductVo vo = new ProductVo(keyword);
//		if(1-1==0) {
//			// Exception : checked exception (코딩할 때도 예외처리)
//			// RuntimeException : 실행할 때만 예외를 던져라 (코딩할 때 말고)
//			throw new RuntimeException("ProductService.find() Exception");
//			
//		}
		return vo;
	}

}
