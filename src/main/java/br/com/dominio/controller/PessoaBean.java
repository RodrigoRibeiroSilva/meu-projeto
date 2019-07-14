package br.com.dominio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.dominio.model.Pessoa;

@Named
@SessionScoped
public class PessoaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private Pessoa pessoa;
	private List<Pessoa> listaPessoas = new ArrayList<>();
	private boolean mostrarTabela = false;
	

	public void adicionar() {
		listaPessoas.add(pessoa);
		setMostrarTabela(true);
		limpar();
	}

	public void remover(Pessoa pessoa) {
		listaPessoas.remove(pessoa);
	}

	public void esconderTabela() {
		setMostrarTabela(false);
	}

	private void limpar() {
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public void setListaPessoas(List<Pessoa> listaPessoas) {
		this.listaPessoas = listaPessoas;
	}

	public boolean isMostrarTabela() {
		return mostrarTabela;
	}

	public void setMostrarTabela(boolean mostrarTabela) {
		this.mostrarTabela = mostrarTabela;
	}

}
