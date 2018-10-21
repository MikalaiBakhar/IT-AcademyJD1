import java.util.Arrays;

public class SortArrInsertUp {

	public static void main(String[] args) {
		int y[] = new int[100];
		for (int i = 0; i < 100; i++) {
			y[i] = (int) (Math.random() * 100);
			System.out.println(y[i]);
		}
		int counter = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = i; j > 0 && y[j - 1] > y[j]; j--) {
				counter++;
				int buf = y[j - 1];
				y[j - 1] = y[j];
				y[j] = buf;
			}
		}
		System.out.println("=====================================");
		System.out.println(Arrays.toString(y));
	}
}
