package wordviewoutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordViewCaseFour {
	private static WordViewCaseOne caseOne;
    static Scanner scr = new Scanner(System.in);
	
	public WordViewCaseFour(WordViewCaseOne caseOne) {
		this.caseOne=caseOne;
	}
	
	public static void wordCaseFour() {
		//caseOne의 Map요소 호출
		Map<String, String> myWords = caseOne.getMyWords();
		
        while (true) {
        	int a=0;
            System.out.println("\n1. 단어 시험 보기");
            System.out.println("0. 메뉴로 가기");
            try {
            	System.out.print("\n선택: ");
            	a = scr.nextInt();
			} catch (Exception e) {
				System.out.println("\n쓸데없는 호기심은 금물임니댜,,");
				System.out.println();
				scr.nextLine();
			}
            if (a == 1) {
                int count = 0;
                int totalCount = 0;
            	
            	//리스트 적용하여 랜덤하게 출력
                List<Map.Entry<String, String>> wordList = new ArrayList<>(myWords.entrySet());
                Collections.shuffle(wordList);
                
                //단어 시험 시작
                System.out.println();
    			System.out.println("총 "+myWords.size()+"문제");
    			System.out.println("영어 단어에 맞는 뜻을, 단어 뜻에 맞는 영어 단어를 입력하세요.\n");
                for (Map.Entry<String, String> entry : wordList) {
                	String que = entry.getKey();
                	String ans= entry.getValue();
                    Scanner scan = new Scanner(System.in);
                    System.out.println(ans);
                    System.out.print("정답 입력: ");
                    String answer = scan.nextLine();

                    if (answer.equals(que)) {
                    	System.out.println();
                        System.out.println("정답입니다.\n");
                        count++;
                        totalCount++;
                    } else {
                        System.out.println("틀렸습니다.  (답: " + que + ")\n");
                        totalCount++;
                    }
                }           
                
                System.out.println("\n<"+totalCount+" 문제 중 "+count+" 문제를 맞혔습니다.>\n");
                break;                
 
            } else if (a == 0) {
                break;
            } else {
                System.out.println("*1 또는 0만 입력해주세요*");
            }
        }
	}
	
}
