package com.jh.s2.constructor;

public class EngineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine engine = new Engine();
		System.out.println("객체 생성 후 대입하는 방법");
		engine.name = "v4";
		engine.fuel = "f4";
		engine.info();

	}

}
