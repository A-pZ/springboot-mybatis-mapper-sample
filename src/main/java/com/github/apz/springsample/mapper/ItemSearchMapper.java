package com.github.apz.springsample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.github.apz.springsample.model.Item;

@Mapper
public interface ItemSearchMapper {
	List<Item> searchAllItems();
	
	List<Item> selectItemIgnoreDetailNoExist();
}
