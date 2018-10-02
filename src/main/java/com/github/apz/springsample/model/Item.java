/**
 *
 */
package com.github.apz.springsample.model;

import java.util.List;

import lombok.Data;

/**
 * @author a-pz
 *
 */
@Data
public class Item {
	private int id;
	private String name;
	private List<ItemDetail> details;
}
