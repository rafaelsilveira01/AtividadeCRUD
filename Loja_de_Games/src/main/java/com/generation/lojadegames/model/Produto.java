package com.generation.lojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@NotBlank(message = "Tipo de Produto Obrigatorio")
	@Size(min = 3, max = 255)
	private String tipo;
	
	@NotBlank(message = "Nome do Produto Obrigatorio")
    @Size(min = 3 , max = 50)
    private String nome;
    
	@NotNull(message = "Preço do Produto Obrigatorio")
    private Integer preco;
    
	    
	@NotBlank(message = "Identificação do Console Obrigatorio")
    @Size(min = 3 , max = 50)
    private String console;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getPreco() {
		return preco;
	}


	public void setPreco(Integer preco) {
		this.preco = preco;
	}


	public String getConsole() {
		return console;
	}


	public void setConsole(String console) {
		this.console = console;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
   	
}
