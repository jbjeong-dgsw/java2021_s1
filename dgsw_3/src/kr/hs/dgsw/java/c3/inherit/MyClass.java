package kr.hs.dgsw.java.c3.inherit;

public class MyClass {
	private String name;
	private int age;

	@Override
	public boolean equals(Object obj) {
		if (age == ((MyClass) obj).getAge()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "마이클래스 " + super.toString();
	}

	public String getName() {
		return name;
	}
	
	public String getName(String a) {
		return name + a;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		MyClass one = new MyClass();
		MyClass two = new MyClass();
		
		one.setAge(18);
		two.setAge(19);

		System.out.println(one.equals(two));

	}
}
