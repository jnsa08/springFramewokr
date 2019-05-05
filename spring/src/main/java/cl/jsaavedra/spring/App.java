package cl.jsaavedra.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.jsaavedra.beans.Persona;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("cl/jsaavedra/xml/beans.xml");

		Persona per = (Persona) appContext.getBean("persona"); // o (Persona) appContext.getBean(Persona.class)

		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre()
				+ " " + per.getCiudad().getNombre());
		
		((ConfigurableApplicationContext) appContext).close();

	}

}
