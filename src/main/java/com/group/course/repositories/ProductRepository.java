package com.group.course.repositories;

import com.group.course.entities.Category;
import com.group.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
