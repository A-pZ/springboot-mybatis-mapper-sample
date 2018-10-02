/**
 *
 */
package com.github.apz.springsample

import java.time.LocalDate

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import com.github.apz.springsample.repository.ItemSearchRepository

import spock.lang.Specification

/**
 * @author a-pz
 *
 */
@SpringBootTest
class ItemSearchRepositoryTest extends Specification {
	@Autowired
	ItemSearchRepository sut

	def "Mapper試験_INNERJOIN"() {
		when:
		def results = sut.searchAllItems()

		then:
		results
		results.size() == 2
		results[0].id == 1
		results[0].name == "肉製品"
		results[0].details
		results[0].details.size == 3
		results[0].details[0].detailId == "a1"
		results[0].details[0].detailName == "ロース"
		results[0].details[0].price == 800
		results[0].details[0].saleStart == LocalDate.of(2018, 9, 1)
		results[0].details[0].saleEnd == LocalDate.of(2018, 9, 30)
		results[0].details[1].detailId == "a2"
		results[0].details[1].detailName == "スナズリ"
		results[0].details[1].price == 900
		results[0].details[1].saleStart == LocalDate.of(2018, 9, 11)
		results[0].details[1].saleEnd == LocalDate.of(2018, 10, 30)
		results[0].details[2].detailId == "a3"
		results[0].details[2].detailName == "リブロース"
		results[0].details[2].price == 1000
		results[0].details[2].saleStart == LocalDate.of(2018, 9, 21)
		results[0].details[2].saleEnd == LocalDate.of(2018, 11, 30)
		results[1].id == 2
		results[1].name == "野菜"
	}

	def "Mapper試験_LEFTJOIN"() {
		when:
		def results = sut.selectItemIgnoreDetailNoExist()

		then:
		results
		results.size() == 3
		results[0].id == 1
		results[0].name == "肉製品"
		results[0].details
		results[0].details.size == 3
		results[0].details[0].detailId == "a1"
		results[0].details[0].detailName == "ロース"
		results[0].details[0].price == 800
		results[0].details[0].saleStart == LocalDate.of(2018, 9, 1)
		results[0].details[0].saleEnd == LocalDate.of(2018, 9, 30)
		results[0].details[1].detailId == "a2"
		results[0].details[1].detailName == "スナズリ"
		results[0].details[1].price == 900
		results[0].details[1].saleStart == LocalDate.of(2018, 9, 11)
		results[0].details[1].saleEnd == LocalDate.of(2018, 10, 30)
		results[0].details[2].detailId == "a3"
		results[0].details[2].detailName == "リブロース"
		results[0].details[2].price == 1000
		results[0].details[2].saleStart == LocalDate.of(2018, 9, 21)
		results[0].details[2].saleEnd == LocalDate.of(2018, 11, 30)
		results[1].id == 2
		results[1].name == "野菜"
		results[1].details
		results[1].details.size == 2
		results[2].id == 3
		results[2].name == "穀物"
		results[2].details == []
	}
}
