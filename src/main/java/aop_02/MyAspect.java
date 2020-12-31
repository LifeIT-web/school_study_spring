package aop_02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	// 횡단 관심사 역할 
	@Before("execution(* runSomething())")
	public void before(JoinPoint joinpoint) {
		System.out.println("얼굴 인식 확인  : 문을 여시오");
	}
	
	/*
	 * execution(* runSomething()) => 접근 제한자는 무엇이라도 좋으며
	 * 리턴 타입도 무엇이라도 좋으며 모든 페키지 밑의 모든 클래스 안에
	 * 파라미터가 없으면 던져지는 예외가 있던 없던 이름이 runSomething() 인 
	 * 메소드를 pointcut 로 지정하라
	 * 
	 * pointcut 의 후보가 되는 모든 메소드들이 joinpoint 즉 Aspect 적용 이
	 * 가능한 지점이 된다.
	 * joinpoint 란 'Aspect' 적용이 가능한 모든 지점을 말한다.
	 */
}
