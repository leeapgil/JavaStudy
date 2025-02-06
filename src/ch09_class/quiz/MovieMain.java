package ch09_class.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		//movieDB는 싱글톤 패턴 -> 외부에서 new 할 수 없음, 내부에서 생성된 하나의 인스턴스만 사용
		MovieDB db1 = MovieDB.getInstance();
		MovieDB db2 = MovieDB.getInstance();
		System.out.println(db1);
		System.out.println(db2); // 객체의 주소가 같음(동일한 객체)
//		MovieDB test = new MovieDB(); <-- 오류남 
		
		// 영화 맞추기 게임
		// 1.명대사 출력 맞추면 score +3
		// 틀리면 2.배우 출력        +2
		// 틀리면 3.영화명 초성 출력   +1
		ArrayList<Movie> movieList = db1.getMovieList();
		System.out.println(movieList);
		//순서를 램덤하게 섞음
		Collections.shuffle(movieList);
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("=== 영화 맞추기 게임 ===");
		for(int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i).getQuotes());
			System.out.print(">>>");
			String answer = scan.nextLine();
			if(answer.equals(movieList.get(i).getTitle())) {
				System.out.println("정답 입니다.!!");
				score +=3;
				continue; // 다음 문제로 넘김
			}
			System.out.println(movieList.get(i).getActors());
			System.out.print(">>>");
			answer = scan.nextLine();
			if(answer.equals(movieList.get(i).getTitle())) {
				System.out.println("정답 입니다.!!");
				score +=2;
				continue;
			}
			// 영화 초성 
			System.out.println(movieList.get(i).getWord());
			System.out.print(">>>");
			answer = scan.nextLine();
			if(answer.equals(movieList.get(i).getTitle())) {
				System.out.println("정답 입니다.!!");
				score +=1;
				continue;
			}
			System.out.println("땡 ! 틀렸습니다. 다음 문제로");
		}
		System.out.println("점수는 :" +  score);
		
	}

}
