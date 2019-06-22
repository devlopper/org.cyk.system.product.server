package org.cyk.system.product.server.persistence.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.cyk.system.product.server.Constant;
import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByStringAndCodedAndNamed;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=Property.TABLE)
public class Property extends AbstractIdentifiedByStringAndCodedAndNamed implements Serializable {
	private static final long serialVersionUID = 1L;

	/**/
	
	@Override
	public Property setCode(String code) {
		return (Property) super.setCode(code);
	}
	
	/**/
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"property";
	
	/**/

}
