package solicitud.credit.M4A.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="creditos_ativos")
public class CreditoActivo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	private String CedSocioCredAct;
	private Double BienMuebCredAct;
	private Double VehicuCredAct;
	private Double HerrMaquiCredAct;
	private Double InverGanCredAct;
	private Double InverCultCredAct;
	private Double InvenMercadeCredAct;
	private Double CuentCobraCredAct;
	private Double DepositInstCredAct;
	private Double CajaCredAct;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCedSocioCredAct() {
		return CedSocioCredAct;
	}
	public void setCedSocioCredAct(String cedSocioCredAct) {
		CedSocioCredAct = cedSocioCredAct;
	}
	public Double getBienMuebCredAct() {
		return BienMuebCredAct;
	}
	public void setBienMuebCredAct(Double bienMuebCredAct) {
		BienMuebCredAct = bienMuebCredAct;
	}
	public Double getVehicuCredAct() {
		return VehicuCredAct;
	}
	public void setVehicuCredAct(Double vehicuCredAct) {
		VehicuCredAct = vehicuCredAct;
	}
	public Double getHerrMaquiCredAct() {
		return HerrMaquiCredAct;
	}
	public void setHerrMaquiCredAct(Double herrMaquiCredAct) {
		HerrMaquiCredAct = herrMaquiCredAct;
	}
	public Double getInverGanCredAct() {
		return InverGanCredAct;
	}
	public void setInverGanCredAct(Double inverGanCredAct) {
		InverGanCredAct = inverGanCredAct;
	}
	public Double getInverCultCredAct() {
		return InverCultCredAct;
	}
	public void setInverCultCredAct(Double inverCultCredAct) {
		InverCultCredAct = inverCultCredAct;
	}
	public Double getInvenMercadeCredAct() {
		return InvenMercadeCredAct;
	}
	public void setInvenMercadeCredAct(Double invenMercadeCredAct) {
		InvenMercadeCredAct = invenMercadeCredAct;
	}
	public Double getCuentCobraCredAct() {
		return CuentCobraCredAct;
	}
	public void setCuentCobraCredAct(Double cuentCobraCredAct) {
		CuentCobraCredAct = cuentCobraCredAct;
	}
	public Double getDepositInstCredAct() {
		return DepositInstCredAct;
	}
	public void setDepositInstCredAct(Double depositInstCredAct) {
		DepositInstCredAct = depositInstCredAct;
	}
	public Double getCajaCredAct() {
		return CajaCredAct;
	}
	public void setCajaCredAct(Double cajaCredAct) {
		CajaCredAct = cajaCredAct;
	}
	
	
}
