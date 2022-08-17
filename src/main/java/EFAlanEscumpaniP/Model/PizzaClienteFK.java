package EFAlanEscumpaniP.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class PizzaClienteFK implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4662828215017641363L;

	@Column(name="id_pizza", nullable = false, unique = true)
	private Integer idPizza;
	
	@Column(name="id_cliente", nullable = false, unique = true)
	private Integer idCliente;

}
