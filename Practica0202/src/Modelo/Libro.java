package Modelo;

public abstract class Libro {
	
	private String titulo;
	private String autor;
	private String edicon;
	protected double precio;
	
	public Libro(String titulo, String auto, String edicon) {
		super();
		this.titulo = titulo;
		this.autor = auto;
		this.edicon = edicon;
	
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAuto() {
		return autor;
	}

	public void setAuto(String auto) {
		this.autor = auto;
	}

	public String getEdicon() {
		return edicon;
	}

	public void setEdicon(String edicon) {
		this.edicon = edicon;
	}

	public double getPrecio() {
		return precio;
	}
	
	public abstract void calcularPrecio(double valor, double comision);
	
	
	

}
