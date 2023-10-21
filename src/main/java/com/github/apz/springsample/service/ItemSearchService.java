/**
 *
 */
package com.github.apz.springsample.service;

import java.util.List;

import org.springframework.stereotype.Service;

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
		return results;
	}
}
