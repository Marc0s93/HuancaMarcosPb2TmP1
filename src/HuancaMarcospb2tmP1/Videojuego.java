package HuancaMarcospb2tmP1;

public class Videojuego extends Producto implements Alquilable {
	
	private TipoDeConsola consolaEsperada;
	
	private Double precioAlquiler;

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


	@Override
	public Double getPrecioAlquiler() {
		
		return this.precioAlquiler;
	}


	@Override
	public void setPrecioAlquiler(Double precio) {
		this.precioAlquiler=precio;
	}

	
	
}
