package com.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
