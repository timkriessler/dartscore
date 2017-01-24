package model;

import java.util.List;

public class Rangliste {
	private List<Spieler> spielerliste;

	public Rangliste(List<Spieler> spielerliste) {
		this.spielerliste = spielerliste;
	}

	public List<Spieler> getSpielerliste() {
		return spielerliste;
	}

	public void setSpielerliste(List<Spieler> spielerliste) {
		this.spielerliste = spielerliste;
	}
}
