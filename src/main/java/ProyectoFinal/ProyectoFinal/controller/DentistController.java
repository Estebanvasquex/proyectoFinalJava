package ProyectoFinal.ProyectoFinal.controller;

import ProyectoFinal.ProyectoFinal.model.Dentist;
import ProyectoFinal.ProyectoFinal.service.DentistServiceImp;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dentist")
public class DentistController {

    private final DentistServiceImp dentistServiceImp;

    public DentistController(DentistServiceImp dentistServiceImp) {
        this.dentistServiceImp = dentistServiceImp;
    }

    @PostMapping("/save")
    public Dentist saveDentist(@RequestBody Dentist dentist){
        dentistServiceImp.saveDentist(dentist);
        return dentist;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Dentist>> listDentist(){
        List<Dentist> dentists = dentistServiceImp.listDentist();
        return new ResponseEntity<List<Dentist>>(dentists, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Dentist>> buscarOdontologoId(@PathVariable Long id) {
        Optional<Dentist> dentist = dentistServiceImp.findDentistId(id);
        if (dentist != null){
            return ResponseEntity.ok(dentist);
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PutMapping("/update")
    public ResponseEntity<Dentist> updateDentist(@RequestBody Dentist dentist) {
        ResponseEntity<Dentist> response = null;
        if (dentist.getId() != null && dentistServiceImp.findDentistId(dentist.getId())!= null) {
            dentistServiceImp.updateDentist(dentist);
            response = new  ResponseEntity(dentist, HttpStatus.OK);
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteDentistId(@PathVariable long id) {
        ResponseEntity<String> response;
        dentistServiceImp.deleteDentist(id);
        response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Delete");
        return response;
    }




}
