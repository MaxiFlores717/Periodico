package ar.unju.edu.edm.modelo;

import java.beans.Transient;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Noticia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_noticia")
	private Integer id;

	@NotBlank
	private String Titulo;

	@NotBlank
	private String Desarrollo;

	@NotNull
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate Fecha;

	private String rutaPortada;

	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY) // muchos a muchos
	@JoinTable(name = "genero_noticia", joinColumns = @JoinColumn(name = "id_noticia"), inverseJoinColumns = @JoinColumn(name = "id_genero"))
	private List<Genero> generos;

	@Lob
	private String imagen;

}
