import java.util.Locale;

public class Variaveis {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double x = 10;
		double y = 10.102716;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(String.format("%.2f", y));

	}

}
