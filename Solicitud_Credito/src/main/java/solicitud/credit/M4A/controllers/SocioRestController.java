package solicitud.credit.M4A.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import solicitud.credit.M4A.models.entity.Socio;
import solicitud.credit.M4A.models.services.ISocioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



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
	// url para testear los datos
	//http://localhost:8080/api/socios
	
}
