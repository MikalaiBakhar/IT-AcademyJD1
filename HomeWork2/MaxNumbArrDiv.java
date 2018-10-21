
public class MaxNumbArrDiv {

	public static void main(String[] args) {
		int y[] = new int[] { 15, 36, 72, 90, 44, 2, 33, 4, 9, 23 };
		int min = y[0];
		int max = y[0];
		int i;
		double buf;
		for (i = 0; i < 10; i++) {
			if (y[i] > max) {
				max = y[i];
			}
		}
		buf = max;
		double z[] = new double[i];
		for (i = 0; i < 10; i++) {
			double buf1 = y[i] / buf;
			buf1 = (double) Math.floor(buf1 * 100) / 100.0;
			z[i] = buf1;
		}
		System.out.println("Максимальный элемент массива- " + max);
		for (i = 0; i < 10; i++) {
			System.out.println(z[i]);
		}
	}

}