package com.courseSpring.course.repositories;

import com.courseSpring.course.entities.OrderItem;
import com.courseSpring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
}
