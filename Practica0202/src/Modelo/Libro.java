package Modelo;

public class Libro {
	
	private int id;
	private String titulo;
	private String autor;
	private String Edicion;
	private int precio;
	
	public Libro(int id, String titulo, String autor, String edicion, int precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		Edicion = edicion;
		this.precio = precio;
	}
	
	public Libro() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEdicion() {
		return Edicion;
	}

	public void setEdicion(String edicion) {
		Edicion = edicion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", Edicion=" + Edicion + ", precio="
				+ precio + "]";
	}

	
}

