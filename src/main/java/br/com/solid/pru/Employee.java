package br.com.solid.pru;
/**
 * Principio da responsabilidade única fala que as classes não deve fazer mais que uma unica função. 
 * 
 * Exemplo: 
 * - A classe de repositorio nao pode fazer regras de negocios ou controle ou modelos, 
 * 	 mas somente a funçao de repositorio.
 * 
 * - A classe Employee nao pode fazer a funçao de cook(), prune(), paint() e drive(), por isso ela deve ser 
 * 	 refatorada para atender os criterios PRU.
 */

public class Employee {

	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
