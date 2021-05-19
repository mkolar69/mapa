package mapaSveta;

import java.io.FileNotFoundException;
import java.io.IOException;


import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
				try {
					MapaSveta mapa = MapaSveta.nacti("mapa.csv");
					Scanner sc = new Scanner(System.in);
					System.out.println("Poloho kde se nacházíš je "+mapa.nazevAktualniPolohy());
					System.out.println("Zadej smer");
					int y = sc.nextInt();
					if(!mapa.jdiNa(y)) {
						System.out.println("Tímto smìrem nic nìní");
					}
					
					System.out.println("Poloho kde se nacházíš je "+mapa.nazevAktualniPolohy());
					System.out.println("Zadej smer");
					int y1 = sc.nextInt();
					if(!mapa.jdiNa(y1)) {
						System.out.println("Tímto smìrem nic není");
					}
					
					System.out.println("Poloho kde se nacházíš je "+mapa.nazevAktualniPolohy());
					System.out.println("Zadej smer");
					int y2 = sc.nextInt();
					if(!mapa.jdiNa(y2)) {
						System.out.println("Tímto smìrem nic nìní");
					}
					
					System.out.println("Poloho kde se nacházíš je "+mapa.nazevAktualniPolohy());
					System.out.println("Zadej smer");
					int y3 = sc.nextInt();
					if(!mapa.jdiNa(y3)) {
						System.out.println("Tímto smìrem nic nìní");
					}
					int y4 = sc.nextInt();
					System.out.println("Poloho kde se nacházíš je "+mapa.nazevAktualniPolohy());
				} catch(FileNotFoundException e) {
					System.out.println("Soubor s mapou herního svìta nebyl nalezen.");
				} catch (IOException ex) {
					System.out.println("Nastal problém pøi ètení dat ze souboru.");
				} catch (Exception ex) {
					System.out.println("Data v souboru nepøestavují mapu svìta.");
					System.out.print("Pokud není problém s daty v souboru, asi jste pøi programování pokazili");
					System.out.print("ještì nìco jiného.");
				}

	}

}

