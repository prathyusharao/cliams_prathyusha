package com.claims.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claims.dao.SubmitClaimsDaoImpl;
import com.claims.dto.SubmitClaimsDto;
import com.claims.entity.SubmitClaims;
import com.claims.exception.SubmitClaimsException;

/*
 * claim service
 */
@Service
public class SubmitClaimsServiceImpl implements SubmitClaimsService {
	// log statements
	Logger logger = LogManager.getLogger(SubmitClaimsServiceImpl.class);
	@Autowired
	private SubmitClaimsDaoImpl submitClaimsDaoImpl;

	/*
	 * Saving Member Claims
	 * 
	 */
	public SubmitClaimsDto saveClaimsData(SubmitClaimsDto submitClaimsDto) throws SubmitClaimsException {
		SubmitClaims submitClaims = new SubmitClaims();
		logger.info("Save claims");
		SubmitClaimsDto response = new SubmitClaimsDto();
		try {
			submitClaims = new DozerBeanMapper().map(submitClaimsDto, SubmitClaims.class);
			submitClaims = submitClaimsDaoImpl.saveClaimsData(submitClaims);
			if (submitClaims != null) {
				response = new DozerBeanMapper().map(submitClaims, SubmitClaimsDto.class);
				response.setStatus("SUCCESS");
			} else {
				response.setStatus("FAILURE");
			}

		} catch (Exception e) {
			logger.error(e);
			response.setStatus("FAILURE");
			throw new SubmitClaimsException("100", "Claims Not Submitted");
		}
		return response;
	}
}
