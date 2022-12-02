
public class Pattern4 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int num = 14;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				if ((j == 0 && i >= ((num - 1) / 2)) || i >= (num - 2) || (i - j >= ((num - 1) / 2))
						|| (j + i >= ((num - 1) + ((num - 1) / 2)))

				) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
