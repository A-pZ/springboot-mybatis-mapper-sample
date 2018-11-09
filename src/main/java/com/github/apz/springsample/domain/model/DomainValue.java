/**
 *
 */
package com.github.apz.springsample.domain.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author a-pz
 *
 */
@Getter @Setter
public class DomainValue<T> {

//	public T getValue();
//
//	public void setValue(T value);

	private T value;
}
