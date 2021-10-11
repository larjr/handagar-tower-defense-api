package br.com.larjr.handagartowerdefenseapi.entidade;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Torre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(unique = true)
	String nome;

	@Column(unique = true)
	String descricao;

	Integer ataqueFisico;

	Integer ataqueMagico;

	Integer ataqueVelocidade;

	Integer defesa;

	Integer resistenciaMagica;

	Integer vida;

	Integer tenacidade;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "habilidadeEspecial_id")
	HabilidadeEspecial habilidadeEspecial;

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

	public Integer getAtaqueFisico() {
		return ataqueFisico;
	}

	public void setAtaqueFisico(Integer ataqueFisico) {
		this.ataqueFisico = ataqueFisico;
	}

	public Integer getAtaqueMagico() {
		return ataqueMagico;
	}

	public void setAtaqueMagico(Integer ataqueMagico) {
		this.ataqueMagico = ataqueMagico;
	}

	public Integer getAtaqueVelocidade() {
		return ataqueVelocidade;
	}

	public void setAtaqueVelocidade(Integer ataqueVelocidade) {
		this.ataqueVelocidade = ataqueVelocidade;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public Integer getResistenciaMagica() {
		return resistenciaMagica;
	}

	public void setResistenciaMagica(Integer resistenciaMagica) {
		this.resistenciaMagica = resistenciaMagica;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getTenacidade() {
		return tenacidade;
	}

	public void setTenacidade(Integer tenacidade) {
		this.tenacidade = tenacidade;
	}

	public HabilidadeEspecial getHabilidadeEspecial() {
		return habilidadeEspecial;
	}

	public void setHabilidadeEspecial(HabilidadeEspecial habilidadeEspecial) {
		this.habilidadeEspecial = habilidadeEspecial;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ataqueFisico, ataqueMagico, ataqueVelocidade, defesa, descricao, habilidadeEspecial, id,
				nome, resistenciaMagica, tenacidade, vida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Torre other = (Torre) obj;
		return Objects.equals(ataqueFisico, other.ataqueFisico) && Objects.equals(ataqueMagico, other.ataqueMagico)
				&& Objects.equals(ataqueVelocidade, other.ataqueVelocidade) && Objects.equals(defesa, other.defesa)
				&& Objects.equals(descricao, other.descricao)
				&& Objects.equals(habilidadeEspecial, other.habilidadeEspecial) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(resistenciaMagica, other.resistenciaMagica)
				&& Objects.equals(tenacidade, other.tenacidade) && Objects.equals(vida, other.vida);
	}

	@Override
	public String toString() {
		return "Torre [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", ataqueFisico=" + ataqueFisico
				+ ", ataqueMagico=" + ataqueMagico + ", ataqueVelocidade=" + ataqueVelocidade + ", defesa=" + defesa
				+ ", resistenciaMagica=" + resistenciaMagica + ", vida=" + vida + ", tenacidade=" + tenacidade
				+ ", habilidadeEspecial=" + habilidadeEspecial + "]";
	}

}
