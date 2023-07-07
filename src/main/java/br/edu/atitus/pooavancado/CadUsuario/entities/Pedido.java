package br.edu.atitus.pooavancado.CadUsuario.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido extends GenericEntity{

	private static final long serialVersionUID = 1L;
	private Date data;
	private double quantidade;

	@ManyToOne
	@JoinColumn(name = "id_pedido", nullable = false)
	private Produto produto;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

}
