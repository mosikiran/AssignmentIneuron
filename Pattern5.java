
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || i == (num - 1) || j == ((num - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < num; j++) {
				if (j == 0 || j == (num - 1) || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < num; j++) {
				if (j == 0 || i == 0 || i == ((num - 1) / 2) || i == (num - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < num; j++) {
				if ((j == 0 && i != (num - 1)) || (j == (num - 1) && i != (num - 1))
						|| (i == (num - 1) && j > 0 && j < (num - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < num; j++) {
				if (j == 0 || (i == 0 && j != (num - 1)) || (i == ((num - 1) / 2) && j != (num - 1))
						|| (j == (num - 1) && (i <= ((num - 1) / 2) && i != 0 && i != ((num - 1) / 2)))

						|| ((i == j) && (i >= ((num - 1) / 2)))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < num; j++) {
				if ((j == 0 && i != (num - 1) && i != 0) || (j == (num - 1) && i != (num - 1) && i != 0)
						|| (i == (num - 1) && j > 0 && j < (num - 1)) || (i == 0 && j > 0 && j < (num - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print(" ");
			for (int j = 0; j < num; j++) {
				if (j == 0 || j == (num - 1) || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
