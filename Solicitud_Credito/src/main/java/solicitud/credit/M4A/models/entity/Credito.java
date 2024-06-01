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
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="creditos", uniqueConstraints = {@UniqueConstraint(columnNames = {"ced_socio_credit"})})
public class Credito implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	
	private String ced_socio_credit;
	private int NumSolicitud;
	private int plazo_credit;
	private Double val_soli_credit;
	private String provincia_credit;
	private String ciudad_credit;
	private String inversion_credit;
	private String tipo_credit;
	private String form_pag_credit;
	private String estado_credit;
	
	@Column(name="fech_soli")
	@Temporal(TemporalType.DATE)
	private Date fech_soli;
	
	@PrePersist
	public void prePersist() {
		fech_soli = new Date();
	}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCed_socio_credit() {
		return ced_socio_credit;
	}


	public void setCed_socio_credit(String ced_socio_credit) {
		this.ced_socio_credit = ced_socio_credit;
	}


	public int getNumSolicitud() {
		return NumSolicitud;
	}


	public void setNumSolicitud(int numSolicitud) {
		NumSolicitud = numSolicitud;
	}


	public int getPlazo_credit() {
		return plazo_credit;
	}


	public void setPlazo_credit(int plazo_credit) {
		this.plazo_credit = plazo_credit;
	}


	public Double getVal_soli_credit() {
		return val_soli_credit;
	}


	public void setVal_soli_credit(Double val_soli_credit) {
		this.val_soli_credit = val_soli_credit;
	}


	public String getProvincia_credit() {
		return provincia_credit;
	}


	public void setProvincia_credit(String provincia_credit) {
		this.provincia_credit = provincia_credit;
	}


	public String getCiudad_credit() {
		return ciudad_credit;
	}


	public void setCiudad_credit(String ciudad_credit) {
		this.ciudad_credit = ciudad_credit;
	}


	public String getInversion_credit() {
		return inversion_credit;
	}


	public void setInversion_credit(String inversion_credit) {
		this.inversion_credit = inversion_credit;
	}


	public String getTipo_credit() {
		return tipo_credit;
	}


	public void setTipo_credit(String tipo_credit) {
		this.tipo_credit = tipo_credit;
	}


	public String getForm_pag_credit() {
		return form_pag_credit;
	}


	public void setForm_pag_credit(String form_pag_credit) {
		this.form_pag_credit = form_pag_credit;
	}


	public String getEstado_credit() {
		return estado_credit;
	}


	public void setEstado_credit(String estado_credit) {
		this.estado_credit = estado_credit;
	}


	public Date getFech_soli() {
		return fech_soli;
	}


	public void setFech_soli(Date fech_soli) {
		this.fech_soli = fech_soli;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
