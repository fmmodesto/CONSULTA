package com.consulta.domain;

import com.ford.jabl.data.MapperColumn;
import com.ford.jabl.data.MapperTable;

@MapperTable(schema = "dbo", table = "MDOI320_DR_X_INCENTIVES") 
public class Pessoa {
		
	private static final long serialVersionUID = 1L;

	// Table name
	public static final String TABLE = "dbo.01_PESSOA";

	// Fields names
	public static final String ID = "01_ID";
	public static final String NOME = "01_NOME";
	public static final String CPF = "01_CPF";
	public static final String IDADE = "01_IDADE";
	public static final String TELEFONE = "01_TELEFONE";
	
	// Properties
		@MapperColumn(name = ID)
		private Integer id;

		@MapperColumn(name = NOME)
		private String nome;

		@MapperColumn(name = CPF)
		private Integer cpf;

		@MapperColumn(name = IDADE)
		private Integer idade;

		@MapperColumn(name = TELEFONE)
		private String telefone;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Integer getCpf() {
			return cpf;
		}

		public void setCpf(Integer cpf) {
			this.cpf = cpf;
		}

		public Integer getIdade() {
			return idade;
		}

		public void setIdade(Integer idade) {
			this.idade = idade;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		@Override
		public String toString() {
			return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", telefone="
					+ telefone + "]";
		}

	
}
