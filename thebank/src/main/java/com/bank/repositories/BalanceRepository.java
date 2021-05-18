package com.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.entities.Balance;

@Repository
public interface BalanceRepository extends JpaRepository<Balance, Long> {

}