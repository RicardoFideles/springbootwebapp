package guru.springframework.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import guru.springframework.domain.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
}
