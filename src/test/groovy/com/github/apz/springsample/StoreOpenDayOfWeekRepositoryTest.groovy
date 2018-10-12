/**
 *
 */
package com.github.apz.springsample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import com.github.apz.springsample.repository.StoreOpenDayOfWeekRepository

import spock.lang.Specification

/**
 * @author a-pz
 *
 */
@SpringBootTest
class StoreOpenDayOfWeekRepositoryTest extends Specification {
	@Autowired
	StoreOpenDayOfWeekRepository sut

	def "営業日検索"() {
		when:
		def resultList = sut.searchStoreOpenDayOfWeek()

		then:
		resultList
		resultList.size() == 24

		resultList[0].storeId == "S001"
		resultList[0].storeName == "日祝日お休み店"
		resultList[0].dayOfWeekCode == 0
		resultList[0].onServiceFlag == 0

		resultList[1].storeId == "S001"
		resultList[1].storeName == "日祝日お休み店"
		resultList[1].dayOfWeekCode == 1
		resultList[1].onServiceFlag == 1

		resultList[2].dayOfWeekCode == 2
		resultList[2].onServiceFlag == 1

		resultList[3].dayOfWeekCode == 3
		resultList[3].onServiceFlag == 1

		resultList[4].dayOfWeekCode == 4
		resultList[4].onServiceFlag == 1

		resultList[5].dayOfWeekCode == 5
		resultList[5].onServiceFlag == 1

		resultList[6].dayOfWeekCode == 6
		resultList[6].onServiceFlag == 1

		resultList[7].dayOfWeekCode == 7
		resultList[7].onServiceFlag == 0

		resultList[8].storeId == "S002"
		resultList[8].storeName == "平日お休み店"
		resultList[8].dayOfWeekCode == 0
		resultList[8].onServiceFlag == 1

		resultList[9].dayOfWeekCode == 1
		resultList[9].onServiceFlag == 0
	}
}
