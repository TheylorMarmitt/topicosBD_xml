package xmlTrabalho.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno {
	
	@XmlElement
	private String nome;
	
	@XmlElement
	private Disciplinas disciplinas;

	public Aluno() {
	}

	

	public Aluno(String nome, Disciplinas disciplinas) {
		super();
		this.nome = nome;
		this.disciplinas = disciplinas;
	}



	public String getNome() {
		return nome;
	}



	public Disciplinas getDisciplinas() {
		return disciplinas;
	}





	
	

}
