
public class Factorial {

	public static void main(String[] args) {
		int x = 9;
		int i = 1;
		int f = 1;

		while (i <= x) {
			f = f * i;
			i++;
		}
		System.out.println("Факториал числа " + x + " равен - " + f);
	}

}