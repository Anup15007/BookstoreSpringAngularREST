package com.cg.bookstore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer extends JpaRepository<Customer, Long> {

}
