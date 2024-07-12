package com.example.coinapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coinapp.model.CoinData;

public interface CoinDataRepository extends JpaRepository<CoinData, Long> {
}

