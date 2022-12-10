package ProyectoFinal.ProyectoFinal.model;


import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "name")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    private String email;
    private String password;
    private String dni;
    //private Address address;

    //todo:Error la palabra "currentDate" es reservada y genera error al pasar a sql, tener cuidad con esto.
    @Column(name = "registrationDate")
    private String currentDate;

    public Patient(String firstName, String lastName, String email, String password, String dni, String currentDate) {
        this.firstName = firstName;
        lastName = lastName;
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.currentDate = currentDate;
    }




}
