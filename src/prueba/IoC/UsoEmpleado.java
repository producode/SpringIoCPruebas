package prueba.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SecretarioEmpleado Juan=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		DirectorEmpleado Maria=contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		
		System.out.println(Maria.getTarea());
		
		System.out.println(Maria.getInforme());
		
		System.out.println(Maria.getEmail());
		
		System.out.println(Maria.getNombreEmpresa());
		
		contexto.close();
	}

}
