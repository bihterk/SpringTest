package com.bikekin;

public class Ogretmen implements Memur {
	
	Gorev gorev;
	
	public Ogretmen(Gorev gorev) {
		this.gorev = gorev;
	}

	@Override
	public void calis() {
		
		System.out.println("Öğretmen olarak " + gorev.gorevVer() + " çalışmaktadır.");

	}

}
