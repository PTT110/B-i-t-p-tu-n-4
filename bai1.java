
package bai1;
import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		float a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap vao 2 so bat ki: ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("Tong la: "+(a+b));
		System.out.println("Hieu la: "+(a-b));
		System.out.println("Tich la: "+(a*b));
		System.out.println("Thuong la: "+(a/b));
		System.out.println("Chia lay du la: "+(a%b));
		if(a>b)
			System.out.println("a lon hon b");
		else 
			System.out.println("b lon hon a");
	}
	}