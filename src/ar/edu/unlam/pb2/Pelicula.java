package ar.edu.unlam.pb2;

public class Pelicula {
	private Integer codigoEsperado;
	private String descripcionEsperada;
	private Genero generoEsperado;
	private Integer anioEstrenoEsperado;
	private String directorEsperado;
	

	public Pelicula(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, Genero gENERO_ESPERADO,
			Integer aNO_DE_ESTRENO_ESPERADO, String dIRECTOR_ESPERADO) {
		this.codigoEsperado=cODIGO_ESPERADO;
		this.descripcionEsperada=dESCRIPCION_ESPERADA;
		this.generoEsperado=gENERO_ESPERADO;
		this.anioEstrenoEsperado=aNO_DE_ESTRENO_ESPERADO;
		this.directorEsperado=dIRECTOR_ESPERADO;
	}

	public void agregarActor(String aCTOR_1_ESPERADO) {
		// TODO Auto-generated method stub
		
	}

	public Integer getCodigo() {
		return codigoEsperado;
	}

	public void setCodigo(Integer codigoEsperado) {
		this.codigoEsperado = codigoEsperado;
	}

	public String getDescripcion() {
		return descripcionEsperada;
	}

	public void setDescripcion(String descripcionEsperada) {
		this.descripcionEsperada = descripcionEsperada;
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

	public Object actua(String aCTOR_1_ESPERADO) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
