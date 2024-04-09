package com.bar.barsys.domain.service;

import com.bar.barsys.domain.entity.Employees;
import com.bar.barsys.domain.repository.EmployeesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("EmployeesService")
public class EmployeesService {
    private final EmployeesRepository employeesRepository;

    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public List<Employees> findAll(){
        return employeesRepository.findAll();
    }

    public Optional<Employees> findByPkId(String id) {
        return employeesRepository.findByPkId(id);
    }

    public Employees createOrUpdate(Employees employees) {
        return this.employeesRepository.save(employees);
    }

}
