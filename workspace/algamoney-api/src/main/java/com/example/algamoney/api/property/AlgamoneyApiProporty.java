package com.example.algamoney.api.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("algamoney")
public class AlgamoneyApiProporty {
	
	private String origemPermitida = "http://localhost:8080";
	
	public String getOrigemPermitida() {
		return origemPermitida;
	}


	public void setOrigemPermitida(String origemPermitida) {
		this.origemPermitida = origemPermitida;
	}


	private final Seguranca seguranca = new Seguranca();
	
	public Seguranca getSeguranca() {
		return seguranca;
	}
	
	
	public static class Seguranca {
		
		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
	}

}
