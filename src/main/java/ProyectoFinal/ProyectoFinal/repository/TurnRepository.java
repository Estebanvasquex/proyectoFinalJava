package ProyectoFinal.ProyectoFinal.repository;

import ProyectoFinal.ProyectoFinal.model.Patient;
import ProyectoFinal.ProyectoFinal.model.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends JpaRepository<Turn,Long> {
}
