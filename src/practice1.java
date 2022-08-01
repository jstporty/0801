import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.print("   입력하실 초 : " );		
		int su =sc.nextInt();
		
		
		int hour= su/3600;  //시
		int seconds=su%3600;  
		int minute=seconds/60;  //분
		seconds=seconds%60;  // 초
		
		System.out.printf("%d초는 %d시간%d분 %d초입니다",su,hour,minute,seconds);
		
		
	}
}
