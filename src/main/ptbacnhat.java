package main;
import java.util.Scanner;
public class ptbacnhat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		y = ax + b
		System.out.println("Nhap a");
		int a = input.nextInt();
		System.out.println("Nhap b");
		int b = input.nextInt();
		System.out.println("Nhap y");
		int y = input.nextInt();
		double x = (y - b)/a;
		System.out.println("Nghiem cua phuong trinh la x = "+ x);
		
	}

}
