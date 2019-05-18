package org.cyk.system.product.server.representation.impl;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.system.product.server.business.api.ProductBusiness;
import org.cyk.system.product.server.persistence.entities.Product;
import org.cyk.system.product.server.representation.api.ProductRepresentation;
import org.cyk.system.product.server.representation.entities.ProductDto;
import org.cyk.system.product.server.representation.entities.ProductDtoCollection;
import org.cyk.utility.server.representation.AbstractRepresentationEntityImpl;

@Singleton
public class ProductRepresentationImpl extends AbstractRepresentationEntityImpl<Product,ProductBusiness,ProductDto,ProductDtoCollection> implements ProductRepresentation,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Class<Product> getPersistenceEntityClass() {
		return Product.class;
	}
	
}
