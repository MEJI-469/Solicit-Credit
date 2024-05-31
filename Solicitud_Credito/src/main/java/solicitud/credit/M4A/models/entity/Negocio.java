package solicitud.credit.M4A.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "negocios")
public class Negocio implements Serializable{

	
	private int id;
	
	@Id
	private String ruc;
	
	private String cedula_socio;
	private int antiguedad;
	private int num_empleados;
	private int locales;
	private String lugar_ventas;
	private int tiempo_local;
	private boolean local_hipotecado;
	private String ciudad;
	private String direccion;
	private String telefono;
	private String referencia;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getCedula_socio() {
		return cedula_socio;
	}
	public void setCedula_socio(String cedula_socio) {
		this.cedula_socio = cedula_socio;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public int getNum_empleados() {
		return num_empleados;
	}
	public void setNum_empleados(int num_empleados) {
		this.num_empleados = num_empleados;
	}
	public int getLocales() {
		return locales;
	}
	public void setLocales(int locales) {
		this.locales = locales;
	}
	public String getLugar_ventas() {
		return lugar_ventas;
	}
	public void setLugar_ventas(String lugar_ventas) {
		this.lugar_ventas = lugar_ventas;
	}
	public int getTiempo_local() {
		return tiempo_local;
	}
	public void setTiempo_local(int tiempo_local) {
		this.tiempo_local = tiempo_local;
	}
	public boolean isLocal_hipotecado() {
		return local_hipotecado;
	}
	public void setLocal_hipotecado(boolean local_hipotecado) {
		this.local_hipotecado = local_hipotecado;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	private static final long serialVersionUID = 1L;
	
}
