package ProyectoFinal.ProyectoFinal.repository;

import ProyectoFinal.ProyectoFinal.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist,Long> {
}
