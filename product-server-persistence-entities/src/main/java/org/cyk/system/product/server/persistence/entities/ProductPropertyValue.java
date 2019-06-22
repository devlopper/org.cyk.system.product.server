package org.cyk.system.product.server.persistence.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
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
@Table(name=ProductPropertyValue.TABLE,
uniqueConstraints= {
		@UniqueConstraint(name=ProductPropertyValue.UNIQUE_CONSTRAINT_PRODUCT_PROPERTY_VALUE_NAME,columnNames= {ProductPropertyValue.COLUMN_PRODUCT,ProductPropertyValue.COLUMN_PROPERTY_VALUE}
		)})
public class ProductPropertyValue extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne @JoinColumn(name = COLUMN_PRODUCT) @NotNull private Product product;
	@ManyToOne @JoinColumn(name = COLUMN_PROPERTY_VALUE) @NotNull private PropertyValue propertyValue;
	
	/**/
	
	public static final String FIELD_PRODUCT = "property";
	public static final String FIELD_PROPERTY_VALUE = "value";
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+Product.TABLE+"_"+PropertyValue.TABLE;
	
	public static final String COLUMN_PRODUCT = FIELD_PRODUCT;
	public static final String COLUMN_PROPERTY_VALUE = FIELD_PROPERTY_VALUE;

	public static final String UNIQUE_CONSTRAINT_PRODUCT_PROPERTY_VALUE_NAME = COLUMN_PRODUCT+ "_"+COLUMN_PROPERTY_VALUE;
}
