package com.example.GamifiedBudgetApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Import(TestSecurityConfig.class)  // Import custom test security configuration
public class HelloControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@WithMockUser(roles = "USER")  // Mock a user with ROLE_USER to bypass security
	public void testHelloWorld() throws Exception {
		mockMvc.perform(get("/hello"))
				.andExpect(status().is3xxRedirection())
				.andExpect(redirectedUrl("/home.html"));
	}
}