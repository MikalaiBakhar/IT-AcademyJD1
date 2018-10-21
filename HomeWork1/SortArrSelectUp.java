import java.util.Arrays;

public class SortArrSelectUp {

	public static void main(String[] args) {
		int y[] = new int[100];

		for (int i = 0; i < 100; i++) {
			y[i] = (int) (Math.random() * 100);
			System.out.println(y[i]);
		}
		for (int i = 0; i < 100; i++) {
			int min = y[i];
			int minInd = i;
			for (int j = i + 1; j < 100; j++) {
				if (y[j] < min) {
					min = y[j];
					minInd = j;
				}
			}
			if (i != minInd) {
				int buf = y[i];
				y[i] = y[minInd];
				y[minInd] = buf;
			}

		}
		System.out.println("=====================================");
		System.out.println(Arrays.toString(y));
	}
}
