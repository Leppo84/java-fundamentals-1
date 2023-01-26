package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {

		String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili" };
		String userInput;
		boolean kickout = true;

		Scanner s = new Scanner(System.in);

		System.out.println("Buonasera, per favore mi digiti il suo nome completo per entrare: ");
		userInput = s.nextLine();

		s.close();

		for (int i = 0; i < (guests.length); i++)

			if (guests[i].equals(userInput)) {
				System.out.print("Prego " + guests[i] + ", i Ferragnez la stanno aspettando!");
				kickout = false;
			}

		if (kickout == true)
			System.out.print(userInput + ", lei non è in lista, se ne vada di qua!");

	}
}
