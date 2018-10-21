
public class ArrMaxMinNumb {

	public static void main(String[] args) {
		int y[] = new int[100];
		int max = 0;
		for (int i = 0; i < 100; i++) {
			y[i] = (int) (1 + (Math.random() * 100));
			System.out.println(y[i]);
		}
		int min = y[0];
		for (int i = 0; i < 100; i++) {
			if (y[i] > max) {
				max = y[i];
			}
			if (y[i] < min) {
				min = y[i];
			}
		}
		System.out.println("=============================================");
		System.out.println("Максимальное значение в массиве: " + max);
		System.out.println("Минимальное значение в массиве: " + min);

	}
}
