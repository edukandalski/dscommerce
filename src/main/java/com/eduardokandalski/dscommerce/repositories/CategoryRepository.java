package com.eduardokandalski.dscommerce.repositories;

import com.eduardokandalski.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
