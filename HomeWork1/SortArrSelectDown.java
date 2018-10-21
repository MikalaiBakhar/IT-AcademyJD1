import java.util.Arrays;

public class SortArrSelectDown {

	public static void main(String[] args) {
		int y[] = new int[100];
		for (int i = 0; i < 100; i++) {
			y[i] = (int) (Math.random() * 100);
			System.out.println(y[i]);
		}
		for (int i = 0; i < 100; i++) {
			int max = y[i];
			int maxInd = i;
			for (int j = i + 1; j < 100; j++) {
				if (y[j] > max) {
					max = y[j];
					maxInd = j;
				}
			}
			if (i != maxInd) {
				int buf = y[i];
				y[i] = y[maxInd];
				y[maxInd] = buf;
			}

		}
		System.out.println("=====================================");
		System.out.println(Arrays.toString(y));
	}
}
