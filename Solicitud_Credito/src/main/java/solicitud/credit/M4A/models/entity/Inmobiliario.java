package solicitud.credit.M4A.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="inmobiliarios", uniqueConstraints = {@UniqueConstraint(columnNames = {"CedSocioInmobi"})})

public class Inmobiliario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	private String CedSocioInmobi;
	private String DireccInmobi;
	private Double ValorInmobi;
	private Boolean HipotecInmobi;
	private String InstituInmobi;
	private String TipPropieInmobi;
	
	
	public String getCedSocioInmobi() {
		return CedSocioInmobi;
	}
	public void setCedSocioInmobi(String cedSocioInmobi) {
		CedSocioInmobi = cedSocioInmobi;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getDireccInmobi() {
		return DireccInmobi;
	}
	public void setDireccInmobi(String direccInmobi) {
		DireccInmobi = direccInmobi;
	}
	public Double getValorInmobi() {
		return ValorInmobi;
	}
	public void setValorInmobi(Double valorInmobi) {
		ValorInmobi = valorInmobi;
	}
	public Boolean getHipotecInmobi() {
		return HipotecInmobi;
	}
	public void setHipotecInmobi(Boolean hipotecInmobi) {
		HipotecInmobi = hipotecInmobi;
	}
	public String getInstituInmobi() {
		return InstituInmobi;
	}
	public void setInstituInmobi(String instituInmobi) {
		InstituInmobi = instituInmobi;
	}
	public String getTipPropieInmobi() {
		return TipPropieInmobi;
	}
	public void setTipPropieInmobi(String tipPropieInmobi) {
		TipPropieInmobi = tipPropieInmobi;
	}
	
}
