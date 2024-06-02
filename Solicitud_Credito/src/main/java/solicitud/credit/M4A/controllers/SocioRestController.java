package solicitud.credit.M4A.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import solicitud.credit.M4A.models.entity.Socio;
import solicitud.credit.M4A.models.services.ISocioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
	
	//Buscar socio
	@GetMapping("/socios/{cedula}")
	public Socio show(@PathVariable String cedula) {
		return socioService.findById(cedula);
	}
	
	//Guardar Socio
	@PostMapping("/socios")
	@ResponseStatus(HttpStatus.CREATED)
	public Socio create(@RequestBody Socio socio) {
		//TODO: process POST request
		return socioService.save(socio);
	}
	
	//Editar Socio
	@PutMapping("/socios/{cedula}")
	@ResponseStatus(HttpStatus.CREATED)
	public Socio update(@RequestBody Socio socio, @PathVariable String cedula) {
		Socio socioActual = socioService.findById(cedula);
		socioActual.setNombre(socio.getNombre());
		socioActual.setApellido(socio.getApellido());
		socioActual.setFecha_nac(socio.getFecha_nac());
		socioActual.setNum_celular(socio.getNum_celular());
		socioActual.setGenero(socio.getGenero());
		socioActual.setEmail(socio.getEmail());
		socioActual.setLugar_nacimiento(socio.getLugar_nacimiento());
		socioActual.setPersonas_dependientes(socio.getPersonas_dependientes());
		socioActual.setProfecion(socio.getProfecion());
		socioActual.setDireccion(socio.getDireccion());
		socioActual.setProvincia(socio.getProvincia());
		socioActual.setCiudad(socio.getCiudad());
		socioActual.setParroquia(socio.getParroquia());
		socioActual.setSector(socio.getSector());
		socioActual.setReferencia(socio.getReferencia());
		socioActual.setTelefono(socio.getTelefono());
		socioActual.setTipo_casa(socio.getTipo_casa());
		socioActual.setTiempo_recidencia(socio.getTiempo_recidencia());
		socioActual.setPropietario(socio.getPropietario());
		return socioService.save(socioActual);
	}
	
	//Eliminar Socio
	@DeleteMapping("/socios/{cedula}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String cedula) {
		// TODO Auto-generated method stub
		socioService.delete(cedula);
	}
	
}
