package solicitud.credit.M4A.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="ingresos", uniqueConstraints = {@UniqueConstraint(columnNames = {"ced_socio_ingr"})})
public class Ingreso implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String ced_socio_ingr;
	private Double por_int_ganad_ingr;
	private Double por_pen_rec_ingr;
	private Double por_alqui_vehi_ingr;
	private Double por_arri_reci_ingr;
	private Double ganancia_gana_ingr;
	private Double ganancia_agri_ingr;
	private Double ganancia_comer_ingr;
	private Double sueld_conyug_ingr;
	private Double sueld_socio_ingr;
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCed_socio_ingr() {
		return ced_socio_ingr;
	}

	public void setCed_socio_ingr(String ced_socio_ingr) {
		this.ced_socio_ingr = ced_socio_ingr;
	}

	public Double getPor_int_ganad_ingr() {
		return por_int_ganad_ingr;
	}

	public void setPor_int_ganad_ingr(Double por_int_ganad_ingr) {
		this.por_int_ganad_ingr = por_int_ganad_ingr;
	}

	public Double getPor_pen_rec_ingr() {
		return por_pen_rec_ingr;
	}

	public void setPor_pen_rec_ingr(Double por_pen_rec_ingr) {
		this.por_pen_rec_ingr = por_pen_rec_ingr;
	}

	public Double getPor_alqui_vehi_ingr() {
		return por_alqui_vehi_ingr;
	}

	public void setPor_alqui_vehi_ingr(Double por_alqui_vehi_ingr) {
		this.por_alqui_vehi_ingr = por_alqui_vehi_ingr;
	}

	public Double getPor_arri_reci_ingr() {
		return por_arri_reci_ingr;
	}

	public void setPor_arri_reci_ingr(Double por_arri_reci_ingr) {
		this.por_arri_reci_ingr = por_arri_reci_ingr;
	}

	public Double getGanancia_gana_ingr() {
		return ganancia_gana_ingr;
	}

	public void setGanancia_gana_ingr(Double ganancia_gana_ingr) {
		this.ganancia_gana_ingr = ganancia_gana_ingr;
	}

	public Double getGanancia_agri_ingr() {
		return ganancia_agri_ingr;
	}

	public void setGanancia_agri_ingr(Double ganancia_agri_ingr) {
		this.ganancia_agri_ingr = ganancia_agri_ingr;
	}

	public Double getGanancia_comer_ingr() {
		return ganancia_comer_ingr;
	}

	public void setGanancia_comer_ingr(Double ganancia_comer_ingr) {
		this.ganancia_comer_ingr = ganancia_comer_ingr;
	}

	public Double getSueld_conyug_ingr() {
		return sueld_conyug_ingr;
	}

	public void setSueld_conyug_ingr(Double sueld_conyug_ingr) {
		this.sueld_conyug_ingr = sueld_conyug_ingr;
	}

	public Double getSueld_socio_ingr() {
		return sueld_socio_ingr;
	}

	public void setSueld_socio_ingr(Double sueld_socio_ingr) {
		this.sueld_socio_ingr = sueld_socio_ingr;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
