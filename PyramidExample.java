
public class PyramidExample {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println("*");
			}
			System.out.println();//newline
		}
	}

}
class PyramidExampleReverse{
	public static void main(String[] args) {
		int term=6;
		for(int i=1;i<term;i++) {
			for(int j=term;j>=i;j--) {
				System.out.println("* ");
			}
			System.out.println();//new line
		}
	}
}