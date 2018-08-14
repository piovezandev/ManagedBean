import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserBean {

	private String nome;
	private String sobrenome;
	private String resposta;
	
	public String criaNome() {
		this.resposta = this.nome+" "+this.sobrenome;
		return resposta;
	}
	
	public String getResposta() {
		return resposta;
	}
	
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
