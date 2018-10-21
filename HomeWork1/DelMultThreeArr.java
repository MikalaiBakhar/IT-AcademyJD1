import java.util.ArrayList;

public class DelMultThreeArr {

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {
		int k = 0;
		int m = 0;
		int f = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int y[] = new int[10];
		y[0] = 1;
		y[1] = 2;
		y[2] = 3;
		y[3] = 4;
		y[4] = 5;
		y[5] = 6;
		y[6] = 7;
		y[7] = 8;
		y[8] = 9;
		y[9] = 10;
		for (int i = 0; i < 10; i++) {
			System.out.println(y[i]);
		}
		System.out.println("================================");
		for (int i = 0; i < 10; i++) {
			if (y[i] % 3 == 0) {
			} else
				list.add(y[i]);
		}
		int n = list.size();
		int z[] = new int[n];
		for (int i = 0; i < n; i++) {
			z[i] = list.get(i);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(z[i]);
		}
	}
}
