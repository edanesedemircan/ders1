package denemelerim;

import java.util.Scanner;

public class yakit_hesabi {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double km;
	System.out.println("km giriniz:");
	km = input.nextDouble();
	
	double n; //km başına yakan yakıt fiyatı//
	System.out.println("Aracınız kaç kuruş yakıyor:");
	n =input.nextDouble();
	
	double tutar;
	tutar = n*km;
	System.out.println("tutar:"+tutar);
	
	
}
}
