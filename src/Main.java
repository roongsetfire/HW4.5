
public class Main {
	public static void main(String[] args) {
		System.out.println("*** LAB 9 ***");
//		LAB 9
		for(int count = 0;count<=20;count++) {
			if(count == 11) {
				System.out.println("count = "+count);
				continue;
			}
		}
		
//		LAB 10
		System.out.println("*** LAB 10 ***");
		for(int count = 1;count<=10;count++) {
			if(count == 2) {
				continue;
			}
			System.out.println(count);
		}
	}
}
