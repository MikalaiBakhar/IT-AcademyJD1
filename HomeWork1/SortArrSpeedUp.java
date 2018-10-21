import java.util.Arrays;

public class SortArrSpeedUp {

	public static void main(String[] args) {
		int y[] = new int[100];
		for (int i = 0; i < 100; i++) {
			y[i] = (int) (Math.random() * 100);
			System.out.println(y[i]);
		}
		Arrays.sort(y);
		System.out.println("=====================================");
		System.out.println(Arrays.toString(y));

	}
}
