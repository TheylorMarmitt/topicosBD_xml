package xmlTrabalho.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Alunos {
	
	@XmlElement(name="aluno")
	private List<Aluno> alunos;

	public Alunos() {
	
	}
	
	public Alunos(List<Aluno> alunos) {
		super();
		this.alunos = alunos;
	}

	public List<Aluno> getListaAlunos() {
		return alunos;
	}


}
