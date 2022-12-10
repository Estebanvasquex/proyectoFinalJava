package ProyectoFinal.ProyectoFinal.repository;

import ProyectoFinal.ProyectoFinal.model.Address;
import ProyectoFinal.ProyectoFinal.model.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
