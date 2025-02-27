package app;

import dto.PuestoDTO;
import exceptions.PuestoYaExistenteException;
import gestores.GestorPuesto;

public class Main {

	public static void main(String[] args) {
		
		DarDeAlta();
		
}
	
	public static void DarDeAlta() {
		
		PuestoDTO puestoDTO = new PuestoDTO();
		puestoDTO.setCodigo(null);
		puestoDTO.setDescripcion(null);
		puestoDTO.setEmpresa(null);
		puestoDTO.setNombre(null);
		
		//se tendrian que crear instancias de PonderacionCompetencia con la competencia
		// y ponderacion para luego asignarle el Puesto
		puestoDTO.setPonderaciones(null);
		
		GestorPuesto gestorPuesto = new GestorPuesto();
		try{
			gestorPuesto.AltaPuesto(puestoDTO);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	}