package co.com.bancolombia.api;

import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.usecase.person.PersonUseCase;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = PersonController.class)
@ContextConfiguration(classes = PersonController.class)
@AutoConfigureMockMvc(addFilters = false)
class PersonControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    PersonUseCase personUseCase;

    @Test
    void getAllPersons() throws Exception {
        when(personUseCase.listAllPersons()).thenReturn(personListStub());

        var result = mockMvc.perform(
                get("/person/all")
        ).andExpect(status().is4xxClientError()).andReturn();

        var actual = result.getResponse().getContentAsString();
        System.out.println(actual);
    }


    private List<Person> personListStub() {
        return List.of(Person.builder().name("Alejandro").phone("301302303").build());
    }

}
