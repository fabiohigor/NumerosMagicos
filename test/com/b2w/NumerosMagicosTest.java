package com.b2w;

import static org.junit.Assert.*;

import org.junit.Test;

import com.b2w.NumerosMagicos;

public class NumerosMagicosTest {

	@Test
	public void deveRetornarOk() {
		int lista[][] = { { 1, 49 }, { 8, 27 }, { 49, 49 }, { 1, 3 },
				{ 27, 49 } };
		int resposta[] = { 4, 2, 1, 0, 1 };
		assertArrayEquals(resposta, new NumerosMagicos().numerosMagicos(lista));
	}

	@Test
	public void deveRetornarQuantidadeErrada() {
		int lista[][] = { { 1, 49 }, { 8, 27 }, { 49, 49 }, { 1, 3 },
				{ 27, 49 } };
		int resposta1[] = { 4, 2, 1, 0, 0 };
		assertNotEquals(resposta1, new NumerosMagicos().numerosMagicos(lista));
	}

	@Test
	public void naoDeveTerNumerosMagicos() {
		int lista[][] = { { 1, 3 }, { 5, 8 }, { 26, 48 } };
		int resposta1[] = { 0, 0, 0 };
		int aux[] = new NumerosMagicos().numerosMagicos(lista);
		assertArrayEquals(resposta1, aux);
	}
}
