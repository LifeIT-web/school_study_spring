package aop_06;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect_6 {
	
	@Pointcut("execution(* runSomething())")
	private void iampc() {
		
	}
	
	@Before("iampc()")
	public void before(JoinPoint jointPoint) {
		System.out.println("얼굴 인식 : 문을 열라~~~");
	}
	
	@After("iampc()")
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("나님이 나갔습니다. 문을 잠그세여 ~~~~~~~~~");
	}
	
}
