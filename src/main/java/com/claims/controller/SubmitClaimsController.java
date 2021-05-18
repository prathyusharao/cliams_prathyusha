package com.claims.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claims.dto.SubmitClaimsDto;
import com.claims.exception.SubmitClaimsException;
import com.claims.service.SubmitClaimsServiceImpl;

@RestController
@RequestMapping("/claims")
/*
 * SubmitClaimsController
 */
@CrossOrigin("http://localhost:4200")
public class SubmitClaimsController {
	Logger logger = LogManager.getLogger(SubmitClaimsController.class);

	@Autowired
	private SubmitClaimsServiceImpl submitClaimsService;

	/*
	 * register Claims
	 */

	@PostMapping(path = "/submitclaims", consumes = "application/json", produces = "application/json")
	public ResponseEntity<SubmitClaimsDto> saveId(@RequestBody SubmitClaimsDto submitClaimsDto)
			throws SubmitClaimsException {
		logger.info("regitsering Member details... ");
		SubmitClaimsDto claims = null;
		try {
			claims = submitClaimsService.saveClaimsData(submitClaimsDto);
			return new ResponseEntity<>(claims, HttpStatus.OK);

		} catch (SubmitClaimsException e) {
			logger.error("Failed to register");
			throw new SubmitClaimsException("500", "InternalServerError");
		}
	}

}
