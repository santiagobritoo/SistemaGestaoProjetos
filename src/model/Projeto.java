package model;

// Classe responsável por representar um projeto
public class Projeto {
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataTerminoPrevista;
    private String status;
    private String gerenteResponsavel;
	public Projeto(String nome, String descricao, String dataInicio, String dataTerminoPrevista, String status,
			String gerenteResponsavel) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataTerminoPrevista = dataTerminoPrevista;
		this.status = status;
		this.gerenteResponsavel = gerenteResponsavel;
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
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataTerminoPrevista() {
		return dataTerminoPrevista;
	}
	public void setDataTerminoPrevista(String dataTerminoPrevista) {
		this.dataTerminoPrevista = dataTerminoPrevista;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGerenteResponsavel() {
		return gerenteResponsavel;
	}
	public void setGerenteResponsavel(String gerenteResponsavel) {
		this.gerenteResponsavel = gerenteResponsavel;
	}

}