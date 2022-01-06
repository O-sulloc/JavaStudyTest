package com.jh.s2.constructor;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		// 왼쪾은 변수 선언하는 부분 오른쪽은 생성하는 부분. =new 생성자 호출;
		Car car = new Car();

		car.info();

		Car car2 = new Car("k5");
		car2.info();

		Car car3 = new Car("yellow");
		car3.info();
	}

}
