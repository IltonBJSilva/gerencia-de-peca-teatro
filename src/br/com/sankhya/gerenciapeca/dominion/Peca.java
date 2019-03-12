package br.com.sankhya.gerenciapeca.dominion;

import java.io.Serializable;
import java.util.Date;

public class Peca implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String titulo;
	private Integer duracao;
	private Date data;
	
	public Peca() {
		// TODO Auto-generated constructor stub
	}
	
	public Peca(Integer iD, String titulo, Integer duracao, Date data) {
		super();
		ID = iD;
		this.titulo = titulo;
		this.duracao = duracao;
		this.data = data;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
		Peca other = (Peca) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Peca [ID=" + ID + ", titulo=" + titulo + ", duracao=" + duracao + ", data=" + data + "]";
	}
	
}
