
public class qweqw {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		String mo =  "\'Sep\'";
		String da= "\'22\'";
		System.out.print("//*[contains(@aria-label,"+mo+")]/div/p[text()="+da+"]");
		String month ="September 2024";
		if(month != "September 2025") {
			System.out.print("\n 1");
		}else {
			System.out.print("\n 2");
		}
		*/
	
		        String word = "\'December\'";
		        String year ="2024";
		        String cleanedmo = word.replace("'", "");
		        String firstThreeLetters = cleanedmo.substring(0, 3);
		        System.out.println("The first three letters are: " + firstThreeLetters);
		        
		        String word1 = "'December'";
		        String cleanedWord = word1.replace("'", "");
		        System.out.println("Cleaned word: " + cleanedWord);
		        String asda=cleanedWord +" "+ year;
		        System.out.print(asda);
		        if(cleanedmo.contains(firstThreeLetters)) {
		        	System.out.print("\nsadasdsa");
		        }
		}

		
		
		
	}
