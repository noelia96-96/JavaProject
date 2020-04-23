package controller;

import logic.OperacionesLibro;
import model.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear un nuevo libro
		Libro libro = new Libro();
		
		libro.setTitulo("Sol");
		libro.setAutor("Ari");
		libro.setEditorial("Eclipse");
		libro.setPrecio(20);
		libro.setvale(5);
		
		System.out.println("Datos del libro: " + libro.toString());
		
		System.out.println("El precio del libro aplicando el vale es: " + OperacionesLibro.aplicarVale(libro) + "€");
		
		OperacionesLibro.oferta(libro);

	}

}
