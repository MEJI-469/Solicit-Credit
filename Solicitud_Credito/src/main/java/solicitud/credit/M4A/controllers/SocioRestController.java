package solicitud.credit.M4A.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ista.cursoM4A.models.entity.Cliente;
import solicitud.credit.M4A.models.entity.Socio;
import solicitud.credit.M4A.models.services.ISocioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;



@RestController
@RequestMapping("/api")
public class SocioRestController {

	@Autowired
	public ISocioService socioService;
	//Listas
	@GetMapping("/socios")
	public List<Socio> index() {
		return socioService.findAll();
	}	
	
	//Busqueda por id
		@GetMapping("/socios/{id}")
		public Socio  show(@PathVariable String id){
			return socioService.findById(id);
		}
		
		//insertar o actualizar en la base de datos
		@PostMapping("/socios")
		@ResponseStatus(HttpStatus.CREATED)
		public Socio create(@RequestBody Socio socio) {
			return socioService.save(socio);
		}
		//Eliminar
		@DeleteMapping("/socios/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)//mensaje actualizacion de los datos
		public void delete(@PathVariable String id) {
			socioService.delete(id);
		}
	
	// url para testear los datos
	//http://localhost:8080/api/socios
	
}
