package dao;

import java.util.ArrayList;

import dto.PuestoDTO;
import principal.Puesto;

public interface PuestoDao {
	void crearPuesto(PuestoDTO puestoDTO);
	void modificarPuesto();
	void eliminarPuesto();
	ArrayList<Puesto> getAllPuestos();
}
