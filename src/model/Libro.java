package model;

public class Libro {

	private String titulo;
	private String autor;
	private String editorial;
	private int precio;
	private int vale;

	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, String editorial, int precio, int vale) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.precio = precio;
		this.vale = vale;
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

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getvale() {
		return vale;
	}

	public void setvale(int vale) {
		this.vale = vale;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", precio=" + precio
				+ ", vale=" + vale + "]";
	}

	
}
