import java.util.Scanner;
//2.준과제
//입력받은 수를 소인수분해 해서그 결과를 각 줄에 3개씩 출력하기
public class Practice5 {
	public static void main(String[] args) {
//		int i,j,count;
//		for (i = 2; i <= 100; i++) {
//			count = 0;
//			for (j = 2; j < i; j++)
//				if(i%j==0) count+=1;
//			if(count==0)
//				System.out.println(i);
//		}
//	}
//}

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력: ");
		int su = sc.nextInt();
		int count=0;
		System.out.print(1 + "\t");count++;
		
		for (int i = 2; i < su; i++) {
			if (su % i == 0) {
				System.out.print(i + "\t"); 
				count++;
				if(count%3==0)System.out.println();
				
			}
		}
		System.out.println(su);
	}
}
