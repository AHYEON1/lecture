package test_project;

public class ex3 {
	public static void main(String[] args) {

		int i;

		int sum = 0;

		for (i = 0; i <= 100; i++) {
			if ((i % 2) == 0) {
				continue;
			} else if ((i % 3) == 0) {
				continue;
			} else {
				System.out.println(i + " ");
				sum += i;
				System.out.println(sum);

			}
		}

	}
}