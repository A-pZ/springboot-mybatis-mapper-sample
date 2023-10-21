/**
 *
 */
package com.github.apz.springsample.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.apz.springsample.model.ItemDetail;
import com.github.apz.springsample.repository.ItemRegisterRepository;

import lombok.RequiredArgsConstructor;

/**
 * @author a-pz
 *
 */
@Service
@RequiredArgsConstructor
public class ItemRegisterService {
	private final ItemRegisterRepository repository;

	@Transactional
	public int register(ItemDetail detail) {
		int count = repository.register(detail);
		return count;
	}
}
