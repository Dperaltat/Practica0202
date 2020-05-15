package Modelo;

public class LibroDigital extends Libro {

	private double valor;
	private double comision;

	public LibroDigital(String titulo, String autor, String edicion) {
		super(titulo, autor, edicion);
	}
	
	@Override
	public void calcularPrecio(double valor, double comision) {
		this.valor = valor;
		this.comision = comision;
		super.precio = valor + comision;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

}

