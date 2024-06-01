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
	private Long Id;
	
	private String cedula_socio;
	private Double DeudAlmaCredPas;
	private Double DeudTarjCredPas;
	private Double DeudProvCredPas;
	private Double DeudBancCredPas;
	private Double DeudCoopCredPas;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCedula_socio() {
		return cedula_socio;
	}
	public void setCedula_socio(String cedula_socio) {
		this.cedula_socio = cedula_socio;
	}
	public Double getDeudAlmaCredPas() {
		return DeudAlmaCredPas;
	}
	public void setDeudAlmaCredPas(Double deudAlmaCredPas) {
		DeudAlmaCredPas = deudAlmaCredPas;
	}
	public Double getDeudTarjCredPas() {
		return DeudTarjCredPas;
	}
	public void setDeudTarjCredPas(Double deudTarjCredPas) {
		DeudTarjCredPas = deudTarjCredPas;
	}
	public Double getDeudProvCredPas() {
		return DeudProvCredPas;
	}
	public void setDeudProvCredPas(Double deudProvCredPas) {
		DeudProvCredPas = deudProvCredPas;
	}
	public Double getDeudBancCredPas() {
		return DeudBancCredPas;
	}
	public void setDeudBancCredPas(Double deudBancCredPas) {
		DeudBancCredPas = deudBancCredPas;
	}
	public Double getDeudCoopCredPas() {
		return DeudCoopCredPas;
	}
	public void setDeudCoopCredPas(Double deudCoopCredPas) {
		DeudCoopCredPas = deudCoopCredPas;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
