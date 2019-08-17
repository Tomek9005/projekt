package com.sda.javagda21.projekt.repo;

import com.sda.javagda21.projekt.entity.CurrencyRank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRankRepo extends JpaRepository<CurrencyRank, Long> {



}
