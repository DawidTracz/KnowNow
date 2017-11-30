package com.dtdb.KnowNow.interfaces;

import com.dtdb.KnowNow.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
}
