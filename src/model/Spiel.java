package model;

import java.util.List;

public class Spiel {
	private int punktzahl;
	private boolean doubleout;
	private List<Spieler> teilnehmerliste;

	public Spiel(int punktzahl, boolean doubleout, List<Spieler> teilnehmerliste) {
		this.punktzahl = punktzahl;
		this.doubleout = doubleout;
		this.teilnehmerliste = teilnehmerliste;
	}

	public List<Spieler> getTeilnehmer() {
		return teilnehmerliste;
	}

	public void setTeilnehmer(List<Spieler> teilnehmer) {
		this.teilnehmerliste = teilnehmer;
	}

	public int getPunktzahl() {
		return punktzahl;
	}

	public void setPunktzahl(int punktzahl) {
		this.punktzahl = punktzahl;
	}

	public boolean isDoubleout() {
		return doubleout;
	}

	public void setDoubleout(boolean doubleout) {
		this.doubleout = doubleout;
	}

}
