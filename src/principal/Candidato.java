package principal;

import java.util.Date;

import enumerations.TipoDoc;

public class Candidato {
	public Integer NroCandidato;
	public TipoDoc tipoDoc;
	public Integer documento;
	public String apellido;
	public String nombre;
	public Date fechaNacimiento;
	public String nacionalidad;
	public String escolaridad;
	public boolean eliminado;
	
	
	
	public Candidato(Integer nroCandidato, TipoDoc tipoDoc, Integer documento, String apellido, String nombre,
			Date fechaNacimiento, String nacionalidad, String escolaridad, boolean eliminado) {
		super();
		NroCandidato = nroCandidato;
		this.tipoDoc = tipoDoc;
		this.documento = documento;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.escolaridad = escolaridad;
		this.eliminado = eliminado;
	}
	public Integer getNroCandidato() {
		return NroCandidato;
	}
	public void setNroCandidato(Integer nroCandidato) {
		NroCandidato = nroCandidato;
	}
	public TipoDoc getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(TipoDoc tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public Integer getDocumento() {
		return documento;
	}
	public void setDocumento(Integer documento) {
		this.documento = documento;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getEscolaridad() {
		return escolaridad;
	}
	public void setEscolaridad(String escolaridad) {
		this.escolaridad = escolaridad;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}
