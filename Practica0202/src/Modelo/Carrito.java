package Modelo;

import java.util.List;

public class Carrito {
	
	private int id;
	private List<Libro> libroList;
	private double total;
	private Usuario usuario;
	
	public Carrito(int id, List<Libro> libroList, double total, Usuario usuario) {
		super();
		this.id = id;
		this.libroList = libroList;
		this.total = total;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Libro> getLibroList() {
		return libroList;
	}

	public void setLibroList(List<Libro> libroList) {
		this.libroList = libroList;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Carrito [id=" + id + ", libroList=" + libroList + ", total=" + total + ", usuario=" + usuario + "]";
	}
	
	
}
