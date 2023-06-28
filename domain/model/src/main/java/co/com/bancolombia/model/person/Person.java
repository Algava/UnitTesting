package co.com.bancolombia.model.person;
import co.com.bancolombia.model.address.Address;
import co.com.bancolombia.model.person.enums.IdType;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    private String id;
    private IdType idType;
    private String name;
    private String phone;
    private List<Address> addresses;

}
