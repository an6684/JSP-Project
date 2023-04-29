package wordviewcontroller;

import java.util.Map;
import java.util.Scanner;

import wordview.WordBookView;
import wordviewoutput.WordViewCaseFour;
import wordviewoutput.WordViewCaseOne;
import wordviewoutput.WordViewCaseThree;
import wordviewoutput.WordViewCaseTwo;

public class WordCaseController {
	private Scanner sc=new Scanner(System.in);
	private WordBookView wordBookView=new WordBookView();
	private WordViewCaseOne caseOne = new WordViewCaseOne();
	private WordViewCaseTwo caseTwo = new WordViewCaseTwo(caseOne);
    private WordViewCaseThree caseThree = new WordViewCaseThree(caseOne); // caseOne 인스턴스 전달
	private WordViewCaseFour caseFour = new WordViewCaseFour(caseOne);
    
    
	//프로그램 실행
    public void runApp() {
		while(true) {
			Map<String, String> myWords = caseOne.getMyWords();
			
			//디폴트로 넣어놓은 단어
			myWords.put("student", "학생");
			myWords.put("person", "사람");
			myWords.put("apple", "사과");
			myWords.put("pizza", "피자");
			
			//현재 등록된 단어 수
			System.out.println("╭╼|═══════════════════|╾╮");
			System.out.println("|  현재 등록된 단어 수 : "+myWords.size()+"	|");
			System.out.println("╰╼|═══════════════════|╾╯");
			int choice=5;
			choice=wordBookView.getMenu();
			switch(choice) {
			case 1:
				caseOne.wordCaseOne();
				break;
				
			case 2:
				caseTwo.wordCaseTwo();
				break;
				
			case 3:
				caseThree.wordViewAll();
				break;
			
			case 4:
				caseFour.wordCaseFour();
				break;
				
			case 5:
				System.out.println("  　      ♡ ♡ ᕬ ᕬ ♡ ♡");
				System.out.println(" 　      + ♡ ( ⌯′-′⌯) ♡ +");
				System.out.println(" ┏━━━━♡━ U U━♡━━━━━━━━━━━┓");
				System.out.println("    ♡ 이용해 주셔서 감사합니다. ♡");
				System.out.println(" ┗━♡━━━━━━━━━♡━┛");
//				System.out.println("이용해 주셔서 감사합니다.");
				return;
				
			default:
				System.out.println("*1~5까지의 숫자만 입력하세요*");
			}				
			
		}
	}
}
