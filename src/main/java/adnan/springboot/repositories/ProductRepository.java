package adnan.springboot.repositories;

import adnan.springboot.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
