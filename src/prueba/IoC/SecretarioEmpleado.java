package prueba.IoC;

public class SecretarioEmpleado implements Empleado {

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;

	@Override
	public String getTarea() {
		// TODO Auto-generated method stub
		return "Gestionar las tareas de los Jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario " + informeNuevo.getInforme();
	}

}
