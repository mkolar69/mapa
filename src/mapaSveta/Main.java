package mapaSveta;

import java.io.FileNotFoundException;
import java.io.IOException;


import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
				try {
					MapaSveta mapa = MapaSveta.nacti("mapa.csv");
					Scanner sc = new Scanner(System.in);
					System.out.println("Poloho kde se nach�z� je "+mapa.nazevAktualniPolohy());
					System.out.println("Zadej smer");
					int y = sc.nextInt();
					if(!mapa.jdiNa(y)) {
						System.out.println("T�mto sm�rem nic n�n�");
					}
					
					System.out.println("Poloho kde se nach�z� je "+mapa.nazevAktualniPolohy());
					System.out.println("Zadej smer");
					int y1 = sc.nextInt();
					if(!mapa.jdiNa(y1)) {
						System.out.println("T�mto sm�rem nic nen�");
					}
					
					System.out.println("Poloho kde se nach�z� je "+mapa.nazevAktualniPolohy());
					System.out.println("Zadej smer");
					int y2 = sc.nextInt();
					if(!mapa.jdiNa(y2)) {
						System.out.println("T�mto sm�rem nic n�n�");
					}
					
					System.out.println("Poloho kde se nach�z� je "+mapa.nazevAktualniPolohy());
					System.out.println("Zadej smer");
					int y3 = sc.nextInt();
					if(!mapa.jdiNa(y3)) {
						System.out.println("T�mto sm�rem nic n�n�");
					}
					int y4 = sc.nextInt();
					System.out.println("Poloho kde se nach�z� je "+mapa.nazevAktualniPolohy());
				} catch(FileNotFoundException e) {
					System.out.println("Soubor s mapou hern�ho sv�ta nebyl nalezen.");
				} catch (IOException ex) {
					System.out.println("Nastal probl�m p�i �ten� dat ze souboru.");
				} catch (Exception ex) {
					System.out.println("Data v souboru nep�estavuj� mapu sv�ta.");
					System.out.print("Pokud nen� probl�m s daty v souboru, asi jste p�i programov�n� pokazili");
					System.out.print("je�t� n�co jin�ho.");
				}

	}

}

