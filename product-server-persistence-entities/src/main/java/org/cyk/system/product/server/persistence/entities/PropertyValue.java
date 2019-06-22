package org.cyk.system.product.server.persistence.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.cyk.system.product.server.Constant;
import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByStringAndCodedAndNamed;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=PropertyValue.TABLE)
public class PropertyValue extends AbstractIdentifiedByStringAndCodedAndNamed implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne @JoinColumn(name = COLUMN_PROPERTY) @NotNull private Property property;
	@Column(name = COLUMN_VALUE) private String value;
	
	@Override
	public PropertyValue setCode(String code) {
		return (PropertyValue) super.setCode(code);
	}
	
	@Override
	public PropertyValue setName(String name) {
		return (PropertyValue) super.setName(name);
	}
	
	/**/
	
	public static final String FIELD_PROPERTY = "property";
	public static final String FIELD_VALUE = "value";
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+Property.TABLE+"_value";
	
	public static final String COLUMN_PROPERTY = FIELD_PROPERTY;
	public static final String COLUMN_VALUE = FIELD_VALUE;

}
