package xmlTrabalho;

import java.io.File;

import xmlTrabalho.conversor.ConverterXML;
import xmlTrabalho.model.Aluno;
import xmlTrabalho.model.Disciplina;
import xmlTrabalho.model.Turma;

public class Main {

	public static void main(String[] args) {
		
		ConverterXML<Turma> conversor = new ConverterXML<>(Turma.class);
		Turma turmaConv = conversor.gerarObj(new File("exercicio.xml"));
		
		// média do aluno
		Double soma;
		Integer contador;
		for (Aluno aluno : turmaConv.getAlunos().getListaAlunos()) {
			soma = 0.0;
			contador = 0;
			for (Disciplina disciplina : aluno.getDisciplinas().getListaDisciplinas()) {
				soma = soma + disciplina.getNota();
				contador++;
			}
			System.out.println("Media de "+ aluno.getNome()+ ": " + soma/contador);
		}
		
		// média da turma
		soma = 0.0;
		contador = 0;
		for (Aluno aluno : turmaConv.getAlunos().getListaAlunos()) {
			for (Disciplina disciplina : aluno.getDisciplinas().getListaDisciplinas()) {
				soma = soma + disciplina.getNota();
				contador++;
			}
		}
		System.out.println("Media da turma: " + soma/contador);
		
		
		// media disciplina
		Double disciplina1 = 0.0;
		Double disciplina2 = 0.0;
		int contador1 =0;
		int contador2 =0;
		for (Aluno aluno : turmaConv.getAlunos().getListaAlunos()) {
			for (Disciplina disciplina : aluno.getDisciplinas().getListaDisciplinas()) {
				if(disciplina.getCodigo().equals(1)) {
					disciplina1 = disciplina1 + disciplina.getNota();
					contador1++;
				}else if(disciplina.getCodigo().equals(2)){
					disciplina2 = disciplina2 + disciplina.getNota();
					contador2++;
				}
			}
		}
		System.out.println("Média disciplina 1: "+ disciplina1/contador1);
		System.out.println("Média disciplina 2: "+ disciplina2/contador2);

	}	 
		
}