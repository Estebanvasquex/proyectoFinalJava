package ProyectoFinal.ProyectoFinal.service;

import ProyectoFinal.ProyectoFinal.model.Dentist;
import ProyectoFinal.ProyectoFinal.repository.DentistRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DentistServiceImp implements DentistService {

    private static final Logger LOGGER = Logger.getLogger(DentistServiceImp.class);

    //Inyección de dependencia
    private final DentistRepository dentistRepository;
    @Autowired
    public DentistServiceImp(DentistRepository dentistRepository) {

        this.dentistRepository = dentistRepository;
    }


    @Override
    public Dentist saveDentist(Dentist dentist) {
        LOGGER.info("Save Dentist wiht name: " + dentist.getFirstName() );
        return dentistRepository.save(dentist);

    }

    @Override
    public List<Dentist> listDentist() {
        LOGGER.info("list Dentist");

        return dentistRepository.findAll();
    }

    @Override
    public Optional<Dentist> findDentistId(Long id) {
        Optional<Dentist> dentist = dentistRepository.findById(id);

       if(dentist.isEmpty()){
           LOGGER.info("Dentist with id: " + id + " No se encuentra");

       }
        LOGGER.info("find Dentist with id: " + id);
        return dentist;
    }

    @Override
    public void updateDentist(Dentist dentist) {
        LOGGER.info("Update Dentist with name: " + dentist.getFirstName());
        dentistRepository.save(dentist);

    }

    //En este metodo se requiere usar exception para que al no encontrar el id pueda manejar el error, por
    //ahora se encuentra con el error al no encontrar el id, en el proximo commit se agrega exception
    @Override
    public void deleteDentist(Long id) {
        LOGGER.info("Delete dentist wiht id: " + id);
        if(Objects.nonNull(findDentistId(id))){
            dentistRepository.deleteById(id);
        }

    }
}
