package denemelerim;

import java.util.Scanner;

public class hipotenüs {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int a; //1.kenar
	int b; //2.kenar
	double hipotenüs;
	
	System.out.println("1.kenar uzunluğunu giriniz");
	a= input.nextInt();
	
	System.out.println("2.kenar uzunluğunu giriniz");
	b= input.nextInt();
	
	hipotenüs=  Math.sqrt(a*a + b*b) ;
	System.out.println("Hipotenüs: "+ hipotenüs);
	
	
	
	}
}
