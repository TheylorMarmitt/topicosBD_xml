package xmlTrabalho.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Turma {

	@XmlAttribute(required = true)
	private String nome;
	
	@XmlElement
	private Alunos alunos;

	public Turma() {
		
	}



	public Turma(String nome, Alunos alunos) {
		super();
		this.nome = nome;
		this.alunos = alunos;
	}



	public Alunos getAlunos() {
		return alunos;
	}



	public String getNome() {
		return nome;
	}




	
	
	
}
