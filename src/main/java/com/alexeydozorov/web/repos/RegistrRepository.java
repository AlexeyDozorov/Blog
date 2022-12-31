package com.alexeydozorov.web.repos;

import com.alexeydozorov.web.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface RegistrRepository extends CrudRepository<Orders, Integer> {
}
