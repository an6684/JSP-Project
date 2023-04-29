package wordviewoutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import wordview.WordBookView;

public class WordViewCaseOne {
	private Scanner sc=new Scanner(System.in);
	private Map<String, String> myWords=new HashMap<>(); //영어 단어와 그 뜻을 저장하는 Map 생성
	private WordBookView wordBookView=new WordBookView();

	//	public int getWordsCount
	public void wordCaseOne() {
		//1번 선택시 실행
		//사용자로부터 단어와 그 뜻을 입력받아서 Map에 추가
		while(true) {
			System.out.println("\n등록할 영어 단어를 입력하세요.(메뉴로 가려면 0 입력)");
			System.out.print("단어 입력: ");
			String word=sc.nextLine().trim();
			if(word.equals("0")) {
				break;
			}else {
				try {
					if(!word.matches("^[a-z]*$")||word.matches("^[가-힣]*$")) { //영소문자가 아닐 경우
						throw new IllegalArgumentException("\n영소문자로만 입력할 수 있습니다.");
					}else if(myWords.containsKey(word)) { //이미 저장되어 있는 영어 단어일 경우
							throw new IllegalArgumentException("\n이미 저장되어 있는 단어 입니다.");
					}else {
						System.out.print("단어의 뜻 입력: ");
						String meaning=sc.nextLine().trim();				
						getMyWords().put(word, meaning); //저장
						System.out.println();
						System.out.println("'"+word+"' 단어를 추가했습니다.");
					}
				} catch (IllegalArgumentException e) {
					//예외 처리 코드
					System.out.println(e.getMessage());
				}
			}
			
		}
		
	}
	
	public WordViewCaseOne() {
		this.myWords=myWords;
	}
	
	public Map<String, String> getMyWords() {
		return myWords;
	}

}

