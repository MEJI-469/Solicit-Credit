package solicitud.credit.M4A.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
@Entity
@Table(name="empresas", uniqueConstraints = {@UniqueConstraint(columnNames = {"cedula_socio"})})

public class Empresa implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String cedula_socio;
	private String ocupa_empresa;
	private String nom_empresa;
	private String direc_empresa;
	private String area_empresa;
	private int anios_empresa;
	private String telef_empresa;
	
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
	
	public String getOcupa_empresa() {
		return ocupa_empresa;
	}
	public void setOcupa_empresa(String ocupa_empresa) {
		this.ocupa_empresa = ocupa_empresa;
	}
	public String getNom_empresa() {
		return nom_empresa;
	}
	public void setNom_empresa(String nom_empresa) {
		this.nom_empresa = nom_empresa;
	}
	public String getDirec_empresa() {
		return direc_empresa;
	}
	public void setDirec_empresa(String direc_empresa) {
		this.direc_empresa = direc_empresa;
	}
	public String getArea_empresa() {
		return area_empresa;
	}
	public void setArea_empresa(String area_empresa) {
		this.area_empresa = area_empresa;
	}
	public int getAnios_empresa() {
		return anios_empresa;
	}
	public void setAnios_empresa(int anios_empresa) {
		this.anios_empresa = anios_empresa;
	}
	public String getTelef_empresa() {
		return telef_empresa;
	}
	public void setTelef_empresa(String telef_empresa) {
		this.telef_empresa = telef_empresa;
	}

	private static final long serialVersionUID = 1L;
	
}
