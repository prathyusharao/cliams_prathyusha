package com.claims.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.dozer.DozerBeanMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import com.claims.dao.SubmitClaimsDaoImpl;
import com.claims.dto.SubmitClaimsDto;
import com.claims.entity.SubmitClaims;
import com.claims.exception.SubmitClaimsException;
@RunWith(SpringRunner.class)
public class SubmitClaimsServiceImplTest {

		@Autowired
		SubmitClaimsService submitClaimsService;

		@MockBean
		SubmitClaimsDaoImpl submitClaimsDaoImpl;

		@Configuration
		static class SubmitClaimsServiceConfig {
			@Bean
			public SubmitClaimsService submitClaimsService() {
				return new SubmitClaimsServiceImpl();
			}
			
		}

		@Test
		public void testSaveClaimsData() throws SubmitClaimsException {
			SubmitClaims submitClaims=new SubmitClaims();
			submitClaims.setMembername("prathyusha");
			submitClaims.setProvidername("provider");
			SubmitClaimsDto claimsDTO = new DozerBeanMapper().map(submitClaims, SubmitClaimsDto.class);

			when(submitClaimsDaoImpl.saveClaimsData(submitClaims)).thenReturn(submitClaims);
			assertNotNull(submitClaimsService.saveClaimsData(claimsDTO));
		}
}
