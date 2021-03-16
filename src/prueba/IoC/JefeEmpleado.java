package prueba.IoC;

public class JefeEmpleado implements Empleado{
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;

	@Override
	public String getTarea() {
		return "Gestionando tareas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos" + informeNuevo.getInforme();
	}
	
}
