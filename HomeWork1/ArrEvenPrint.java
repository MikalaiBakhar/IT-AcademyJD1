
public class ArrEvenPrint {

	public static void main(String[] args) {
		int y[] = new int[100];
		for (int i = 0; i < 100; i++) {
			y[i] = (int) (1 + (Math.random() * 100));
			System.out.println(y[i]);
		}
		for (int i = 0; i < 100; i++) {
			if (y[i] % 2 == 0) {
				System.out.println("Четные числа массива- " + y[i] + " -Номер элемента- " + i);
			}
		}
	}
}