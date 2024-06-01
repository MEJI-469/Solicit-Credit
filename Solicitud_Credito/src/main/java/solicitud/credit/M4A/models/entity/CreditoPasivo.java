package solicitud.credit.M4A.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="creditos_pasivos", uniqueConstraints = {@UniqueConstraint(columnNames = {"cedula_socio"})})
public class CreditoPasivo implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String cedula_socio;
	private Double deudalmacredpas;
	private Double deud_tarj_cred_pas;
	private Double deud_prov_cred_pas;
	private Double deud_banc_cred_pas;
	private Double deud_coop_cred_pas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCedula_socio() {
		return cedula_socio;
	}
	public void setCedula_socio(String cedula_socio) {
		this.cedula_socio = cedula_socio;
	}
	
	public Double getDeudalmacredpas() {
		return deudalmacredpas;
	}
	public void setDeudalmacredpas(Double deudalmacredpas) {
		this.deudalmacredpas = deudalmacredpas;
	}
	
	public Double getDeud_tarj_cred_pas() {
		return deud_tarj_cred_pas;
	}
	public void setDeud_tarj_cred_pas(Double deud_tarj_cred_pas) {
		this.deud_tarj_cred_pas = deud_tarj_cred_pas;
	}
	public Double getDeud_prov_cred_pas() {
		return deud_prov_cred_pas;
	}
	public void setDeud_prov_cred_pas(Double deud_prov_cred_pas) {
		this.deud_prov_cred_pas = deud_prov_cred_pas;
	}
	public Double getDeud_banc_cred_pas() {
		return deud_banc_cred_pas;
	}
	public void setDeud_banc_cred_pas(Double deud_banc_cred_pas) {
		this.deud_banc_cred_pas = deud_banc_cred_pas;
	}
	public Double getDeud_coop_cred_pas() {
		return deud_coop_cred_pas;
	}
	public void setDeud_coop_cred_pas(Double deud_coop_cred_pas) {
		this.deud_coop_cred_pas = deud_coop_cred_pas;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
