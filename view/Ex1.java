package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.model.Aluno;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos: ");
		int quantidade = sc.nextInt();

		
		Aluno[] alunos = new Aluno[quantidade];
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.next();
			
			
			
			double notas [] = new double[3];
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Digite a nota: ");
				notas[j] = sc.nextDouble();
			}
			
			
			Aluno aluno = new Aluno(nome,notas);
			alunos[i] = aluno;
			
			System.out.println(aluno.getNome());
			System.out.println(notas[0]);
			System.out.println(notas[1]);
			System.out.println(notas[2]);			
			
			
			
		}
		
		Aluno alunoMaiorNota = alunos[0];
		for(int w = 0; w < alunos.length; w++) {
			if(alunos[w].maiorNota() > alunoMaiorNota.maiorNota())
				alunoMaiorNota = alunos[w];

		}
		
		
		System.out.println(alunoMaiorNota.getNome() + " " + alunoMaiorNota.maiorNota());
	
	
	sc.close();
	}

}
