package com.courseSpring.course.repositories;

import com.courseSpring.course.entities.Userr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Userr,Long>{
}
