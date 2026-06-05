package model;

//Classe responsável por representar uma equipe de trabalho
public class Equipe {
    private String nome;
    private String descricao;
    private String membros;
	public Equipe(String nome, String descricao, String membros) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.membros = membros;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMembros() {
		return membros;
	}
	public void setMembros(String membros) {
		this.membros = membros;
	}

}