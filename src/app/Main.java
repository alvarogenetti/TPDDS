package app;

import dto.PuestoDTO;
import gestores.GestorPuesto;

public class Main {

	public static void main(String[] args) throws Exception {
		
		PuestoDTO puestoDTO = new PuestoDTO();
		puestoDTO.setCodigo(null);
		puestoDTO.setDescripcion(null);
		puestoDTO.setEmpresa(null);
		puestoDTO.setNombre(null);

		puestoDTO.setPonderaciones(null);
		
		GestorPuesto gestorPuesto = new GestorPuesto();
		
		gestorPuesto.AltaPuesto(puestoDTO);
	}

}
