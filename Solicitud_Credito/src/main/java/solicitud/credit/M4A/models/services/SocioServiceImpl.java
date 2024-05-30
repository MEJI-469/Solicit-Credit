package solicitud.credit.M4A.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import solicitud.credit.M4A.models.dao.ISocioDao;
import solicitud.credit.M4A.models.entity.Socio;

@Service
public class SocioServiceImpl implements ISocioService{

	@Autowired
	private ISocioDao SocioDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Socio> findAll() {
		// TODO Auto-generated method stub
		return (List<Socio>) SocioDao.findAll();
	}
	
	

}
