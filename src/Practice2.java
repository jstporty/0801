
public class Practice2 {
	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			for (int j = i; j < i + 5; j++) {
				System.out.printf("%d\t", j);
			}
			System.out.println();
		}
	}
}
