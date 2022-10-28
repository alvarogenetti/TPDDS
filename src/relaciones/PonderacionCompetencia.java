package relaciones;

import principal.Competencia;
import principal.Puesto;

public class PonderacionCompetencia {
	public Integer ponderacion;
	public Puesto puesto;
	public Competencia competencia;
	
	public PonderacionCompetencia(Integer ponderacion, Puesto puesto, Competencia competencia) {
		super();
		this.ponderacion = ponderacion;
		this.puesto = puesto;
		this.competencia = competencia;
	}
	public Integer getPonderacion() {
		return ponderacion;
	}
	public void setPonderacion(Integer ponderacion) {
		this.ponderacion = ponderacion;
	}
	public Puesto getPuesto() {
		return puesto;
	}
	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	public Competencia getCompetencia() {
		return competencia;
	}
	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

}
