package aop_03;

import org.aspectj.lang.JoinPoint;

public class MyAspect_1 {

	public void before(JoinPoint joinpoint)
	{
		System.out.println("얼굴 확인 문 열어!!!!!");
	}
	
	/*
	 *  Advice : Advice 는 pointcut 을 적용할 로직, 즉 메소드를 의미하는데
	 *  		여기에 언제라는 개념까지 포함하고 있다. 결국 Advice는 pointcut에
	 *  		언제 무엇을 적용할지 정의한 메소드이다.
	 *  
	 *  Aspect : AOP 에서 Aspect 는 여러개의 Advice 와 여러개의 pointcut 의
	 *  		결합체를 의미하는 용어이다.
	 *  
	 *  		수식 표현 => Aspect = Advice + pointcut
	 *  
	 *  Advice 는 언제(When), 무엇을(What)을 의미하는 것이었다.
	 *  
	 *  pointcut 는 어디에(Where) 를 의미하는 것이다. 결국
	 *  Aspect 는 When + Where + What(언제, 어디에, 무엇을) 이 된다.
	 * */
}
