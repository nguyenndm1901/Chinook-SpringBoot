package com.java.chinook.interfaces;

import com.java.chinook.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByCustomerId(int customerId);
    List<Customer> findAllByOrderByCustomerIdAsc();
}
