package aop_05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect_5 {

	
	/*
	 * @Aspect : 클래스에 @Aspect 어노테이션을
	 * 			추가하여 Aspect 를 생성한다. @Aspect 설정이
	 * 			되어 있는 경우 Spring 은 자동적으로
	 * 			@Aspect 어노테이션을 포함한 클래스를 검색하여
	 * 			Spring AOP 설정에 번영한다. 
	 */
	
	@Pointcut("execution(* runSomething())")
	private void iampc() {
		// 여긴 무엇을 만들어도 의미없음
	}
	
	@Before("iampc()")
	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 인식 문을 개방 ~~~~~~~");
	}
	
	@After("iampc()")
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("너님은 나갔습니다. 잠그세요 ~~~~");
	}
}
