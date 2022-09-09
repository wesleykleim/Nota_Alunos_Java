package br.com.fiap.model;

public class Aluno {

	private String nome;
	private double notas[] = new double[3];
	
	public Aluno() {
		
	}
	public Aluno(String nome, double notas[]) {
		this.nome = nome;
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double[] getNota() {
		return notas;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNotas(double notas[]) {
		this.notas = notas;
	}
	
	public double maiorNota() {
		double maior = notas[0];
		for(int i = 0; i < notas.length; i++) {
			if (notas[i] > maior)
				maior = notas[i];
		}
	return maior;
	}
}
