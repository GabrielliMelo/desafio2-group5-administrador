package br.com.desafio2.ilab.group5.dto;

public class AdministratorLoginDTO {

	private String email;
	private String telefone;
	private String senha;

    public AdministratorLoginDTO(String email, String telefone, String senha) {
		super();
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}

	public AdministratorLoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
