package com.bikekin;

public class Polis implements Memur {
	
	Gorev gorev;
	
	public Polis(Gorev gorev) {
		this.gorev = gorev;
	}

	@Override
	public void calis() {
		System.out.println("Polis olarak " + gorev.gorevVer() + " çalışılmaktadır.");
		
	}

	
}
