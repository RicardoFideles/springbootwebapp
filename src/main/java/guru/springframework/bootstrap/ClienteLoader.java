package guru.springframework.bootstrap;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.domain.Cliente;
import guru.springframework.domain.Product;
import guru.springframework.repositories.ClienteRepository;

@Component
public class ClienteLoader implements ApplicationListener<ContextRefreshedEvent> {

	private ClienteRepository clienteRepository;

	private Logger log = Logger.getLogger(ClienteLoader.class);

	@Autowired
	public void setProductRepository(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Ricardo");
		cliente.setCpf("000.000.000-12");
		cliente.setEndereco("Rio de Janeiro");
		clienteRepository.save(cliente);

        log.info("Saved Shirt - id: " + cliente.getId());
	}

}
