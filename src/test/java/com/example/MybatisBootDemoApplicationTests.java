package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.mapper.CityMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MybatisBootDemoApplication.class)
@WebAppConfiguration
public class MybatisBootDemoApplicationTests {
	@Autowired
	private CityMapper mapper;
	@Test
	public void contextLoads() {
	}
	@Test
	public void getOne() {
		Assert.assertEquals(1L, this.mapper.selectCityById(1L));
	}

}
