package org.cyk.system.product.server.business.impl;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.system.product.server.business.api.ProductBusiness;
import org.cyk.system.product.server.persistence.api.ProductPersistence;
import org.cyk.system.product.server.persistence.entities.Product;
import org.cyk.utility.server.business.AbstractBusinessEntityImpl;

@ApplicationScoped
public class ProductBusinessImpl extends AbstractBusinessEntityImpl<Product, ProductPersistence> implements ProductBusiness,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<Product> __getPersistenceEntityClass__() {
		return Product.class;
	}
	
}
