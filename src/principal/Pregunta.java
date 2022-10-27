package principal;

import java.util.ArrayList;

import enumerations.TipoRespuesta;

public class Pregunta {
	public String nombre;
	public String descripcion;
	public Integer puntaje;
	public TipoRespuesta tipoRespuesta;
	public ArrayList<Integer> valorOpciones;
	
	public Pregunta(String nombre, String descripcion, Integer puntaje, TipoRespuesta tipoRespuesta,
			ArrayList<Integer> valorOpciones) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.puntaje = puntaje;
		this.tipoRespuesta = tipoRespuesta;
		this.valorOpciones = valorOpciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}
	public TipoRespuesta getTipoRespuesta() {
		return tipoRespuesta;
	}
	public void setTipoRespuesta(TipoRespuesta tipoRespuesta) {
		this.tipoRespuesta = tipoRespuesta;
	}
	public ArrayList<Integer> getValorOpciones() {
		return valorOpciones;
	}
	public void setValorOpciones(ArrayList<Integer> valorOpciones) {
		this.valorOpciones = valorOpciones;
	}
	
	
}
