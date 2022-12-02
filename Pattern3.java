
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				if (i == 0 || j == 0 || i == (num - 1) || (i + j <= ((num - 1) / 2)) || (i - j >= ((num - 1) / 2)))

				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
