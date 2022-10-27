package principal;

import java.sql.Time;

public class Evaluacion {
	public Time fechaInicio;
	public Time fechaFinal;
	public Integer maximoCandidatos;
	
	public Evaluacion(Time fechaInicio, Time fechaFinal, Integer maximoCandidatos) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.maximoCandidatos = maximoCandidatos;
	}
	public Time getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Time fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Time getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Time fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public Integer getMaximoCandidatos() {
		return maximoCandidatos;
	}
	public void setMaximoCandidatos(Integer maximoCandidatos) {
		this.maximoCandidatos = maximoCandidatos;
	}
	
}
