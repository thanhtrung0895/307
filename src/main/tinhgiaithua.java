package main;
import java.util.Scanner;

public class tinhgiaithua {
	public static void main(String[] args) {
		while(true) {
			System.out.println("Nhap so can tinh giai thua: ");
			Scanner number = new Scanner(System.in);
			int num = number.nextInt();
			int answer = 1;
			for ( int i = 1; i <= num; i++ ) {
				answer = answer * i;
			}
			System.out.println("Ket qua la: "+ answer);
		}
	}

}
