package com.courseSpring.course.repositories;

import com.courseSpring.course.entities.Category;
import com.courseSpring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long>{
}
