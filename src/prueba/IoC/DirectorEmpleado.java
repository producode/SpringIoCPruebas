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
	
	//metodo init. Ejecutar tareas antes de que el bean esté disponible.
	public void metodoInicial() {
		System.out.println("Dentro del método init. Aca van las tareas a ejecutar antes de que el bean este listo");
	}
	
	// método destroy. Ejecutar tareas después de que el bean haya sido utilizado
	
	public void metodoFinal() {
		System.out.println("Dentro del método destroy. Aca van las tareas a ejecutar despues de que el bean muera");
	}

}
