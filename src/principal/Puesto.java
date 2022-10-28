package principal;

import java.util.ArrayList;
import java.util.Objects;

import relaciones.PonderacionCompetencia;

public class Puesto {
	public Integer codigo;
	public String nombre;
	public String descripcion;
	public String empresa;
	
	public ArrayList<PonderacionCompetencia> ponderaciones;
	
	public Puesto(Integer codigo, String nombre, String descripcion, String empresa,
			ArrayList<PonderacionCompetencia> ponderaciones) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.empresa = empresa;
		this.ponderaciones = ponderaciones;
	}

	public Puesto(Integer codigo, String nombre, String descripcion, String empresa) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.empresa = empresa;
	}
	
	public ArrayList<PonderacionCompetencia> getPonderaciones() {
		return ponderaciones;
	}

	public void setPonderaciones(ArrayList<PonderacionCompetencia> ponderaciones) {
		this.ponderaciones = ponderaciones;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descripcion, empresa, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Puesto other = (Puesto) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(empresa, other.empresa) && Objects.equals(nombre, other.nombre);
	}
	
	
}
