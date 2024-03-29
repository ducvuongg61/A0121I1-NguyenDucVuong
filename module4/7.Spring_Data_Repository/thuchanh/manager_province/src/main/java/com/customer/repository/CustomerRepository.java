package com.customer.repository;

import com.customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer , Long> {
    Page<Customer> findAllByFirstNameContaining(String firstName , Pageable pageable);
}
