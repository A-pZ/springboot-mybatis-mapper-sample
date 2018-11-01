package com.github.apz.springsample.domain.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.github.apz.springsample.domain.model.FoodItem;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class FoodItemSearchRepository {
	private final SqlSessionTemplate sqlSessionTemplate;

	public List<FoodItem> searchAllFoodItem() {
		return sqlSessionTemplate.selectList("domain_mapper_sample.searchAllFoodItem");
	}
}
