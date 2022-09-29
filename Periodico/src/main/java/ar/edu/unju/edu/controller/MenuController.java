package ar.edu.unju.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ar.unju.edu.edm.modelo.Usuario;

@Controller
public class MenuController {
	@GetMapping("/")
	  public String GetMenu(){
	    return "index";
	}
	
	@GetMapping("/IniciarSesion")
	public String GetSesion() {
	   return "InicioSesion";
	}
	
	@GetMapping("/Listar")
	  public String GetListar(){
	    return "ListarUsuarios";
	}
	
	@GetMapping("/Registrar")
	  public String GetForm(){
	    return "RegistroUsuario";
	}
	@GetMapping("/a")
	  public String Geta(){
	    return "a";
	}

	@Autowired
	Usuario nuevoUsuario;
	
	@GetMapping("/nuevoUsuario")
	public ModelAndView addUser(@RequestParam (name = "Apellido") String Apellido, @RequestParam (name = "Nombre") String Nombre, @RequestParam (name = "dni") int dni, Model model) {
		Usuario unUsuario = new Usuario(dni, Nombre, Apellido);
		ModelAndView modelView = new ModelAndView("usuarios");
		modelView.addObject("unUsuario", nuevoUsuario);
		return modelView;
	}
	
	
}
