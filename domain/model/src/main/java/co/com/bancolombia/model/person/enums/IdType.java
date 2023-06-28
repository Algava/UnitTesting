package co.com.bancolombia.model.person.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IdType {
    CC("Cédula de ciudadanía"),
    CE("Cédula de extranjería")
    ;

    private final String name;

}
