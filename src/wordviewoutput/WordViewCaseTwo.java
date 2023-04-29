package wordviewoutput;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordViewCaseTwo {
	private static WordViewCaseOne caseOne;
    static Scanner scr = new Scanner(System.in);
	
	public WordViewCaseTwo(WordViewCaseOne caseOne) {
		this.caseOne=caseOne;
	}
	
	public static void wordCaseTwo() {
		//caseOne의 Map요소 호출
		Map<String, String> myWords = caseOne.getMyWords();
		
        while (true) {
			//등록된 단어가 없을 때 메뉴로 이동
			if(myWords.size()==0) {
				System.out.println("등록된 단어가 없습니다..");
				break;
			}else {
				System.out.println();
				System.out.println("==========단어 목록==========");
				for (Map.Entry<String, String> entry : myWords.entrySet()) {
					String key = entry.getKey();
					String value = entry.getValue();
					System.out.println(key + " = " + value);
				}
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println();
				System.out.println("삭제하고 싶은 단어를 입력하세요.(메뉴로 가려면 0 입력)");
				System.out.print("입력: ");
				String del = scr.nextLine();
				if (del.equals("0")) {
					break;
				} else {
					if (myWords.containsKey(del) == true) {
						myWords.remove(del);
						System.out.println("\n입력된 단어 '"+del+"'이(가) 삭제되었습니다.\n");
					} else {
						System.out.println();
						System.out.println(del+"은(는) 등록되지 않는 단어입니다.");
					}
				}
				
			}
        }
	}
	
}
