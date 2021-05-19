package mapaSveta;

import java.io.Serializable;
import java.util.ArrayList;

public class Lokalita implements Serializable {

	private String nazev;

	private int id;
	private ArrayList<NPC> npcc = new ArrayList<NPC>();
	private ArrayList<Item> items = new ArrayList<>();

	public void pridejNPC(NPC npc) {
		npcc.add(npc);
	}

	public NPC odejdi(int index) {
		NPC npc = npcc.get(index);
		npcc.remove(index);
		return npc;
	}

	public void pridejItem(Item item) {
		items.add(item);
	}

	public Item odebrat(int index) {
		Item item = items.get(index);
		items.remove(index);
		return item;
	}

	int[] smery = new int[4];

	public Lokalita(String nazev, int id) {
		this.nazev = nazev;
		this.id = id;
	}

	public void pripojLokalitu(int smer, int kam) {
		smery[smer] = kam;
	}

	@Override
	public String toString() {
		return nazev + "(" + this.npcc + ")" + "[" + this.items + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSmer(int smer) {
		return smery[smer];
	}
}