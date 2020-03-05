package com.bikekin.test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.bikekin.EmniyetGorevi;
import com.bikekin.Polis;

public class TestMemur {
	
	@Test
	public void polisGorevTestEt() {
		
		EmniyetGorevi mockGorev = mock(EmniyetGorevi.class);
		
		Polis polis = new Polis(mockGorev);
		
		polis.calis();
		
		verify(mockGorev, times(1)).gorevVer();
		
		
	}

}
