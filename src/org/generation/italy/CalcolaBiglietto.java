package org.generation.italy;
import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire numero KM da percorrere");
		double Km = in.nextInt();
		
		System.out.println("Inserire età");
		double età = in.nextInt();
		
		double biglietto = (Km * 0.21);
		
		if (età < 18) {
			double bigliettoscontato = biglietto - (biglietto * 0.2);
			
			System.out.println("Il costo del biglietto è: ");
			System.out.println(bigliettoscontato);
		}else if (età > 65){
			double bigliettoscontato = biglietto - (biglietto * 0.4);
			
			System.out.println("Il costo del biglietto è: ");
			System.out.println(bigliettoscontato);
		}else {
			System.out.println("Il costo del biglietto è: ");
			System.out.println(biglietto);
		}
		
		
		
	}
}
