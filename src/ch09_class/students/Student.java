package ch09_class.students;

import ch09_class.util.UtilClass;

/**
 * class Name 	: Student
 * Author	  	: SSAM
 * Created Date : 2025. 2. 5.
 * Version	  	: 1.0
 * Purpose	  	: [목적을 작성하세요]
 * Description	: class 기초
 */

public class Student {
	// 1.필드, 속성값
    // public : 공개, 프로젝트 어디서든 접근가능
	// private : 비공개, 현재 클래스 내에서만 접근
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	
	// 2.생성자 (class는 생성자를 정의하지 않아도 무조건 클래스명의 생성자가 있음.)
	// 단축키 shift + alt + s
	public Student(String name) {
		this.name = name; //this는 객체 자신을 의미함(this는 인스턴스화를 진행한 객체 자신)
		save();
	}
	public Student() {
	}
	// 생성자 오버로딩 
	// 해당 객체를 다양하게 만들 수 있음. 
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setAvg();
	}
	//부모의 기능을 재정의하는 기능
	//오버라이드 (부모에게 toString 메서드가 있음) 
	@Override // toString
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}

	// setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		setAvg();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		setAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		setAvg();
	}

	private void setAvg() {
		this.avg = UtilClass.weRound((kor + eng + math) / 3.0, 2);
		// this - 인스턴스화가 된 후에 변수
	}

	public void nm() {
		System.out.println(name + "입니다.");
	}

	private void save() {
		System.out.println(name + "등록됨");
	}

	public static void check() {
		System.out.println("student의 static method 클래스명.check로 호출가능");
	}
	public double getAvg() {
		return avg;
	}
	
	
	
}
