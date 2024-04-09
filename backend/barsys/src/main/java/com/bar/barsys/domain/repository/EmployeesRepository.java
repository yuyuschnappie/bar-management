package com.bar.barsys.domain.repository;

import com.bar.barsys.domain.entity.Employees;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, String> {

    @Query("Select account_role From Employees account_role Where account_role.id = :id")
    Optional<Employees> findByPkId(String id);


}
