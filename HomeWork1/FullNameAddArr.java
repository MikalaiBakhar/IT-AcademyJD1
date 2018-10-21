
public class FullNameAddArr {

	public static void main(String[] args) {
		char y[] = new char[14];
		String s = "Бахарь Николай";
		int i = 0;

		while (i < 14) {
			y[i] = s.charAt(i);
			i++;
		}
		for (i = 0; i < 14; i++) {
			System.out.println(y[i]);
		}
	}
}