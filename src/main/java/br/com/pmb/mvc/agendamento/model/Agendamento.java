package br.com.pmb.mvc.agendamento.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendamento {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public String cliente;
	public LocalDate dataDaVisita;
	public String motivo;
	public String comentarios;
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public LocalDate getDataDaVisita() {
		return dataDaVisita;
	}
	public void setDataDaVisita(LocalDate dataDaVisita) {
		this.dataDaVisita = dataDaVisita;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
}
