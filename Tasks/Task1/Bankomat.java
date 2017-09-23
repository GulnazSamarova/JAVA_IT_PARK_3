import java.util.Scanner;
class Bankomat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int x = scanner.nextInt();
		
		int FiveThousand = x / 5000;
		int OneThousand = ( x  - FiveThousand * 5000)/1000;
		int FiveHundred =  (x - FiveThousand * 5000 - OneThousand * 1000) / 500;
		int OneHundred =  (x - FiveThousand * 5000 - OneThousand * 1000 - FiveHundred * 500) / 100;
		int Fifty =  (x - FiveThousand * 5000 - OneThousand * 1000 - FiveHundred * 500
		                   - OneHundred * 100) / 50;
		int Ten =  (x - FiveThousand * 5000 - OneThousand * 1000 - FiveHundred * 500
		                   - OneHundred * 100 - Fifty * 50) / 10;
		int Five =  (x - FiveThousand * 5000 - OneThousand * 1000 - FiveHundred * 500
		                   - OneHundred * 100 - Fifty * 50 - Ten * 10) / 5;
		int Two =  (x - FiveThousand * 5000 - OneThousand * 1000 - FiveHundred * 500
		                   - OneHundred * 100 - Fifty * 50 - Ten * 10 - Five * 5) / 2;
		int One =  (x - FiveThousand * 5000 - OneThousand * 1000 - FiveHundred * 500
		                   - OneHundred * 100 - Fifty * 50 - Ten * 10 - Five * 5 - Two*2) / 1;



		System.out.println(+ x +  " содержит: "  + FiveThousand + " - 5000 купюр, " + OneThousand + " - 1000 купюр, " + 
		FiveHundred + " - 500 купюр, " + OneHundred + " - 100 купюр, " + Fifty + " - 50 купюр, " + Ten + " - 10 купюр, "
		+ Five + " - 5 монет, " + Two + " - 2 монет, " + One + " - 1 монет ");
	}
}