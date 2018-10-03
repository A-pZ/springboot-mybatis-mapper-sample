/**
 *
 */
package com.github.apz.springsample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.apz.springsample.model.Item;
import com.github.apz.springsample.repository.ItemSearchRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author a-pz
 *
 */
@Service
@RequiredArgsConstructor
@Log4j2
public class ItemSearchService {
	private final ItemSearchRepository repository;

	public List<Item> searchItems() {
		List<Item> results = repository.selectItemIgnoreDetailNoExist();

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		try {
			String str = mapper.writeValueAsString(results);
			log.info(str);
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return results;
	}
}
