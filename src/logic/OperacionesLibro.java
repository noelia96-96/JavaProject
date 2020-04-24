package logic;

import model.Libro;

public class OperacionesLibro {
	
	public static int aplicarVale(Libro libro) {
		
			int precioConVale = libro.getPrecio() - libro.getvale();
			
		return precioConVale;
		
	}
	
	public static int sumarVale(Libro libro) {
		
		int precioConVale = libro.getPrecio() + libro.getvale();
		
	return precioConVale;
	
}
	
	public static boolean oferta (Libro libro) {
		boolean promocion = false;
		
		if(libro.getPrecio() >= 20 ) {
			promocion = true;
			System.out.println("El libro tiene un dos por uno");
		}else {
			promocion = false;
			System.out.println("Este libro próximamente tendrá una dos por uno");
		}
		return promocion;

}
}
