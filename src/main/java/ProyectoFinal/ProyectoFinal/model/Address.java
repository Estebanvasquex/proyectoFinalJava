package ProyectoFinal.ProyectoFinal.model;

import lombok.*;

import javax.management.ConstructorParameters;
import javax.persistence.*;


@Getter @Setter
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String street;
    private String number;
    private String location;
    private String provincia;

    public Address(String street, String number, String location, String provincia) {
        this.street = street;
        this.number = number;
        this.location = location;
        this.provincia = provincia;
    }



}
