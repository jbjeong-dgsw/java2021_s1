package kr.hs.dgsw.java.c2.api;

public class MyClass<T, X> {

	private X age;

	private T name;

	public X getAge() {
		return age;
	}

	public void setAge(X age) {
		this.age = age;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

}
