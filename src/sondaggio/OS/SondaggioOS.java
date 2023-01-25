package sondaggio.OS;

import java.util.Scanner;

public class SondaggioOS {
	public static void main(String[] args) {
	
	int WinUser;
	int MacUser;
	int LinuxUser;
	
	Scanner s=new Scanner(System.in);
	System.out.print("Inserisci il numero di studenti che usano Windows: ");
	WinUser=s.nextInt () ;
	System.out.print("Inserisci il numero di studenti che usano Mackintosh: ");
	MacUser=s.nextInt () ;
	System.out.print("Inserisci il numero di studenti che usano Linus: ");
	LinuxUser=s.nextInt () ;
	
	System.out.println("La percentuale che usa Win è: "+(WinUser*100/(WinUser+MacUser+LinuxUser))+"%");
	System.out.println("La percentuale che usa Mac è: "+(MacUser*100/(WinUser+MacUser+LinuxUser))+"%");
	System.out.println("La percentuale che usa Linux è: "+(LinuxUser*100/(WinUser+MacUser+LinuxUser))+"%");
	
	s.close();
	
	}
}
