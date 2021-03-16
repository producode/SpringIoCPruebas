package prueba.IoC;

public class DirectorEmpleado implements Empleado {

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
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTarea() {
		// TODO Auto-generated method stub
		return "Tomar deciciones empresariales";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}
	
	//metodo init. Ejecutar tareas antes de que el bean est� disponible.
	public void metodoInicial() {
		System.out.println("Dentro del m�todo init. Aca van las tareas a ejecutar antes de que el bean este listo");
	}
	
	// m�todo destroy. Ejecutar tareas despu�s de que el bean haya sido utilizado
	
	public void metodoFinal() {
		System.out.println("Dentro del m�todo destroy. Aca van las tareas a ejecutar despues de que el bean muera");
	}

}
