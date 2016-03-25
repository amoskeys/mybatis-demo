package com.example.mapper;

import java.util.List;

import com.example.domain.City;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by qiuzhanghua on 16/2/24.
 */
@Component
public class CityMapper {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public City selectCityById(long id) {
		return this.sqlSessionTemplate.selectOne("selectCityById", id);
	}

	public List<City> getCityAll() {
		return this.sqlSessionTemplate.selectList("getCityAll");
	}

}