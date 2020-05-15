package Modelo;

public abstract class Libro {
	
	private String titulo;
	private String auto;
	private String edicon;
	protected double precio;
	
	public Libro(String titulo, String auto, String edicon, double precio) {
		super();
		this.titulo = titulo;
		this.auto = auto;
		this.edicon = edicon;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
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

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract void calcularPrecio(double valor, double comision);
	
	
	

}
