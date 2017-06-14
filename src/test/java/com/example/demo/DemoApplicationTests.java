package com.example.demo;

import controller.IndexCotroller;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private MockMvc mvc;

	@Before
	public void before(){
		mvc = MockMvcBuilders.standaloneSetup(new IndexCotroller()).build();

	}

	@Test
	public void contextLoads() throws Exception {

		mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON));
	}

}
