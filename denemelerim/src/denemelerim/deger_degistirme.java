package denemelerim;

import java.util.Scanner;

public class deger_degistirme {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sayi1;
		int sayi2;
		int temp;
		
		
		System.out.println("1.sayiyi giriniz");
		sayi1=input.nextInt();
		
		System.out.println("2.sayiyi giriniz");
		sayi2=input.nextInt();
		
		System.out.println("ilk durumda");
		System.out.println("1.sayi: "+sayi1);
		System.out.println("2.sayi: "+sayi2);
		
		temp=sayi1;
		sayi1=sayi2;
		sayi2=temp;
		
		
		System.out.println("değişen durumda");
		System.out.println("1.sayi" +sayi1);
		System.out.println("2.sayi" +sayi2);
	

	}

}
