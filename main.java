package HomeWork;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Длина окружности круга через радиус.");
		System.out.println("Введите радиус =");
		
		Scanner sc = new Scanner(System.in);
		double s = sc.nextDouble();
		double pi = Math.PI;
		double p = (2*pi*s);
		
		sc.close();
	
		System.out.println("Длина окружности круга = " +p);
		
	}

}
