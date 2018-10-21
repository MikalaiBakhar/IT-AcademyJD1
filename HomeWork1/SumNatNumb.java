
public class SumNatNumb {

	public static void main(String[] args) {
		int n = 100;
		int sum = 0;
		int z = n;
		while (z > 0) {
			if (z % 2 == 0) {
				sum += z;
				z -= 1;
			} else {
				z -= 1;
			}
		}
		System.out.println("Сумма четных чисел натурального числа " + n + " равна - " + sum);
	}
}