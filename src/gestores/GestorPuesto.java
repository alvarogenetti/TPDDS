package gestores;

import java.util.stream.Collectors;

//import dao.PuestoDao;
import dao.PuestoDaoImpl;
import dto.PuestoDTO;
import exceptions.PuestoYaExistenteException;
import principal.Puesto;

public class GestorPuesto {
		 //private PuestoDao puestoDao;
		 private static GestorPuesto gp;

		public void AltaPuesto(PuestoDTO puestoDTO) throws Exception{
			PuestoDaoImpl puestoDaoImpl = new PuestoDaoImpl();
			
			if(BuscarPuesto(puestoDTO) != null) {
				throw new PuestoYaExistenteException("El puesto ya existe");
			}else {
				puestoDaoImpl.crearPuesto(puestoDTO);
				
			}
		}
		public Puesto BuscarPuesto(PuestoDTO puestoDTO) {
			PuestoDaoImpl puestoDaoImpl = new PuestoDaoImpl();
			
			Puesto puesto = puestoDaoImpl.getAllPuestos().stream().filter(p -> p.getCodigo() == puestoDTO.getCodigo()).collect(Collectors.toList()).get(0);
			
			return puesto;
		}

		public static GestorPuesto getInstance(){
			if(gp==null) gp = new GestorPuesto();
	
			return gp;
		}

}
