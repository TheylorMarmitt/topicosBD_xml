package xmlTrabalho.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disciplinas {
	
	@XmlElement(name="disciplina")
	private List<Disciplina> disciplinas;

	public Disciplinas() {
	
	}
	
	public Disciplinas(List<Disciplina> disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getListaDisciplinas() {
		return disciplinas;
	}


}
