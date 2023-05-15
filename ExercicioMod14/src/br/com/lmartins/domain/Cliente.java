package br.com.lmartins.domain;

import java.util.Objects;

/**
 * @author lucas
 *
 */
public class Cliente {

	private String nome;
	private Long cpf;
	private Long cel;
	private String cidade;
	private String estado;
	
	public Cliente(String nome, String cpf, String cel, String cidade, String estado) {
		super();
		this.nome = nome;
		this.cpf = Long.valueOf(cpf.trim());
		this.cel = Long.valueOf(cel.trim());
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getCel() {
		return cel;
	}

	public void setCel(Long cel) {
		this.cel = cel;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

//	@Override
//	public int hashCode() {
//		int hash = 7;
//		hash = 79 * hash + Objects.hashCode(this.cpf);
//		return hash;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		final Cliente other = (Cliente) obj;
//		if (!Objects.equals(cpf, other.cpf)) {
//			return false;
//	}
//
//	
//	
//	}


	

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
}
