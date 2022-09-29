package ar.unju.edu.edm.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

public class Usuario {
	@Id
	@JoinColumn(name="dni")
	@JoinColumn(name="Nombre")
	@JoinColumn(name="Apellido")
	private int Dni;
	private String Nombre;
	private String Apellido;
	
	public Usuario(int dni, String nombre, String apellido) {
		super();
		Dni = dni;
		Nombre = nombre;
		Apellido = apellido;
	}

	public Usuario() {
		super();
	}
	
	
	
}
