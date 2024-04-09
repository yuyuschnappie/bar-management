package com.bar.barsys.domain.repository;

import com.bar.barsys.domain.entity.Customers;
import com.bar.barsys.domain.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, String> {

        @Query("Select customers From Customers customers Where customers.account = :account")
        Optional<Customers> findByPkAccount(String account);

}
