package com.example.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.domain.City;
import com.example.mapper.CityMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qiuzhanghua on 16/2/24.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

	@Autowired
	private CityMapper cityMapper;

	@RequestMapping(value = "")
	String index() {
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println(this.cityMapper.selectCityById(1));
		System.out.println("+++++++++++++++++++++++++++++++++");
		return "index";
	}

	@RequestMapping(value = "listCity")
	String getCityAll(HttpServletRequest request) {
		System.out.println("+++++++++++++++++++++++++++++++++");
		List<City> cities = this.cityMapper.getCityAll();
		System.out.println(cities);
		System.out.println("+++++++++++++++++++++++++++++++++");
		request.setAttribute("cities", cities);
		return "listCity";
	}
}
