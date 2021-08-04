package one.meuprojeto.expert.productcatalog.repository;

import one.meuprojeto.expert.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findByName(String name);
}
