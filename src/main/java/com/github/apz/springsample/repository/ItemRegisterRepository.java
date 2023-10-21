package com.github.apz.springsample.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.github.apz.springsample.model.ItemDetail;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemRegisterRepository {
	private final SqlSessionTemplate sqlSessionTemplate;

	public int register(ItemDetail detail) {
		return sqlSessionTemplate.insert("items.registerDetail", detail);
	}

	public List<Map<String, Object>> findItems() {
		return sqlSessionTemplate.selectList("item.findItem");
	}
}
