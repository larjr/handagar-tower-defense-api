package br.com.larjr.handagartowerdefenseapi.entidade;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HabilidadeEspecial {

	@Id
	Long id;

	String nome;

	String descricao;

	Integer coolDown;
}
