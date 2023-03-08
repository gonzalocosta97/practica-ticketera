package ar.edu.unlam.gonzacostaweb.ticketera;

public abstract class Turno {
	
	private char identificador;
	
	private Integer numero;
	
	public Turno(char identificador, Integer numero) {
		
		this.identificador = identificador;
		this.numero = numero;
		
	}

	public char getIdentificador() {
		
		return identificador;
		
	}

	public Integer getNumero() {
		
		return numero;
		
	}
	
	@Override
	public String toString() {
		
		return identificador + "" + numero;
		
	}

}
