
public class ArrMaxMinEvenMaxMinUnevenNumb {

	public static void main(String[] args) {
		int y[] = new int[100];
		for (int i = 0; i < 100; i++) {
			y[i] = (int) (1 + (Math.random() * 100));
			System.out.println(y[i]);
		}
		int max1 = y[0];
		int min1 = y[0];
		int max2 = y[0];
		int min2 = y[0];
		for (int i = 0; i < 100; i++) {
			if (y[i] % 2 != 0) {
				if (y[i] > max1) {
					max1 = y[i];
				}
				if (y[i] < min1) {
					min1 = y[i];
				}
			}
			if (y[i] % 2 == 0) {
				if (y[i] > max2) {
					max2 = y[i];
				}
				if (y[i] < min2) {
					min2 = y[i];
				}
			}
		}
		System.out.println("=============================================");
		System.out.println("������������ �������� ��������� �������� � �������: " + max1);
		System.out.println("����������� �������� ��������� �������� � �������: " + min1);
		System.out.println("������������ �������� ������� �������� � �������: " + max2);
		System.out.println("����������� �������� ������� �������� � �������: " + min2);
	}
}
