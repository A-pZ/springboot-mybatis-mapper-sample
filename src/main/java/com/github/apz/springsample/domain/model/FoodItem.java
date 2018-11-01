/**
 *
 */
package com.github.apz.springsample.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author a-pz
 *
 */
@Getter @Setter @ToString
public class FoodItem {
	private FoodCode foodCode;
	private String foodName;
}
