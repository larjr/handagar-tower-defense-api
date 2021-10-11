package br.com.larjr.handagartowerdefenseapi.entidade;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HabilidadeEspecial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(unique = true)
	String nome;

	@Column(unique = true)
	String descricao;

	Integer coolDown;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCoolDown() {
		return coolDown;
	}

	public void setCoolDown(Integer coolDown) {
		this.coolDown = coolDown;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coolDown, descricao, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HabilidadeEspecial other = (HabilidadeEspecial) obj;
		return Objects.equals(coolDown, other.coolDown) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "HabilidadeEspecial [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", coolDown=" + coolDown
				+ "]";
	}

}
