package main;
import java.util.Scanner;
public class ptbachai {

	public static void main(String[] args) {
		while(true) {
	//		ax2 + bx + c = 0 
			Scanner input = new Scanner(System.in);
			System.out.println("Nhap so a: ");
			int a = input.nextInt();
			System.out.println("Nhap so b: ");
			int b = input.nextInt();
			System.out.println("Nhap so c: ");
			int c = input.nextInt();
			double delta = b * b - 4 * a * c;
			if ( delta > 0 ) {
				
				double x1 = ( -b - Math.sqrt(delta))/( 2 * a); 
				double x2 = ( -b + Math.sqrt(delta))/( 2 * a); 
				System.out.println("Phuong trinh co 2 nghiem: ");
				System.out.println(x1);
				System.out.println(x2);
			}else if( delta == 0 ) {
				System.out.println("Phuong trinh co nghiem: ");
				System.out.println(-b/( 2 * a ));
			}else {
				System.out.println("Phuong trinh vo nghiem: ");
			}
		}

	}

}
