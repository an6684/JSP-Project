package wordview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WordBookView {
	
	private Scanner scanner=new Scanner(System.in);

	public int getMenu() {
		int choice=0;
		//메뉴 보이기
		System.out.println("| 메뉴를 선택해 주세요.	|");
		System.out.println("| 1. 단어 등록		|");
		System.out.println("| 2. 단어 삭제		|");
		System.out.println("| 3. 등록된 단어 보기	|");
		System.out.println("| 4. 단어 시험		|");
		System.out.println("| 5. 종료			|");
		System.out.println("╰╼|═══════════════════|╾╯");
		//메뉴 선택 받기
		try {
			System.out.println();
			System.out.print("메뉴 선택: ");
			choice=scanner.nextInt(); //정수가 아닌 문자열을 입력할 경우
		} catch (InputMismatchException e) {
			System.out.println("눈을 다시 뜨고 메뉴에 있는 번호를 선택하세요.");
			scanner.nextLine(); //입력 버퍼 비우기
		}
		return choice;
	}
	
}
