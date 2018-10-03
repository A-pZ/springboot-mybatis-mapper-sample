package com.github.apz.springsample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import com.github.apz.springsample.service.ItemSearchService

import spock.lang.Specification

@SpringBootTest
class ItemSearchServiceTest extends Specification {
	@Autowired
	ItemSearchService sut

	def "Service動作"() {
		expect:
		sut.searchItems()
	}
}
