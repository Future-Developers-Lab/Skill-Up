package com.skillup.demo.repository;

import com.skillup.demo.dao.OfferDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffersRepository extends JpaRepository<OfferDAO, Long> {

}
