package com.poscodx.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	// 메소드 전에 실행
	// point cut
	// 메소드 풀네임을 적어줘야 함 (throws까지)
	// 처음 메소드는 리턴타입
	@Before("execution(public com.poscodx.aoptest.vo.ProductVo com.poscodx.aoptest.service.ProductService.find(String))")
	public void adviceBefore() {
		System.out.println("---- Before Advice ----");
	}
	
	// 메소드 실행 수에 실행
	// join point?
	// 접근제어자는 생략 가능(public)
	// 리턴타입 * 은 리턴 다 가능
	@After("execution(* com.poscodx.aoptest.service.ProductService.find(String))")
	public void adviceAfter() {
		System.out.println("---- After Advice ----");
	}
	
	// 메소드 리턴 후 실행
	@AfterReturning("execution(* com.poscodx.aoptest.service.ProductService.find(String))")
	public void adviceAfterReturning() {
		System.out.println("---- AfterReturning Advice ----");
	}
	
	// 모든 패키지의 ProductService => * *..*.ProductService
	// 모든 파라미터의 find => find(..)
	// 예외처리인 듯
//	@AfterThrowing(value="execution(* *..controller.*.*(..))", throwing = "ex")
	@AfterThrowing(value="execution(* *..*.*.*(..))", throwing = "ex")
//	@AfterThrowing(value="execution(* *..*.ProductService.find(..))", throwing = "ex")
	public void adviceAfterThrowing(Throwable ex) {
		System.out.println("---- AfterThrowing Advice:"+ ex +" ----" );
	}
	
	// Aroud : after + before (기존 before, after보다 먼저 실행/나중에 실행 됨)
	// return 필요
	@Around("execution(* *..*.ProductService.*(..))")
	public Object adviceAround(ProceedingJoinPoint pjp) throws Throwable{
		/* before */
		System.out.println("---- Around(before) Advice ----");
		
		/* Point Cut Method 실행 */
		// find의 첫번째 파라미터를 "Camera"로 변경
//		Object[] params = {"Camera"};
		// 타켓팅 하고 있는 point cut? join point? 메소드 실행?
		// 예외도 던짐
		Object result = pjp.proceed();
		
		/* after */
		System.out.println("---- Around(after) Advice ----");
		
		return result;
	}
}
