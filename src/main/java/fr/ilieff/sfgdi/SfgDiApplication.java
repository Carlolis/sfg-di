package fr.ilieff.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import fr.ilieff.sfgdi.controller.ConstructorInjectedController;
import fr.ilieff.sfgdi.controller.I18nController;
import fr.ilieff.sfgdi.controller.MyController;
import fr.ilieff.sfgdi.controller.PropertyInjectedController;
import fr.ilieff.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		var myController = (MyController) ctx.getBean("myController");

		var i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("-------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("---- Property");

		var propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());



		System.out.println("---- Setter");

		var setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());


		System.out.println("---- Constructor");

		var constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}



}
