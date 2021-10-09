package br.com.larjr.handagartowerdefenseapi.entidade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Torre {

	@Id
	Long id;

	String nome;

	String descricao;

	Integer ataqueFisico;

	Integer ataqueMagico;

	Integer ataqueVelocidade;

	Integer defesa;

	Integer resistenciaMagica;

	Integer vida;

	Integer tenacidade;

	@ManyToOne
	HabilidadeEspecial habilidadeEspecial;

}
