/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 14/03/2019 
 * Objetivo sucinto do programa: Cria um teste para os metodos da classe Papel
 * Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit 
 */

package br.com.sankhya.gerenciapeca.teste;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.sankhya.gerenciapeca.dominio.Ator;
import br.com.sankhya.gerenciapeca.dominio.Papel;

public class TestPapel {
	// Instancias
	Papel papel1 = new Papel();
	Ator ator1 = new Ator();

	// Relacionamento de ambos
	@Before
	public void beforeConfiguração() {
		papel1.setAcrecismos(new BigDecimal(20));
		ator1.setSalario(new BigDecimal(100));
		papel1.setAtor(ator1);
		ator1.getPapeis().addAll(Arrays.asList(papel1));
	}

	// Teste
	@Test
	public void testExibirSalarioComAcrescimo() {

		assertEquals(new BigDecimal(120), papel1.exibirSalarioComAcrescimo());
	}
}