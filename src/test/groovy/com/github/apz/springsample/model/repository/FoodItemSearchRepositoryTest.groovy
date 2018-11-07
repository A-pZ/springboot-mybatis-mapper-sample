/**
 *
 */
package com.github.apz.springsample.model.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import com.github.apz.springsample.domain.repository.FoodItemSearchRepository

import spock.lang.Specification

/**
 * @author a-pz
 *
 */
@SpringBootTest
class FoodItemSearchRepositoryTest extends Specification {
	@Autowired
	FoodItemSearchRepository sut

	def "検索テスト"() {
		when:
		def results = sut.searchAllFoodItem()

		then:
		results
		results.size() == 3
		results[0].foodCode.value == 1
	}
}
