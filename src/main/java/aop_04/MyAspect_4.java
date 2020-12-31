package aop_04;

import org.aspectj.lang.JoinPoint;

public class MyAspect_4 {

	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 확인 : 문을 개방~~~~~~~~~~");
		
	}
	
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println(" 님이 나갔습니다. 문을 영원히 잠그세요");
	}
}
