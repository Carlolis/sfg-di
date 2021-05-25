package fr.ilieff.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import fr.ilieff.sfgdi.controller.SetterInjectedController;
import fr.ilieff.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {


  SetterInjectedController controller;

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }

  @BeforeEach
  void setUp() {
    controller = new SetterInjectedController();
    controller.setGreetingService(new ConstructorGreetingService());
  }



}
