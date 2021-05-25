package fr.ilieff.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18NSpanishGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    // TODO Auto-generated method stub
    return "Hola Mundo -ES";
  }

}
