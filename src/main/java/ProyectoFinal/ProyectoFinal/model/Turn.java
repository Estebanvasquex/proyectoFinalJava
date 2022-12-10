package ProyectoFinal.ProyectoFinal.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "turn")
public class Turn {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    //private Patient patient;
    //private Dentist dentist;
    private String date_hour;


}
