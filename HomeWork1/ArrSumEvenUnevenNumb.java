
public class ArrSumEvenUnevenNumb {

	public static void main(String[] args) {
		int y[] = new int[100];
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < 100; i++) {
			y[i] = (int) (1 + (Math.random() * 100));
			System.out.println(y[i]);
		}
		for (int i = 0; i < 100; i++) {
			if (y[i] % 2 != 0) {
				sum1 += 1;
				System.out.println("�������� ����� �������- " + y[i] + " -����� ��������- " + i);
			}
			if (y[i] % 2 == 0) {
				sum2 += 1;
				System.out.println("������ ����� �������- " + y[i] + " -����� ��������- " + i);
			}

		}
		System.out.println("=============================================");
		System.out.println("���������� �������� ��������� ������� : " + sum1);
		System.out.println("���������� ������ ��������� ������� : " + sum2);
	}
}
