import java.util.Arrays;
import java.util.Collections;

public class SortArrSpeedDown {

	public static void main(String[] args) {
		Integer y[] = new Integer[100];
		for (int i = 0; i < 100; i++) {
			y[i] = (int) (Math.random() * 100);
			System.out.println(y[i]);
		}
		Arrays.sort(y, Collections.reverseOrder());
		System.out.println("=====================================");
		System.out.println(Arrays.toString(y));
	}
}
