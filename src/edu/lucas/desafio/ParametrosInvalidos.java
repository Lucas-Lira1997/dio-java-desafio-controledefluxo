package edu.lucas.desafio;

public class ParametrosInvalidos extends Exception {
	private int paramtroUm;
	private int parametroDois;
		
	public ParametrosInvalidos(int paramtroUm, int parametroDois) {
		super();
		this.paramtroUm = paramtroUm;
		this.parametroDois = parametroDois;	
	}

	@Override
	public String toString() {
		return "O segundo número (" + parametroDois + ") deve ser maior que o primeiro número (" + paramtroUm + ")";
	}
	
	
	
}
