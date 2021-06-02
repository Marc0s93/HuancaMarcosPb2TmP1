package ar.edu.unlam.pb2;

import java.util.LinkedList;

public class Pelicula extends Producto implements Vendible{
	
	private Genero generoEsperado;
	private Integer anioEstrenoEsperado;
	private String directorEsperado;
	
	private Double precioVenta;
	
	private LinkedList<String> actores= new LinkedList<String>();
	

	public Pelicula(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, Genero gENERO_ESPERADO,
			Integer aNO_DE_ESTRENO_ESPERADO, String dIRECTOR_ESPERADO) {
		super(cODIGO_ESPERADO,dESCRIPCION_ESPERADA);
		this.generoEsperado=gENERO_ESPERADO;
		this.anioEstrenoEsperado=aNO_DE_ESTRENO_ESPERADO;
		this.directorEsperado=dIRECTOR_ESPERADO;
	}

	public void agregarActor(String aCTOR_1_ESPERADO) {
		// TODO Auto-generated method stub
		this.actores.add(aCTOR_1_ESPERADO);
	}

	

	public Genero getGenero() {
		return generoEsperado;
	}

	public void setGenero(Genero generoEsperado) {
		this.generoEsperado = generoEsperado;
	}

	public Integer getAnoDeEstreno() {
		return anioEstrenoEsperado;
	}

	public void setAnoDeEstreno(Integer anioEstrenoEsperado) {
		this.anioEstrenoEsperado = anioEstrenoEsperado;
	}

	public String getDirector() {
		return directorEsperado;
	}

	public void setDirector(String directorEsperado) {
		this.directorEsperado = directorEsperado;
	}

	public Boolean actua(String aCTOR_1_ESPERADO) {
		for (String actor : this.actores) {
			if(actor.equals(aCTOR_1_ESPERADO)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Double getPrecioVenta() {
		return this.precioVenta;
	}

	@Override
	public void setPrecioVenta(Double precio) {
		this.precioVenta=precio;
	}
	
}
