import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("돈을 입력하시오: ");
		int su = sc.nextInt();
		int[] money = { 50000, 10000, 50000, 1000, 500, 100, 10, 5, 1 };
		//System.out.println("방갯수:" + money.length);

		//1st
//		for (int i = 0; i < money.length; i++) {
//			System.out.print(money[i] + "원권 : " + su / money[i] + "장" + "\n");
//			su = su % money[i];
//		}
		
		//2end
		for (int i = 0; i < money.length; i++) {
			int mok= su/money[i]; //몫
			int na= su%money[i]; //나머지
			System.out.println(money[i]+"원권:"+mok);
			su=na;
		}
		
	}
}



