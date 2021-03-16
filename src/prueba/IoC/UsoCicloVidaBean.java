package prueba.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		DirectorEmpleado Juan=contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		
		System.out.println(Juan.getInforme());
		
		contexto.close();
	}

}
