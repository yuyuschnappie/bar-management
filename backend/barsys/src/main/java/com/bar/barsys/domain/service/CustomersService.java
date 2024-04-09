package com.bar.barsys.domain.service;

import com.bar.barsys.domain.entity.Customers;
import com.bar.barsys.domain.repository.CustomersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("CustomersService")
public class CustomersService {
    private final CustomersRepository customersRepository;

    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public List<Customers> findAll() {
        return customersRepository.findAll();
    }

    public Optional<Customers> findByPkAccount(String account) {
        return customersRepository.findByPkAccount(account);
    }

    public Customers createOrUpdate(Customers customer) {
        return this.customersRepository.save(customer);
    }

}
