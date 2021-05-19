package mapaSveta;

public class Item {
private String nazev;
private String popis;
public String getNazev() {
	return nazev;
}
public void setNazev(String nazev) {
	this.nazev = nazev;
}
public String getPopis() {
	return popis;
}
public void setPopis(String popis) {
	this.popis = popis;
}
public Item(String nazev, String popis) {
	super();
	this.nazev=nazev;
	this.popis=popis;
}
@Override
public String toString() {
	return "Item [nazev=" + nazev + ", popis=" + popis + "]";
}

}

