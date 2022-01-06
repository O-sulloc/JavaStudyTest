package com.jh.s2.constructor;

public class Car {
	String brand;
	String company;
	int cc;
	String color;

	public Car() {// 생성자도 메서드임.. 조금 턱별한.. 그래서 this 사용 가능
//		System.out.println("생성자 실행");
//		this.company = "kia";
//		this.brand = "k9";
//		this.cc = 5000;
//		this.color = "black";
//		System.out.println("생성자 종료");

		this("k9");
		// k9이 브랜드잖아. 즉 밑에서 브랜드만 바꾼 메서드를 불러온거임 ㅇㅇ. 또다른 생성자를 호출한거임.
	}

	public Car(String brand) {
//		this.brand = brand;
//		this.company = "kia";
//		this.cc = 5000;
//		this.color = "black";

		this(brand, "black");
		// 이렇게하면 밑에 메서드를 호출한거임 ㅇㅇ
		// 근데 brand만 바꾸고 컬러는 기본값은 black으로 하겠다는거지. 난 브랜드만 바구고 싶다는거지.
	}

	public Car(String brand, String color) {
		// string color만하면 위에 string brand랑 타입이 string로 겹쳐서 에러남
		// 그러니까 개수를 바꾸기 위해서 brand를 추가해서 2개로 만들어~
//		this.brand = brand;
//		this.company = "kia";
//		this.cc = 5000;
//		this.color = color;

		this(brand, color, 5000);
		// 밑에 메서드 호출할거임. ㅇㅇ
		// 근데 브랜드 컬러만 바꿀거고 cc는 그대로 5000으로 하고 싶거든~
		// 결론: 이렇게 함으로써 코드를 줄일 수 있다는거지~
	}

	public Car(String brand, String color, int cc) {
		this.brand = brand;
		this.company = "kia";
		this.cc = cc;
		this.color = color;
	}

	public void info() { // 멤버 메서드
		System.out.println("멤버 메서드");
		System.out.println(this.brand);
		System.out.println(this.company);
		System.out.println(this.cc);
	}

}
