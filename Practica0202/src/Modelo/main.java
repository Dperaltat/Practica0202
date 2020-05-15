package Modelo;

public class main {

	public static void main(String[] args) {
		Libro libro1 = new LibroDigital("El principito", "Antoine de Saint-Exupéry", "Edición de Lujo");
		libro1.calcularPrecio(145.0, 12.0);
		
		
		Libro libro2 = new LibroFisico("DONDE SURGEN LAS SOMBRAS", "David Lozano Garbala", "Tercera edición");
		libro2.calcularPrecio(20.0, 6.50);

		System.out.println(libro1.getTitulo() +"::__" + libro1.getPrecio() +"$");
		System.out.println(libro2.getTitulo() +"::__" + libro2.getPrecio() +"$");
 
		
	}

}
