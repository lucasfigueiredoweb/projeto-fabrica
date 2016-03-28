package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "exame")
public class Exame extends AbstractEntity {
	
	@Column(name = "nome")
	private String nome;
	@Column(name = "resultado")
	private String resultado;
//	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
//	public String getSenha() {
//		return senha;
//	}
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
	
}
