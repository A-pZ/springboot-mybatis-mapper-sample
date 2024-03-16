package com.github.apz.springsample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.github.apz.springsample.model.StoreOpenDayOfWeek;

@Mapper
public interface StoreScheduleMapper {
	List<StoreOpenDayOfWeek> openDayOfWeek();
}
