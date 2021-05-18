package com.claims.service;

import com.claims.dto.SubmitClaimsDto;
import com.claims.exception.SubmitClaimsException;

public interface SubmitClaimsService {
	/*
	 * save
	 */
	 SubmitClaimsDto saveClaimsData(SubmitClaimsDto memberDto) throws SubmitClaimsException;
}
