package com.customer.repository;

import com.customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends JpaRepository<Customer , Long> {
    Page<Customer> findAllByFirstNameContaining(String firstName , Pageable pageable);

    Customer findByFirstName(String user);

}
