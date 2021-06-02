package ar.edu.unlam.pb2;

public class Videojuego extends Producto {
	
	private TipoDeConsola consolaEsperada;

	public Videojuego(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, TipoDeConsola cONSOLA_ESPERADA) {
		super(cODIGO_ESPERADO,dESCRIPCION_ESPERADA);
		this.consolaEsperada=cONSOLA_ESPERADA;
	}

	
	public TipoDeConsola getTipo() {
		return consolaEsperada;
	}

	public void setTipo(TipoDeConsola consolaEsperada) {
		this.consolaEsperada = consolaEsperada;
	}

	
	
}
