/**
 *
 */
package com.github.apz.springsample.domain.model;

/**
 * @author a-pz
 *
 */
public class FoodCode extends DomainValue<Integer>{

	private Integer value;

	@Override
	public Integer getValue() {
		return value;
	}

	@Override
	public void setValue(Integer value) {
		this.value = value;
	}
}
