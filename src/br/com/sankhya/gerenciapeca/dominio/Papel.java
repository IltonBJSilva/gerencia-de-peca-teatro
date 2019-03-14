/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 12/03/2019 
 * Objetivo sucinto do programa: cria classe Papel que exibi salario com acrescimo
 * Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1ewS7W5Lacoxjorj8NxD3zc2uH32P5fWOu2xqjVTWym0/edit 
 */

package br.com.sankhya.gerenciapeca.dominio;

import java.io.Serializable;
import java.math.BigDecimal;

public class Papel implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String nomePersonagem;
	private BigDecimal acrecismos;
	private Ator ator;
	private Peca peca;

	public Papel() {

	}

	public Papel(Integer iD, String nomePersonagem, BigDecimal acrecismos) {
		super();
		ID = iD;
		this.nomePersonagem = nomePersonagem;
		this.acrecismos = acrecismos;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public BigDecimal getAcrecismos() {
		return acrecismos;
	}

	public Ator getAtor() {
		return ator;
	}

	public void setAtor(Ator ator) {
		this.ator = ator;
	}

	public void setAcrecismos(BigDecimal acrecismos) {
		this.acrecismos = acrecismos;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	// Exibi o salario adicionando um acrescimo no mesmo
	public BigDecimal exibirSalarioComAcrescimo() {

		return ator.getSalario().add(this.acrecismos);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Papel other = (Papel) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

	public String toString() {
		return "Papel [ID=" + ID + ", nomePersonagem=" + nomePersonagem + ", acrecismos=" + acrecismos + "]";
	}
}