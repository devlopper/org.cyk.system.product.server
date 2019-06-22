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
@Table(name=Product.TABLE)
public class Product extends AbstractIdentifiedByStringAndCodedAndNamed implements Serializable {
	private static final long serialVersionUID = 1L;

	/**/
	
	@Override
	public Product setCode(String code) {
		return (Product) super.setCode(code);
	}
	
	@Override
	public Product setName(String name) {
		return (Product) super.setName(name);
	}
	
	/**/
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"product";
	
	/**/

}
