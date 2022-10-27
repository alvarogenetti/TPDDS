package principal;

import java.sql.Time;

import enumerations.EstadoCuestionario;

public class Cuestionario {
	public String nombre;
	public Time tiempo;
	public EstadoCuestionario estado;
	public String clave;
	
	public Cuestionario(String nombre, Time tiempo, EstadoCuestionario estado, String clave) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.estado = estado;
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Time getTiempo() {
		return tiempo;
	}
	public void setTiempo(Time tiempo) {
		this.tiempo = tiempo;
	}
	public EstadoCuestionario getEstado() {
		return estado;
	}
	public void setEstado(EstadoCuestionario estado) {
		this.estado = estado;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
