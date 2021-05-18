package com.claims.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.claims.dto.SubmitClaimsDto;
import com.claims.service.SubmitClaimsServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class SubmitClaimsControllerTest {

	@MockBean
	SubmitClaimsServiceImpl submitClaimsServiceImpl;

	@Autowired
	WebApplicationContext context;

	@Autowired
	MockMvc mockMvc;

	//@WithMockUser("/prathyusha")
	@Test
	public void testSaveId() throws Exception {
		String claimsJson = "{\"membername\":\"prathyusha\"}";

		when(submitClaimsServiceImpl.saveClaimsData(new SubmitClaimsDto())).thenReturn(new SubmitClaimsDto());
		this.mockMvc.perform(post("/claims/submitclaims").contentType(MediaType.APPLICATION_JSON).content(claimsJson))
				.andExpect(status().isOk());
	}
}