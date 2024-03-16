/**
 *
 */
package com.github.apz.springsample.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.apz.springsample.mapper.StoreScheduleMapper;
import com.github.apz.springsample.model.StoreOpenDayOfWeek;

import lombok.AllArgsConstructor;

/**
 * @author a-pz
 *
 */
@Repository
@AllArgsConstructor
public class StoreOpenDayOfWeekRepository {
	StoreScheduleMapper storeScheduleMapper; 

	public List<StoreOpenDayOfWeek> searchStoreOpenDayOfWeek() {
		return storeScheduleMapper.openDayOfWeek();
	}
}
