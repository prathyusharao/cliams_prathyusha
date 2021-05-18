package com.claims.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.claims.entity.SubmitClaims;

@Repository
public interface SubmitClaimsRepository extends MongoRepository<SubmitClaims, Integer> {

}
