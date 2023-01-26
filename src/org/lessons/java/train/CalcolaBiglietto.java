package org.lessons.java.train;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {

		int userAge, userKm;

		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci la tua età: ");
		userAge = s.nextInt();
		System.out.print("Inserisci il numero di km che vuoi percorrere: ");
		userKm = s.nextInt();

		if (userAge < 19)
			System.out.println("Il prezzo del tuo biglietto è: " + (0.21 * userKm * 0.8) + "€");
		else if (userAge > 64)
			System.out.println("Il prezzo del tuo biglietto è: " + (0.21 * userKm * 0.6) + "€");
		else
			System.out.println("Il prezzo del tuo biglietto è: " + (0.21 * userKm) + "€");

		s.close();
	}

}
