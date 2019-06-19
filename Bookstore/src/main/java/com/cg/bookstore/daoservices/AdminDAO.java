package com.cg.bookstore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.bookstore.beans.Admin;

public interface AdminDAO extends JpaRepository<Admin, String>{

}
