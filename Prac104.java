
public class Prac104 {

	public static void main(String[] args) {
		
		//upper half
		int x = 5;
		for(int a=1;a<=x;a++) {
			for(int b=1;b<=x-a;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		//lower half
		for(int a=x;a>=1;a--) {
			for(int b=1;b<=x-a;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
