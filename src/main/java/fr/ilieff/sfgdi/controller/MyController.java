package fr.ilieff.sfgdi.controller;

import org.springframework.stereotype.Controller;
import fr.ilieff.sfgdi.services.GreetingService;

@Controller
public class MyController {

  private final GreetingService greetingService;



  public MyController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }



  public String sayHello() {


    return greetingService.sayGreeting();
  }
}
