package solicitud.credit.M4A.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ingresos")
public class Ingreso {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	private String CedSocioIngr;
	private Double PorIntGanadIngr;
	private Double PorPenRecIngr;
	private Double PorAlquiVehiIngr;
	private Double PorArriReciIngr;
	private Double GananciaGanaIngr;
	private Double GananciaAgriIngr;
	private Double GananciaComerIngr;
	private Double SueldConyugIngr;
	private Double SueldSocioIngr;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCedSocioIngr() {
		return CedSocioIngr;
	}
	public void setCedSocioIngr(String cedSocioIngr) {
		CedSocioIngr = cedSocioIngr;
	}
	public Double getPorIntGanadIngr() {
		return PorIntGanadIngr;
	}
	public void setPorIntGanadIngr(Double porIntGanadIngr) {
		PorIntGanadIngr = porIntGanadIngr;
	}
	public Double getPorPenRecIngr() {
		return PorPenRecIngr;
	}
	public void setPorPenRecIngr(Double porPenRecIngr) {
		PorPenRecIngr = porPenRecIngr;
	}
	public Double getPorAlquiVehiIngr() {
		return PorAlquiVehiIngr;
	}
	public void setPorAlquiVehiIngr(Double porAlquiVehiIngr) {
		PorAlquiVehiIngr = porAlquiVehiIngr;
	}
	public Double getPorArriReciIngr() {
		return PorArriReciIngr;
	}
	public void setPorArriReciIngr(Double porArriReciIngr) {
		PorArriReciIngr = porArriReciIngr;
	}
	public Double getGananciaGanaIngr() {
		return GananciaGanaIngr;
	}
	public void setGananciaGanaIngr(Double gananciaGanaIngr) {
		GananciaGanaIngr = gananciaGanaIngr;
	}
	public Double getGananciaAgriIngr() {
		return GananciaAgriIngr;
	}
	public void setGananciaAgriIngr(Double gananciaAgriIngr) {
		GananciaAgriIngr = gananciaAgriIngr;
	}
	public Double getGananciaComerIngr() {
		return GananciaComerIngr;
	}
	public void setGananciaComerIngr(Double gananciaComerIngr) {
		GananciaComerIngr = gananciaComerIngr;
	}
	public Double getSueldConyugIngr() {
		return SueldConyugIngr;
	}
	public void setSueldConyugIngr(Double sueldConyugIngr) {
		SueldConyugIngr = sueldConyugIngr;
	}
	public Double getSueldSocioIngr() {
		return SueldSocioIngr;
	}
	public void setSueldSocioIngr(Double sueldSocioIngr) {
		SueldSocioIngr = sueldSocioIngr;
	}
	
}
