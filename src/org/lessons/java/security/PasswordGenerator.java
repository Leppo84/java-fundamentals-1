package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		
		String Name;
		String Surname;
		String Color;
		int YearBirth;
		byte MonthBirth;
		byte DayBirth;
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		Name=s.nextLine () ;
		System.out.print("Inserisci il tuo cognome: ");
		Surname=s.nextLine () ;
		System.out.print("Inserisci il tuo colore preferito: ");
		Color=s.nextLine () ;
		System.out.print("Inserisci l'anno di nascita: ");
		YearBirth=s.nextInt () ;
		System.out.print("Inserisci il mese di nascita come numero: ");
		MonthBirth=s.nextByte () ;
		System.out.print("Inserisci il giorno di nascita come numero: ");
		DayBirth=s.nextByte () ;
		
		System.out.println("Ecco la tua password ultrasicura: "+Name+Surname+Color+(YearBirth+MonthBirth+DayBirth));
		
		s.close();
	}
}
