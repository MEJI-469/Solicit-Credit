package solicitud.credit.M4A.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="inmobiliarios", uniqueConstraints = {@UniqueConstraint(columnNames = {"ced_socio_inmobi"})})

public class Inmobiliario implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String ced_socio_inmobi;
	private String direcc_inmobi;
	private Double valor_inmobi;
	private Boolean hipotec_inmobi;
	private String institu_inmobi;
	private String tip_propie_inmobi;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCed_socio_inmobi() {
		return ced_socio_inmobi;
	}

	public void setCed_socio_inmobi(String ced_socio_inmobi) {
		this.ced_socio_inmobi = ced_socio_inmobi;
	}

	public String getDirecc_inmobi() {
		return direcc_inmobi;
	}

	public void setDirecc_inmobi(String direcc_inmobi) {
		this.direcc_inmobi = direcc_inmobi;
	}

	public Double getValor_inmobi() {
		return valor_inmobi;
	}

	public void setValor_inmobi(Double valor_inmobi) {
		this.valor_inmobi = valor_inmobi;
	}

	public Boolean getHipotec_inmobi() {
		return hipotec_inmobi;
	}

	public void setHipotec_inmobi(Boolean hipotec_inmobi) {
		this.hipotec_inmobi = hipotec_inmobi;
	}

	public String getInstitu_inmobi() {
		return institu_inmobi;
	}

	public void setInstitu_inmobi(String institu_inmobi) {
		this.institu_inmobi = institu_inmobi;
	}

	public String getTip_propie_inmobi() {
		return tip_propie_inmobi;
	}

	public void setTip_propie_inmobi(String tip_propie_inmobi) {
		this.tip_propie_inmobi = tip_propie_inmobi;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
