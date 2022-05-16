package test_project;

public class ex4 {
	public static void main(String[] args) {
		int dan = 2;
		int gob = 1;

		while (dan < 10) {
			while (gob < 10) {
				System.out.println(dan + "*" + gob + "=" + (dan * gob));
				gob++;
			}
			gob = 1;
			dan++;
		}
	}

}