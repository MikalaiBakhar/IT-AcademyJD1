
public class NumbArrEvenIndSqrtSum {

	public static void main(String[] args) {
		int i;
		int k = 0;
		int indb = 0;
		double m;
		double a[] = new double[20];
		for (i = 0; i < 20; i++) {
			a[i] = (double) (-5 + (Math.random() * 10));
			System.out.println(a[i]);
		}
		for (i = 2; i < 20; i += 2) {
			System.out.println(i);
			if (a[i] > 0) {
				indb += 1;
			}
		}
		double b[] = new double[indb];
		for (i = 2; i < 20; i += 2) {
			if (a[i] > 0) {
				m = a[i];
				m = (double) Math.floor(m * 100) / 100.0;
				b[k] = m;
				k += 1;
			}
		}
		double sum = 0;
		double kv = 0;
		for (k = 0; k < indb; k++) {
			kv = b[k];
			sum += Math.sqrt(kv);
		}

		for (k = 0; k < indb; k++) {
			System.out.println("Положительные элементы с четным индексом- " + b[k]);
		}
		System.out.println("Сумма квадратов элементов массива- " + sum);
	}
}