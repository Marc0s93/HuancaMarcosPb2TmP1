package HuancaMarcospb2tmP1;

public class Libro extends Producto {

	private String autor;
	private String editorial;
	
	public Libro(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, String aUTOR_ESPERADO,
			String eDITORIAL_ESPERADA) {
		super(cODIGO_ESPERADO, dESCRIPCION_ESPERADA);
		this.autor=aUTOR_ESPERADO;
		this.editorial=eDITORIAL_ESPERADA;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	

}
