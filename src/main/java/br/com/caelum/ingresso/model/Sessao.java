package br.com.caelum.ingresso.model;

import java.time.LocalTime;

public class Sessao {
	private Integer id;
	private Sala sala;
	private Filme filme;
	private LocalTime horario;

	public Integer getId() {
		return id;
	}

	void setId(Integer id) {
		this.id = id;
	}
	
	public Sala getSala(){
		return sala;
	}
	
	public void setSala(Sala sala){
		this.sala = sala;
	}
	public Filme getFilme(){
		return filme;
	}
	
	public void setFilme(Filme filme){
		this.filme = filme;
	}
	
	public LocalTime getHorario(){
		return horario;
	}
	public void setHorario(LocalTime horario){
		this.horario=horario;
	}

	public Sessao(LocalTime horario, Filme filme, Sala sala) {
		this.horario = horario;
		this.filme = filme;
		this.sala = sala;
	}

	public LocalTime getHorarioTermino() {
		return this.horario.plusMinutes(filme.getDuracao().toMinutes());
	}

}
