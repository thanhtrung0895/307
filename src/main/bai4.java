package main;
import java.util.Scanner;
public class bai4 {

	public static void main(String[] args) {
		System.out.println("Nhap so dau vao: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for ( int i = 2; i < number; i ++) {
			if(myfunction(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean myfunction(int numbercheck) {
		if(numbercheck < 2) {
			return false;
		}
		int squareRoot = (int) Math.sqrt(numbercheck);
        for (int i = 2; i <= squareRoot; i++) {
            if (numbercheck % i == 0) {
                return false;
            }
        }
        return true;
	}

}
