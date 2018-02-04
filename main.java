package HomeWork;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("The length of the circumference of the circle through the radius.");
		System.out.println("Enter radius =");
		
		Scanner sc = new Scanner(System.in);
		double s = sc.nextDouble();
		double pi = Math.PI;
		double p = (2*pi*s);
		
		sc.close();
	
		System.out.println("Circle circumference = " +p);
		
	}

}
