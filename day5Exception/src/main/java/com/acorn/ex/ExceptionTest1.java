package com.acorn.ex;

public class ExceptionTest1 {

	
	//매서드
	public int add(int num1, int num2) throws Exception {
		if(num1 <0 || num2 <0) {
			throw new Exception("0보다 커야함");
		}
		return num1+num2;
	}
	
	//실행
	public static void main(String[] args) {
		
		ExceptionTest1 ex = new ExceptionTest1();
		try {
			int result = ex.add(5, 4);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("음수입니다");
			e.printStackTrace();
		}
		System.out.println("정상종료");
	}

}
