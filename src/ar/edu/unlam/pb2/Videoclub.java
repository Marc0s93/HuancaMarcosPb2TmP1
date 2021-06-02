package ar.edu.unlam.pb2;

import java.util.LinkedList;

import ar.edu.unlam.banco.colecciones.Cuenta;

public class Videoclub {
	private String nombreVideoClub;
	private LinkedList<Producto> productos= new LinkedList<Producto>();
	private LinkedList<Cliente> clientes= new LinkedList<Cliente>();
	
	public Videoclub(String nombreVideoClub) {
	
		this.nombreVideoClub = nombreVideoClub;
	}
	
	public void agregarProducto(Producto elProducto)
	{
		this.productos.add(elProducto);
	}
	
	public void agregarCliente(Cliente elCliente) {
		this.clientes.add(elCliente);
	}

	public Producto buscarProducto(Producto nuevoProducto) {
		if(this.productos.contains(nuevoProducto)) {
			for(int i=0;i<this.productos.size();i++) {
				if(nuevoProducto.equals(this.productos.get(i)))
					return this.productos.get(i);
			}
		}
		return null;		
	}

	public boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		if(this.productos.contains(nuevoProducto) && this.clientes.contains(nuevoCliente)) {
			for(int i=0;i<this.clientes.size();i++) {
				for(int j=0;j<this.productos.size();j++) {
					if(this.productos.get(j).equals(nuevoProducto)) {
						this.productos.get(j).agregarAlCliente(nuevoCliente);
						this.productos.get(j).setEstadoActual(Estado.VENDIDO);
						this.clientes.get(i).obtenerProducto(this.productos.get(j));
					}
				}
				
				return true;
			}
		}
		return false;
	}

	public boolean alquilar(Producto nuevoProducto, Cliente nuevoCliente) {
		if(this.productos.contains(nuevoProducto) && this.clientes.contains(nuevoCliente)) {
			for(int i=0;i<this.clientes.size();i++) {
				for(int j=0;j<this.productos.size();j++) {
					if(this.productos.get(j).equals(nuevoProducto)) {
						this.productos.get(j).agregarAlCliente(nuevoCliente);
						this.productos.get(j).setEstadoActual(Estado.ALQUILADO);
						this.clientes.get(i).obtenerProducto(this.productos.get(j));
					}
				}
				
				return true;
			}
		}
		return false;
	}
	


}
