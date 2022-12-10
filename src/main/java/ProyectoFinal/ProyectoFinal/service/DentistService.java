package ProyectoFinal.ProyectoFinal.service;

import ProyectoFinal.ProyectoFinal.model.Dentist;

import java.util.List;
import java.util.Optional;

public interface DentistService {

    //Metodo para guardar un odontologo
    public Dentist saveDentist(Dentist dentist);

    List<Dentist> listDentist();

    public Optional<Dentist> findDentistId(Long id);

    public  void updateDentist(Dentist dentist);

    public void deleteDentist(Long id);

    //List<Dentist> findDentistLastName(String lastName);


}
