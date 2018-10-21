
public class MaxMinNumbArr {

	public static void main(String[] args) {
		int y[] = new int[] { 15, 22, 76, 23 };
		int min = y[0];
		int max = y[0];
		int maxind = 0;
		int minind = 0;
		int i;
		int buf;
		for (i = 0; i < 4; i++) {
			if (y[i] < min) {
				min = y[i];
				minind = i;
			}
			if (y[i] > max) {
				max = y[i];
				maxind = i;
			}
		}
		buf = min;
		y[minind] = max;
		y[maxind] = buf;
		System.out.println("Минимальный элемент массива- " + min);
		System.out.println("Максимальный элемент массива- " + max);
		for (i = 0; i < 4; i++) {
			System.out.println(y[i]);
		}
	}

}