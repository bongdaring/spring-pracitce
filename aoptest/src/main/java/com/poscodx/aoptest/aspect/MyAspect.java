package com.poscodx.aoptest.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	// point cut
	// 메소드 풀네임을 적어줘야 함 (throws까지)
	// 처음 메소드는 리턴타입
	@Before("execution(public com.poscodx.aoptest.vo.ProductVo com.poscodx.aoptest.service.ProductService.find(String))")
	public void adviceBefore() {
		System.out.println("---- Before Advice ----");
	}
	
	// join point?
	// 접근제어자는 생략 가능(public)
	// 리턴타입 * 은 리턴 다 가능
	@After("execution(* com.poscodx.aoptest.service.ProductService.find(String))")
	public void adviceAfter() {
		System.out.println("---- After Advice ----");
	}
	
	@AfterReturning("execution(* com.poscodx.aoptest.service.ProductService.find(String))")
	public void adviceAfterReturning() {
		System.out.println("---- AfterReturning Advice ----");
	}
	
	// 모든 패키지의 ProductService => * *..*.ProductService
	// 모든 파라미터의 find => find(..)
	// 예외처리인 듯
//	@AfterThrowing(value="execution(* *..controller.*.*(..))", throwing = "ex")
	@AfterThrowing(value="execution(* *..*.ProductService.find(..))", throwing = "ex")
	public void adviceAfterThrowing(Throwable ex) {
		System.out.println("---- AfterThrowing Advice:"+ ex +" ----" );
	}
}
