package curso;
import java.util.Date;

public class pessoa {
	
	private String nome;
	
	private String sobrenome;

	
	private Date dataNascimento3;
	
	private Date dataNascimento1;


	public String getNome() {
		return nome;
	}

	public Date getDataNascimento() {
		return dataNascimento3;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento3 = dataNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
}
