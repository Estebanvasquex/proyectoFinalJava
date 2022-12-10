package ProyectoFinal.ProyectoFinal.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "dentist")
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String LastName;
    private String email;
    private String password;
    private String registration;


    public Dentist(String firstName, String lastName, String email, String password, String registration) {
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.password = password;
        this.registration = registration;
    }

}
