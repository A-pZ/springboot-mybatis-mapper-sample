package com.github.apz.springsample.model.repository

import com.github.apz.springsample.repository.ItemRegisterRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import spock.lang.Specification

@SpringBootTest
class ItemFindTest extends Specification {
	@Autowired
	ItemRegisterRepository sut;

	def "検索テスト"() {
		when:
		def result = sut.findItems()

		then:
		result
		result[0].get("count") == 36
	}
}
