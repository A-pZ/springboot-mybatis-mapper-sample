/**
 *
 */
package com.github.apz.springsample.model;

import java.time.LocalDate;

import lombok.Data;

/**
 * @author a-pz
 *
 */
@Data
public class ItemDetail {
	private int id;
	private String detailId;
	private String detailName;
	private int price;
	private LocalDate saleStart;
	private LocalDate saleEnd;
}
