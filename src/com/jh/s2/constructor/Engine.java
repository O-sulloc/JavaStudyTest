package com.jh.s2.constructor;

public class Engine {
	String fuel = "f1";
	String name = "v1";

	{
		System.out.println("초기화 블럭");
		this.name = "v2";
		this.fuel = "f2";
	}

	public Engine() {
		System.out.println("생성자를 이용해서 초기화해보자");
		this.name = "v3";
		this.fuel = "f3";
	}

	public void info() {

		System.out.println(name); // v2가 나오지 않나? 당근이지.. 코딩은 밑으로 내려오면서 진행되는데. 나중에 쓰여진게 덮어씌어지겠지
		System.out.println(fuel);
	}
}
