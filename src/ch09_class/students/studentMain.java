package ch09_class.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class studentMain {
	public static void main(String[] args) {
		Student stu = new Student("동길");
		Student stu2 = new Student("길동");
		Student stu3 = new Student();
		System.out.println(stu);
		stu.setName("길수");
		System.out.println(stu.getName());
		System.out.println(stu2.getName());

		stu.setKor(90);
		System.out.println(stu);
		stu.setEng(70);
		System.out.println(stu);
		stu.nm();
		Student.check(); // static 정적 메서드는 .으로 호출 가능, 개별적으로 사용 가능
//		Student.nm(); 인스턴스 메소드, 인스턴스화 이후 사용가능

		ArrayList<Student> classMate = new ArrayList<>();
		classMate.add(stu);
		classMate.add(stu2);
		classMate.add(new Student("닉",100, 90, 80));
		classMate.add(new Student("주디",80, 90, 80));
		for (Student st : classMate) {
			System.out.println(st);
		}
		// 버블정렬
		for(int k = 0; k < classMate.size() -1; k++) {
			for(int i = 0 ; i < classMate.size() -1 ; i ++) {
				// i < i+1 내림
				// i > i+1 오름
				if(classMate.get(i).getAvg() > classMate.get(i+1).getAvg()) {
					Student temp = classMate.get(i);       //임시 공간에 
					classMate.set(i, classMate.get(i+1));  //i번째와 순서 바꾸기
					classMate.set(i+1, temp);
				}
			}
		}
		System.out.println(classMate);
		// Collections.sort 객체 사용
		// -1 : 두 객체의 순서를 바꾸지 않음
		//  1 : 두 객체의 순서를 바꿈
		//  0 : 유지 
		Collections.sort(classMate, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				double diff = o2.getAvg() - o1.getAvg();
				if(diff < 0) {
					return -1;
				}
				return 1; // 차이가 0보다 크면 o2가 더 크기 때문에 순서를 바꿈
			}
		});
		System.out.println(classMate);
		
		
		
		
		
		
		
		
		
	}
}
