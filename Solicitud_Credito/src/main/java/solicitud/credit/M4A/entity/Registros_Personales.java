package solicitud.credit.M4A.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registros")
public class Registros_Personales implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String cedula_socio;
	private String buro;
	private String referencias_c;
	private String c_crediticio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula_socio() {
		return cedula_socio;
	}
	public void setCedula_socio(String cedula_socio) {
		this.cedula_socio = cedula_socio;
	}
	public String getBuro() {
		return buro;
	}
	public void setBuro(String buro) {
		this.buro = buro;
	}
	public String getReferencias_c() {
		return referencias_c;
	}
	public void setReferencias_c(String referencias_c) {
		this.referencias_c = referencias_c;
	}
	public String getC_crediticio() {
		return c_crediticio;
	}
	public void setC_crediticio(String c_crediticio) {
		this.c_crediticio = c_crediticio;
	}
	
	private static final long serialVersionUID = 1L;
}
