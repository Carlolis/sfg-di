package fr.ilieff.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import fr.ilieff.sfgdi.controller.ConstructorInjectedController;
import fr.ilieff.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

  ConstructorInjectedController constructorInjectedController;

  @Test
  void getGreeting() {
    System.out.println(constructorInjectedController.getGreeting());
  }

  @BeforeEach
  void setUp() {
    constructorInjectedController =
        new ConstructorInjectedController(new ConstructorGreetingService());
  }

}
