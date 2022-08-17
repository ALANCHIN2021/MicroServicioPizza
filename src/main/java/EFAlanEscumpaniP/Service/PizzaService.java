package EFAlanEscumpaniP.Service;

import java.util.List;

import EFAlanEscumpaniP.Model.Pizza;



public interface PizzaService {
	
	List<Pizza> listar();
	Pizza ObtenerId(Integer id);	
	void guardar(Pizza pizza);
	void eliminar(Integer id);
	void actualizar(Pizza pizza);	

	void asignarClienteaPizza();
}
