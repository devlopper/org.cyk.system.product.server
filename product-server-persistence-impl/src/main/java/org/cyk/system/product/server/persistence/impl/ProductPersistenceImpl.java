package org.cyk.system.product.server.persistence.impl;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.system.product.server.persistence.api.ProductPersistence;
import org.cyk.system.product.server.persistence.entities.Product;
import org.cyk.utility.server.persistence.AbstractPersistenceEntityImpl;

@ApplicationScoped
public class ProductPersistenceImpl extends AbstractPersistenceEntityImpl<Product> implements ProductPersistence,Serializable {
	private static final long serialVersionUID = 1L;

}
