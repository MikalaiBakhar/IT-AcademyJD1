
public class ArrUnevenDiff {

	public static void main(String[] args) {
		int y[] = new int[100];
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			y[i] = (int) (1 + (Math.random() * 100));
			System.out.println(y[i]);
		}
		for (int i = 0; i < 100; i++) {
			if (y[i] % 2 != 0) {
				sum -= y[i];
				System.out.println("Нечетные числа массива- " + y[i] + " -Номер элемента- " + i);
			}
		}
		System.out.println("===========================================");
		System.out.println("Разность нечетных элементов массива: " + sum);
	}
}