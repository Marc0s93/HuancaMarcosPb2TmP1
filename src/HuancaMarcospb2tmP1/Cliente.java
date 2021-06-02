package HuancaMarcospb2tmP1;

import java.util.LinkedList;

public class Cliente {
	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer codigo;
	private LinkedList<Producto> productos= new LinkedList<Producto>();
	
	public Cliente(Integer codigo, String apellido, String nombre, Integer edad) {
		this.codigo=codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LinkedList<Producto> getProductos() {
		return productos;
	}

	public void obtenerProducto(Producto elProducto) {
		this.productos.add(elProducto);
	}
	
	
}
