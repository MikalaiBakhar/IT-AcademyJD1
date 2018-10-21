import java.util.Scanner;
public class FullNameAddArrScann {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		char y[] = new char[26];
		int i=0;
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите фамилию: ");
		String name1 = in.nextLine();
		System.out.println("¬ведите им€: ");
		String name2 = in.nextLine();
		System.out.println("¬ведите отчество: ");
		String name3 = in.nextLine();
		String s = name1+" "+name2+" "+name3;
		while (i<26)	{
		y[i] = s.charAt(i);
		i++;
		}
		for(i=0; i<26; i++){
			System.out.println(y[i]);
		}
}
}
