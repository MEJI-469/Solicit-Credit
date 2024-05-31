package solicitud.credit.M4A.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gastos")
public class Gastos implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String cedula_socio;
	private double transporte;
	private double pago_pensiones;
	private double vestuario;
	private double pago_deudas;
	private double salud;
	private double educacion;
	private double servicios_basicos;
	private double arriendos;
	private double alimentacion;
	
	
	
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
	public double getTransporte() {
		return transporte;
	}
	public void setTransporte(double transporte) {
		this.transporte = transporte;
	}
	public double getPago_pensiones() {
		return pago_pensiones;
	}
	public void setPago_pensiones(double pago_pensiones) {
		this.pago_pensiones = pago_pensiones;
	}
	public double getVestuario() {
		return vestuario;
	}
	public void setVestuario(double vestuario) {
		this.vestuario = vestuario;
	}
	public double getPago_deudas() {
		return pago_deudas;
	}
	public void setPago_deudas(double pago_deudas) {
		this.pago_deudas = pago_deudas;
	}
	public double getSalud() {
		return salud;
	}
	public void setSalud(double salud) {
		this.salud = salud;
	}
	public double getEducacion() {
		return educacion;
	}
	public void setEducacion(double educacion) {
		this.educacion = educacion;
	}
	public double getServicios_basicos() {
		return servicios_basicos;
	}
	public void setServicios_basicos(double servicios_basicos) {
		this.servicios_basicos = servicios_basicos;
	}
	public double getArriendos() {
		return arriendos;
	}
	public void setArriendos(double arriendos) {
		this.arriendos = arriendos;
	}
	public double getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(double alimentacion) {
		this.alimentacion = alimentacion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;
	
}
