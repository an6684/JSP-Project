package wordviewoutput;

import java.util.Map;

public class WordViewCaseThree {
	private WordViewCaseOne caseOne;
	
	public WordViewCaseThree(WordViewCaseOne caseOne) {
		this.caseOne=caseOne;
	}
	
	public void wordViewAll() {
		//caseOne의 Map요소 호출
		Map<String, String> myWords = caseOne.getMyWords();
	    //전체 단어 리스트 출력
		if (myWords.isEmpty()) {
	        System.out.println("등록된 단어가 없습니다.");
	    } else {
	    	System.out.println("•❅────────────✧단어 목록✧────────────❅•");
	        for (Map.Entry<String, String> entry : myWords.entrySet()) {
	            String key = entry.getKey();
	            String value = entry.getValue();
	            System.out.println(key + " = " + value);
	        }
			System.out.println("•❅──────────────✧❅✦❅✧──────────────❅•");
	    }
	}
	
}
