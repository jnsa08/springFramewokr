package cl.jsaavedra.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cl.jsaavedra.beans.AppConfig;
import cl.jsaavedra.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		//Forma 1
		ApplicationContext  appContext = new AnnotationConfigApplicationContext(AppConfig.class);
				
		//Forma 2
		//AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		//appContext.register(AppConfig.class);
		//appContext.refresh();
		
		Mundo m = (Mundo) appContext.getBean("mundo");
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();

	}

}
