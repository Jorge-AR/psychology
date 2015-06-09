package testes;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TesteBean {
	
	private String nome;
	private String email;
	private Date dataValidade;
	
	public void cadastrar(){
		System.out.println("Nome: " + getNome());
		System.out.println("Email: " + getEmail());
		System.out.println("Validade: " + getDataValidade());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
}
