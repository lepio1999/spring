package com.acorn.ex;

public class ExceptionTest0 {
	
	public static void main(String[] args) throws Exception {
		ExceptionTest0 ex = new ExceptionTest0();
		ex.method();
		System.out.println("정상종료");
	}
	
	public void method() throws Exception {
		
		//조건일때
		try {
			throw new Exception();
		}catch (Exception ex) {
			System.out.println("예외상황 인식하고 적절한 코드");
			throw ex; // 
		}
	}

}
