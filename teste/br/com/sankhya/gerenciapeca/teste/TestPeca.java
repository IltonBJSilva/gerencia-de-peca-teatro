/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 14/03/2019 
 * Objetivo sucinto do programa: Cria um teste para os metodos da classe Peca
 * Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit 
 */

package br.com.sankhya.gerenciapeca.teste;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.sankhya.gerenciapeca.dominio.*;

public class TestPeca {
	// Primeira
	Peca starWars = new Peca();
	Papel luke = new Papel();
	Ator lukeHm = new Ator();
	// Segunda
	Peca peca2 = new Peca();
	Papel papel2 = new Papel();
	Ator ator2 = new Ator();

	@Before
	public void beforeConfiguração() {
		// Primeira peça
		luke.setAcrecismos(new BigDecimal(100));
		lukeHm.setSalario(new BigDecimal(100));
		starWars.getPapeis().addAll(Arrays.asList(luke));
		luke.setPeca(starWars);
		luke.setAtor(lukeHm);
		lukeHm.getPapeis().addAll(Arrays.asList(luke));
		// Segunda peça
		papel2.setAcrecismos(new BigDecimal(500));
		ator2.setSalario(new BigDecimal(150));
		peca2.getPapeis().addAll(Arrays.asList(papel2));
		papel2.setPeca(peca2);
		papel2.setAtor(ator2);
		ator2.getPapeis().addAll(Arrays.asList(papel2));
	}

	@Test
	public void testExibirCustoTotal() {
		assertEquals(new BigDecimal(200), starWars.exibirCustoTotal());
		assertEquals(new BigDecimal(650), peca2.exibirCustoTotal());
	}
}