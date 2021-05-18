package com.claims.dao;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import com.claims.entity.SubmitClaims;
import com.claims.exception.SubmitClaimsException;
import com.claims.repo.SubmitClaimsRepository;
@RunWith(SpringRunner.class)
public class SubmitClaimsDaoTest {

	@MockBean
	SubmitClaimsRepository submitClaimsRepository;

	@Autowired
	SubmitClaimsDao submitClaimsDao;

	@Configuration
	static class SubmitClaimsDaoConfig {
		@Bean
		public SubmitClaimsDao submitClaimsDao() {
			return new SubmitClaimsDaoImpl();
		}
	}

	@Test
	public void testsaveClaimsData() throws SubmitClaimsException {
		SubmitClaims submitClaims=new SubmitClaims();
		submitClaims.setMembername("prathyusha");
		when(submitClaimsRepository.save(submitClaims)).thenReturn(submitClaims);
		assertNotNull(submitClaimsDao.saveClaimsData(submitClaims));
	}

}
