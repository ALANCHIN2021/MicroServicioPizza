package EFAlanEscumpaniP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFAlanEscumpaniP.Model.PizzaDetalle;
@Repository
public interface PizzaClienteRepository extends JpaRepository<PizzaDetalle, Integer> {

}
