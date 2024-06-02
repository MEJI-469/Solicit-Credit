package solicitud.credit.M4A.models.services;

import java.util.List;

import solicitud.credit.M4A.models.entity.Socio;

public interface ISocioService {

	public List<Socio> findAll();
	
	public Socio save(Socio socio);
	
	public Socio findById(String cedula);
	
	public void delete(String cedula);
	
}
