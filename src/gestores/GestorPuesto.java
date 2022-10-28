package gestores;

import java.util.stream.Collectors;

//import dao.PuestoDao;
import dao.PuestoDaoImpl;
import dto.PuestoDTO;
import principal.Puesto;

public class GestorPuesto {
		 //private PuestoDao puestoDao;

		public void AltaPuesto(PuestoDTO puestoDTO) throws Exception{
			PuestoDaoImpl puestoDaoImpl = new PuestoDaoImpl();
			
			if(BuscarPuesto(puestoDTO) != null) {
				throw new Exception("El puesto ya existe");
			}else {
				puestoDaoImpl.crearPuesto(puestoDTO);
				
			}
		}
		public Puesto BuscarPuesto(PuestoDTO puestoDTO) {
			PuestoDaoImpl puestoDaoImpl = new PuestoDaoImpl();
			
			Puesto puesto = puestoDaoImpl.getAllPuestos().stream().filter(p -> p.getCodigo() == puestoDTO.getCodigo()).collect(Collectors.toList()).get(0);
			
			return puesto;
		}

}
