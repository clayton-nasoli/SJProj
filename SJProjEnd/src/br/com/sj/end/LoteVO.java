package br.com.sj.end;

public class LoteVO {
	private String numero;
	private String destinacao;
	private boolean isCondominio;
	
	
	public boolean isCondominio() {
		return isCondominio;
	}
	public void setCondominio(boolean isCondominio) {
		this.isCondominio = isCondominio;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDestinacao() {
		return destinacao;
	}
	public void setDestinacao(String destinacao) {
		this.destinacao = destinacao;
	}
}
