/**
 *
 */
package com.github.apz.springsample.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.github.apz.springsample.model.StoreOpenDayOfWeek;

import lombok.RequiredArgsConstructor;

/**
 * @author a-pz
 *
 */
@Repository
@RequiredArgsConstructor
public class StoreOpenDayOfWeekRepository {
	private final SqlSessionTemplate sqlSessionTemplate;

	public List<StoreOpenDayOfWeek> searchStoreOpenDayOfWeek() {
		return sqlSessionTemplate.selectList("dayOfWeek.onService");
	}
}
