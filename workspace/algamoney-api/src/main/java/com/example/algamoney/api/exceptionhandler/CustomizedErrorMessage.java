package com.example.algamoney.api.exceptionhandler;

public class CustomizedErrorMessage {
	
	private String mensagemUsuario;
	private String mensagemDesenvolvedor;
	
	
	public CustomizedErrorMessage(String mensagemUsuario, String mensagemDesenvolvedor) {
		super();
		this.mensagemUsuario = mensagemUsuario;
		this.mensagemDesenvolvedor = mensagemDesenvolvedor;
	}
	
	public String getMensagemUsuario() {
		return mensagemUsuario;
	}
	public void setMensagemUsuario(String mensagemUsuario) {
		this.mensagemUsuario = mensagemUsuario;
	}
	public String getMensagemDesenvolvedor() {
		return mensagemDesenvolvedor;
	}
	public void setMensagemDesenvolvedor(String mensagemDesenvolvedor) {
		this.mensagemDesenvolvedor = mensagemDesenvolvedor;
	}
}
