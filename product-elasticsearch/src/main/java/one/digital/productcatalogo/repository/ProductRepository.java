package one.digital.productcatalogo.repository;

import one.digital.productcatalogo.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface ProductRepository extends CrudRepository<Product, Long> {
}
