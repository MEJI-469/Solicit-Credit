package solicitud.credit.M4A.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="socio")

public class empresa implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String OcupaEmpresa;
	private String NomEmpresa;
	private String DirecEmpresa;
	private String AreaEmpresa;
	private int AniosEmpresa;
	private String TelefEmpresa;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOcupaEmpresa() {
		return OcupaEmpresa;
	}
	public void setOcupaEmpresa(String ocupaEmpresa) {
		OcupaEmpresa = ocupaEmpresa;
	}
	public String getNomEmpresa() {
		return NomEmpresa;
	}
	public void setNomEmpresa(String nomEmpresa) {
		NomEmpresa = nomEmpresa;
	}
	public String getDirecEmpresa() {
		return DirecEmpresa;
	}
	public void setDirecEmpresa(String direcEmpresa) {
		DirecEmpresa = direcEmpresa;
	}
	public String getAreaEmpresa() {
		return AreaEmpresa;
	}
	public void setAreaEmpresa(String areaEmpresa) {
		AreaEmpresa = areaEmpresa;
	}
	public int getAniosEmpresa() {
		return AniosEmpresa;
	}
	public void setAniosEmpresa(int aniosEmpresa) {
		AniosEmpresa = aniosEmpresa;
	}
	public String getTelefEmpresa() {
		return TelefEmpresa;
	}
	public void setTelefEmpresa(String telefEmpresa) {
		TelefEmpresa = telefEmpresa;
	}
	
	
}
