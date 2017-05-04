package guru.springframework.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.domain.Product;
import guru.springframework.repositories.ProductRepository;

@RestController
@RequestMapping("/service")
public class ProductRestController {

	@Autowired
	private ProductRepository produtoRepository;

	@RequestMapping(value = "/produtos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Product> consultar() {

		return (List<Product>) this.produtoRepository.findAll();

	}

}
