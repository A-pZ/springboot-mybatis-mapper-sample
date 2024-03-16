/**
 *
 */
package com.github.apz.springsample.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.github.apz.springsample.model.Item;

import lombok.RequiredArgsConstructor;

/**
 * @author a-pz
 *
 */
@Repository
@RequiredArgsConstructor
public class ItemSearchRepository {
	private final SqlSessionTemplate sqlSessionTemplate;

	public List<Item> searchAllItems() {
		return sqlSessionTemplate.selectList("searchAllItems");
	}

	public List<Item> selectItemIgnoreDetailNoExist() {
		return sqlSessionTemplate.selectList("selectItemIgnoreDetailNoExist");
	}
}
