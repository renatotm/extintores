package br.com.cnaga.ControleExtintores.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class Extintor {
	
	@NotEmpty
	private Long id;
//	private Tipo tipo;
	@NotEmpty
	private String descricao;
//	private Fabricante fabricante;
	private Date dataCadastro;
	private int capacidade;
//	private TipoCapacidade tipoCapacidade;
	private Long carcaca;
	private int anoFabricacao;
//	private Setor setor;
//	private Local local;
	private String seloInmetro;
	private String obs;		
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public Long getCarcaca() {
		return carcaca;
	}
	public void setCarcaca(Long carcaca) {
		this.carcaca = carcaca;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getSeloInmetro() {
		return seloInmetro;
	}
	public void setSeloInmetro(String seloInmetro) {
		this.seloInmetro = seloInmetro;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}


}
