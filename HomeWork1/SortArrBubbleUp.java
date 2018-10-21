import java.util.Arrays;

public class SortArrBubbleUp {

	public static void main(String[] args) {
		int y[] = new int[100];

		for (int i = 0; i < 100; i++) {
			y[i] = (int) (Math.random() * 100);
			System.out.println(y[i]);
		}
		boolean sorted = false;
		int buf;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < y.length - 1; i++) {
				if (y[i] > y[i + 1]) {
					sorted = false;
					buf = y[i];
					y[i] = y[i + 1];
					y[i + 1] = buf;
				}
			}
		}
		System.out.println("=====================================");
		System.out.println(Arrays.toString(y));
	}
}
