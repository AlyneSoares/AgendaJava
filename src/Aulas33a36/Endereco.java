package Aulas33a36;

public class Endereco {

	private String logradouro;
	private String completemento;
	private String bairro;
	private String numero;
	private String cep;
	private String cidade;
	private String estado;

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCompletemento() {
		return completemento;
	}
	public void setCompletemento(String completemento) {
		this.completemento = completemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", completemento="
				+ completemento + ", bairro=" + bairro + ", numero=" + numero
				+ ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado
				+ "]";
	}
}
