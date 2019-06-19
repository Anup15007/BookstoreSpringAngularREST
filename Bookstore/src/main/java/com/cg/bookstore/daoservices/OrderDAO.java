package com.cg.bookstore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.bookstore.beans.OrderItem;

public interface OrderDAO extends JpaRepository<OrderItem, Long>{
}
