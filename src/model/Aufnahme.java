package model;

public class Aufnahme {
	private int wurf1;
	private int multiplizitaet1;
	private int wurf2;
	private int multiplizitaet2;
	private int wurf3;
	private int multiplizitaet3;

	public Aufnahme(int wurf1, int multiplizitaet1, int wurf2, int multiplizitaet2, int wurf3, int multiplizitaet3) {
		this.wurf1 = wurf1;
		this.multiplizitaet1 = multiplizitaet1;
		this.wurf2 = wurf2;
		this.multiplizitaet2 = multiplizitaet2;
		this.wurf3 = wurf3;
		this.multiplizitaet3 = multiplizitaet3;
	}

	public int getWurf1() {
		return wurf1;
	}

	public void setWurf1(int wurf1) {
		this.wurf1 = wurf1;
	}

	public int getWurf2() {
		return wurf2;
	}

	public void setWurf2(int wurf2) {
		this.wurf2 = wurf2;
	}

	public int getWurf3() {
		return wurf3;
	}

	public void setWurf3(int wurf3) {
		this.wurf3 = wurf3;
	}

	public int getMultiplizitaet1() {
		return multiplizitaet1;
	}

	public void setMultiplizitaet1(int multiplizitaet1) {
		this.multiplizitaet1 = multiplizitaet1;
	}

	public int getMultiplizitaet2() {
		return multiplizitaet2;
	}

	public void setMultiplizitaet2(int multiplizitaet2) {
		this.multiplizitaet2 = multiplizitaet2;
	}

	public int getMultiplizitaet3() {
		return multiplizitaet3;
	}

	public void setMultiplizitaet3(int multiplizitaet3) {
		this.multiplizitaet3 = multiplizitaet3;
	}

}
