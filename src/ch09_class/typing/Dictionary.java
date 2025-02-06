package ch09_class.typing;

import java.util.ArrayList;

public class Dictionary {
	
	// 전역적으로 사용하는 상수 
	public static final int OPTION_STUDENT = 0; // 상수는 보통 대문자로
	public static final int OPTION_CODING_WORD = 1;
	public static final int OPTION_RANDOM = 2;
	
	// 타자연습 게임을 위한 단어 메소드
	public static ArrayList<String> makeWordList(int option){
		ArrayList<String> result = new ArrayList<>();
		if(option == OPTION_STUDENT) {
			//대문자 ctrl + shift + x
			//소문자 ctrl + shift + y
			result.add("Kang jisuk");
			result.add("Kim dorae");
			result.add("Kim byungjun");
			result.add("Kim seoyoung");
			result.add("Kim soyeon");
			result.add("Kim wonjin");
			result.add("Park jeongdan");
			result.add("Park jonguk");
			result.add("Song eunho");
			result.add("Shin mijung");
			result.add("Lee yeseong");
			result.add("Lee yeeun");
			result.add("Jung jina");
			result.add("Choi boseok");
			result.add("Han sujeong");
		}else if(option == OPTION_CODING_WORD) {
			result.add("class");
			result.add("if");
			result.add("break");
			result.add("else");
		}else if(option == OPTION_RANDOM) {
			// 랜덤 알파벳 6자리로 단어 생성
			String [] alphabet = "qwertyuiopasdfghjklzxcvbnm".split("");
			// 10개 담기
			for(int i = 0 ; i < 10; i++) {
				String word ="";
				for(int j = 0 ; j < 6; j ++) {
					int idx =  (int) (Math.random() * alphabet.length);
					word += alphabet[idx];
				}
				result.add(word);
			}
		}
		return result;
	}

}
