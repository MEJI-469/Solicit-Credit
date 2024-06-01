package solicitud.credit.M4A.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="creditos_activos", uniqueConstraints = {@UniqueConstraint(columnNames = {"ced_socio_credit_act"})})
public class CreditoActivo implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String ced_socio_credit_act;
	private Double bien_muebcred_act;
	private Double vehicu_cred_act;
	private Double herr_maqui_cred_act;
	private Double inver_gan_cred_act;
	private Double inver_cult_cred_act;
	private Double inven_mercade_cred_act;
	private Double cuent_cobra_cred_act;
	private Double deposit_inst_cred_act;
	private Double caja_cred_act;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCed_socio_credit_act() {
		return ced_socio_credit_act;
	}


	public void setCed_socio_credit_act(String ced_socio_credit_act) {
		this.ced_socio_credit_act = ced_socio_credit_act;
	}


	public Double getBien_muebcred_act() {
		return bien_muebcred_act;
	}


	public void setBien_muebcred_act(Double bien_muebcred_act) {
		this.bien_muebcred_act = bien_muebcred_act;
	}


	public Double getVehicu_cred_act() {
		return vehicu_cred_act;
	}


	public void setVehicu_cred_act(Double vehicu_cred_act) {
		this.vehicu_cred_act = vehicu_cred_act;
	}


	public Double getHerr_maqui_cred_act() {
		return herr_maqui_cred_act;
	}


	public void setHerr_maqui_cred_act(Double herr_maqui_cred_act) {
		this.herr_maqui_cred_act = herr_maqui_cred_act;
	}


	public Double getInver_gan_cred_act() {
		return inver_gan_cred_act;
	}


	public void setInver_gan_cred_act(Double inver_gan_cred_act) {
		this.inver_gan_cred_act = inver_gan_cred_act;
	}


	public Double getInver_cult_cred_act() {
		return inver_cult_cred_act;
	}


	public void setInver_cult_cred_act(Double inver_cult_cred_act) {
		this.inver_cult_cred_act = inver_cult_cred_act;
	}


	public Double getInven_mercade_cred_act() {
		return inven_mercade_cred_act;
	}


	public void setInven_mercade_cred_act(Double inven_mercade_cred_act) {
		this.inven_mercade_cred_act = inven_mercade_cred_act;
	}


	public Double getCuent_cobra_cred_act() {
		return cuent_cobra_cred_act;
	}


	public void setCuent_cobra_cred_act(Double cuent_cobra_cred_act) {
		this.cuent_cobra_cred_act = cuent_cobra_cred_act;
	}


	public Double getDeposit_inst_cred_act() {
		return deposit_inst_cred_act;
	}


	public void setDeposit_inst_cred_act(Double deposit_inst_cred_act) {
		this.deposit_inst_cred_act = deposit_inst_cred_act;
	}


	public Double getCaja_cred_act() {
		return caja_cred_act;
	}


	public void setCaja_cred_act(Double caja_cred_act) {
		this.caja_cred_act = caja_cred_act;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
