package com.joselugo.controladores;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.HashMap; 
@Controller
public class ControladorRecetas {

	private static String[] listaRecetas = {"Pizza", "Espagueti", "Lasaña"};
	private static HashMap<String, String []> recetasConIngredientes = new HashMap<String, String[]>();
	
	
			public ControladorRecetas() {
				String [] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
				recetasConIngredientes.put("Pizza", pizza);
				String [] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
				recetasConIngredientes.put("Espagueti", espagueti);
				String [] lasaña = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
				recetasConIngredientes.put("Lasaña", lasaña);
			}
	
	@GetMapping("/recetas")
	public String ObtenerTodasLasRecetas(Model model) {
		model.addAttribute("listaRecetas", listaRecetas);
		 return "recetas.jsp";
		 
		
	
	
}
	@GetMapping("/recetas/{nombre}")
	public String obtenerRecetaPorNombre(@PathVariable String nombre,Model model ) {
    if (recetasConIngredientes.containsKey(nombre)) {
        model.addAttribute("nombreReceta", nombre);
        model.addAttribute("ingredientes", recetasConIngredientes.get(nombre));
    } else {
        model.addAttribute("error", "La receta no se encuentra en nuestra lista.");
    }
    return "detalleReceta.jsp"; // JSP para mostrar el detalle de la receta
}

	}
