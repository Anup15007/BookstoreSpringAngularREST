package com.cg.bookstore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.bookstore.beans.Order;

public interface OrderDAO extends JpaRepository<Order, Long>{
}
