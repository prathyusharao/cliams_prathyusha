package com.claims.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.claims.entity.SubmitClaims;
import com.claims.repo.SubmitClaimsRepository;

/*
 * SubmitClaimsDao
 */
@Repository
public class SubmitClaimsDaoImpl implements SubmitClaimsDao {
	/*
	 * logger statements
	 */
	Logger logger = LogManager.getLogger(SubmitClaimsDaoImpl.class);
	@Autowired
	private SubmitClaimsRepository submitClaimsRepository;

	/*
	 * SaveClaims
	 */
	public SubmitClaims saveClaimsData(SubmitClaims submitClaims) {
		try {
			submitClaims = submitClaimsRepository.save(submitClaims);
		} catch (Exception e) {
			logger.error(e);
		}
		return submitClaims;
	}
}
