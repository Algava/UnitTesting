package co.com.bancolombia.config;

import co.com.bancolombia.model.person.gateways.PersonRepository;
import co.com.bancolombia.usecase.person.PersonUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfig {

    @Bean
    public PersonUseCase personUseCase(PersonRepository personRepository) {
        return new PersonUseCase(personRepository);
    }

}
