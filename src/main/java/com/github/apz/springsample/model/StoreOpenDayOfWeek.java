/**
 *
 */
package com.github.apz.springsample.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author a-pz
 *
 */
@Getter @Setter @ToString
public class StoreOpenDayOfWeek {
	private String storeId;
	private String storeName;
	private Integer dayOfWeekCode;
	private Integer onServiceFlag;
}
