package ar.edu.unlam.pb2;

import java.util.LinkedList;

public class Producto {

	private Integer codigo;
	private String descripcion;
	private Estado estado;
	
	private LinkedList<Cliente> clientes= new LinkedList<Cliente>();
	
	public Producto(Integer codigo, String descripcion) {
	    
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.estado = Estado.DISPONIBLE;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Estado getEstadoActual() {
		return this.estado;
	}
	
	public void setEstadoActual(Estado elEstado) {
		this.estado=elEstado;
	}

	public Cliente getQuienPoseeElProducto() {
		for (int i=0;i<this.clientes.size();i++) {
			LinkedList<Producto> losProductos = this.clientes.get(i).getProductos();
			for(int j=0;j<losProductos.size();j++) {
				if (losProductos.get(j).getCodigo()==this.codigo)
					return this.clientes.get(i);
			}
		}
		return null;
	}

	public void agregarAlCliente(Cliente nuevoCliente) {
		clientes.add(nuevoCliente);		
	}
	
}
