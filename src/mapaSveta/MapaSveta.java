package mapaSveta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;

public class MapaSveta extends HashMap<Integer, Lokalita> implements Serializable {
	private int zacatek = 4;
	private int aktualniPoloha = zacatek;

	public static MapaSveta nacti(String nazevSouboru) throws IOException {
		MapaSveta mapa = new MapaSveta();
		BufferedReader reader = new BufferedReader(new FileReader(nazevSouboru));
		String majkl = "";
		while ((majkl = reader.readLine()) != null) {
			String[] pole = majkl.split(";");
			Lokalita lokalita = new Lokalita(pole[1], Integer.parseInt(pole[0]));
			for (int i = 0; i < 4; i++) {
				lokalita.pripojLokalitu(i, Integer.parseInt(pole[i + 2]));
			}
			mapa.put(lokalita.getId(), lokalita);
		}
		reader.close();
		return mapa;
	}

	public MapaSveta() {
		Random rnd = new Random();
		int p = rnd.nextInt(3);
		for (int i = 0; i < p; i++) {
			String s = "";
			switch (rnd.nextInt(3)) {
			case 0:
				s = "AUG";
				break;
			case 1:
				s = "AWP";
				break;
			case 2:
				s = "NEGEV";
				break;
			}
			String popis = "Je ";
			switch (rnd.nextInt(3)) {
			case 0:
				s = "Factory new";
				break;
			case 1:
				s = "Field-tested";
				break;
			case 2:
				s = "Battle-scarred";
			case 3:
				s = "Factory new";
				break;
			case 4:
				s = "Field-tested";
				break;
			case 5:
				s = "Battle-scarred";

		
			}

		}

	}

	public String nazevAktualniPolohy() {
		return this.get(aktualniPoloha).toString();
	}

	public boolean jdiNa(int smer) {
		int idKam = this.get(aktualniPoloha).getSmer(smer);
		if (idKam == -1) {
			return false;
		}
		aktualniPoloha = idKam;
		return true;

	}
}