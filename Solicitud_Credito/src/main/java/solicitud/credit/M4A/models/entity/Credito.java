package solicitud.credit.M4A.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="creditos")
public class Credito implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long Id;
	
	private String CedSocioCredit;
	private int NumSolicitud;
	private int PlazoCredit;
	private Double ValSoliCredit;
	private String ProvinciaCredit;
	private String CiudadCredit;
	private String InversionCredit;
	private String TipoCredit;
	private String FormPagCredit;
	private String EstadoCredit;
	
	@Column(name="fech_soli")
	@Temporal(TemporalType.DATE)
	private Date FechSoli;
	
	@PrePersist
	public void prePersist() {
		FechSoli = new Date();
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}	
	public String getCedSocioCredit() {
		return CedSocioCredit;
	}
	public void setCedSocioCredit(String cedSocioCredit) {
		CedSocioCredit = cedSocioCredit;
	}
	public int getNumSolicitud() {
		return NumSolicitud;
	}
	public void setNumSolicitud(int numSolicitud) {
		NumSolicitud = numSolicitud;
	}
	public Date getFechSoli() {
		return FechSoli;
	}
	public void setFechSoli(Date fechSoli) {
		FechSoli = fechSoli;
	}
	public int getPlazoCredit() {
		return PlazoCredit;
	}
	public void setPlazoCredit(int plazoCredit) {
		PlazoCredit = plazoCredit;
	}
	public Double getValSoliCredit() {
		return ValSoliCredit;
	}
	public void setValSoliCredit(Double valSoliCredit) {
		ValSoliCredit = valSoliCredit;
	}
	public String getProvinciaCredit() {
		return ProvinciaCredit;
	}
	public void setProvinciaCredit(String provinciaCredit) {
		ProvinciaCredit = provinciaCredit;
	}
	public String getCiudadCredit() {
		return CiudadCredit;
	}
	public void setCiudadCredit(String ciudadCredit) {
		CiudadCredit = ciudadCredit;
	}
	public String getInversionCredit() {
		return InversionCredit;
	}
	public void setInversionCredit(String inversionCredit) {
		InversionCredit = inversionCredit;
	}
	public String getTipoCredit() {
		return TipoCredit;
	}
	public void setTipoCredit(String tipoCredit) {
		TipoCredit = tipoCredit;
	}
	public String getFormPagCredit() {
		return FormPagCredit;
	}
	public void setFormPagCredit(String formPagCredit) {
		FormPagCredit = formPagCredit;
	}
	public String getEstadoCredit() {
		return EstadoCredit;
	}
	public void setEstadoCredit(String estadoCredit) {
		EstadoCredit = estadoCredit;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
