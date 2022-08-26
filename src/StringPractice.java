import java.util.ArrayList;

public class StringPractice {

	int i;

	public static void main(String[] args) {

		int a[] = { 43, 41, 321, 15, 5 };

		int min = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];

			}
		}
		System.out.println(min);

	}

}
