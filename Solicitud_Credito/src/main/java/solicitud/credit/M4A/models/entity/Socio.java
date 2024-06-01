package solicitud.credit.M4A.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="socios")
public class Socio implements Serializable{
	
	private Long id;
	
	@Id
	private String cedula;
	
	private String nombre;
	private String apellido;
	private Date fecha_nac;
	private String num_celular;
	private String genero;
	private String email;
	private String lugar_nacimiento;
	private String personas_dependientes;
	private String profecion;
	private String direccion;
	private String provincia;
	private String ciudad;
	private String parroquia;
	private String sector;
	private String referencia;
	private String telefono;
	private String tipo_casa;
	private String tiempo_recidencia;
	private String propietario;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "CedSocioInmobi")
	private List<Inmobiliario> inmobiliario;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cedula_socio")
	private List<Gastos> gastos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "CedSocioIngr")
	private List<Ingreso> ingreso;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cedula_socio")
	private List<Negocio> negocio;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cedula_socio")
	private List<Registros_Personales> registros;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cedula_socio")
	private List<Conyugue> conyugue;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "CedSocioCredit")
	private List<Credito> credito;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "CedSocioCredit")
	private List<CreditoActivo> creditoactivo;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cedula_socio")
	private List<CreditoPasivo> creditopasivo;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cedula_socio")
	private List<Empresa> empresa;
	
	
	public List<Inmobiliario> getInmobiliario() {
		return inmobiliario;
	}
	public void setInmobiliario(List<Inmobiliario> inmobiliario) {
		this.inmobiliario = inmobiliario;
	}
	public List<Gastos> getGastos() {
		return gastos;
	}
	public void setGastos(List<Gastos> gastos) {
		this.gastos = gastos;
	}
	public List<Ingreso> getIngreso() {
		return ingreso;
	}
	public void setIngreso(List<Ingreso> ingreso) {
		this.ingreso = ingreso;
	}
	public List<Negocio> getNegocio() {
		return negocio;
	}
	public void setNegocio(List<Negocio> negocio) {
		this.negocio = negocio;
	}
	public List<Registros_Personales> getRegistros() {
		return registros;
	}
	public void setRegistros(List<Registros_Personales> registros) {
		this.registros = registros;
	}
	public List<Conyugue> getConyugue() {
		return conyugue;
	}
	public void setConyugue(List<Conyugue> conyugue) {
		this.conyugue = conyugue;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public String getNum_celular() {
		return num_celular;
	}
	public void setNum_celular(String num_celular) {
		this.num_celular = num_celular;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLugar_nacimiento() {
		return lugar_nacimiento;
	}
	public void setLugar_nacimiento(String lugar_nacimiento) {
		this.lugar_nacimiento = lugar_nacimiento;
	}
	public String getPersonas_dependientes() {
		return personas_dependientes;
	}
	public void setPersonas_dependientes(String personas_dependientes) {
		this.personas_dependientes = personas_dependientes;
	}
	public String getProfecion() {
		return profecion;
	}
	public void setProfecion(String profecion) {
		this.profecion = profecion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getParroquia() {
		return parroquia;
	}
	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo_casa() {
		return tipo_casa;
	}
	public void setTipo_casa(String tipo_casa) {
		this.tipo_casa = tipo_casa;
	}
	public String getTiempo_recidencia() {
		return tiempo_recidencia;
	}
	public void setTiempo_recidencia(String tiempo_recidencia) {
		this.tiempo_recidencia = tiempo_recidencia;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	private static final long serialVersionUID = 1L;
}

