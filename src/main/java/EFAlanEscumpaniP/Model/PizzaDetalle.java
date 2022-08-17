package EFAlanEscumpaniP.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="pizzas_clientes")
public class PizzaDetalle {
	
	@Id
	private PizzaClienteFK fk= new PizzaClienteFK();

}
