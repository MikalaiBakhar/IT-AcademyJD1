import java.util.Scanner;

public class ArrSearchScann {

	public static void main(String[] args) {
		int y[] = new int[100];
		for (int i = 0; i < 100; i++) {
			y[i] = (int) (Math.random() * 100);
			System.out.println(y[i]);
		}
		Scanner in = new Scanner(System.in);
		System.out.println("=====================================");
		System.out.println("¬ведите начальный индекс интервала массива");
		int start = in.nextInt();
		System.out.println("=====================================");
		System.out.println("¬ведите конечный индекс интервала массива");
		int finish = in.nextInt();
		System.out.println("=====================================");
		while (start <= finish) {
			System.out.println(y[start]);
			start++;
		}
		System.out.println("=============Finish===================");
	}

}
