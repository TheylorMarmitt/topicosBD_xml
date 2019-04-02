package xmlTrabalho.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disciplina {

	@XmlAttribute
	private Integer codigo;
	
	@XmlAttribute
	private String nome;
	
	@XmlElement
	private Double nota;
	
	
	public Disciplina() {
	}

	public Disciplina(Integer codigo, String nome, Double nota) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.nota = nota;
	}
	
	
	

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Double getNota() {
		return nota;
	}



	
}
