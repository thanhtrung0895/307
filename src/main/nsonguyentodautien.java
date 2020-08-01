package main;
import java.util.Scanner;

public class nsonguyentodautien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap so so nguyen to can tim: ");
		Scanner input = new Scanner(System.in);
		int dauvao = input.nextInt();
		int stt = 0;
		int i = 1;
		do {
			if (functioncheck(i)) {
				stt ++;
				System.out.println(i);
			}
			i++;
		} while (stt < dauvao);
		
//		System.out.println(functioncheck(8));
		

	}
	public static boolean functioncheck (int number) {
		int sqrt = (int) Math.sqrt(number);
		if (number <2) {
			return false;
		}
		for ( int i = 2; i <= sqrt; i++) {
			if( number % i == 0 ) {
				return false;
			}
		}
		return true;
	}

}
