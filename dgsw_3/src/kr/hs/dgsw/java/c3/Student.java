package kr.hs.dgsw.java.c3;

public class Student {
	int schoolNumber;
	String name;
	String gender;
	int age;
	
	public Student() {
	}

	public Student(String name) {
		this.name = name;
	}
	
	public Student(int schoolNumber)
	{
		this.schoolNumber = schoolNumber;
	}
	public void study() {
		System.out.println(name + "이(가) 공부를 합니다.");
	}
	
	public void play() {
		
	}
	
	public static void main(String[] args) {
		Student giwon = new Student();
		Student seojin = new Student();
		Student minwoo = new Student();
		
		giwon.name = "기원";
		giwon.age = 18;
		giwon.gender = "M";
		giwon.schoolNumber = 12;
		
		seojin.name = "서진";
		seojin.age = 18;
		seojin.gender = "M";
		seojin.schoolNumber = 3;
		
		//minwoo.name = "민우";
		
		giwon.study();
		minwoo.study();
		
		
	}
	
}
