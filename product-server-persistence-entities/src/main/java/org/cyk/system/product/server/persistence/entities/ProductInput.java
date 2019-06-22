package org.cyk.system.product.server.persistence.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.cyk.system.product.server.Constant;
import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByString;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=ProductInput.TABLE,uniqueConstraints= {
		@UniqueConstraint(name=ProductInput.UNIQUE_CONSTRAINT_PRODUCT_INPUT_NAME,columnNames= {ProductInput.COLUMN_PRODUCT,ProductInput.COLUMN_INPUT}
		)})
public class ProductInput extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne @JoinColumn(name = COLUMN_PRODUCT) @NotNull private Product product;
	@ManyToOne @JoinColumn(name = COLUMN_INPUT) @NotNull private Input input;
	@Column(name = COLUMN_QUANTITY) @NotNull private BigDecimal quantity;
	
	/**/
	
	
	
	/**/
	
	public static final String FIELD_PRODUCT = "product";
	public static final String FIELD_INPUT = "input";
	public static final String FIELD_QUANTITY = "quantity";
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"product_input";
	
	public static final String COLUMN_PRODUCT = FIELD_PRODUCT;
	public static final String COLUMN_INPUT = FIELD_INPUT;
	public static final String COLUMN_QUANTITY = FIELD_QUANTITY;
	
	public static final String UNIQUE_CONSTRAINT_PRODUCT_INPUT_NAME = COLUMN_PRODUCT + "_" + COLUMN_INPUT;
	/**/

}
