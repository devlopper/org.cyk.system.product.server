package org.cyk.system.product.server.representation.api;

import javax.ws.rs.Path;

import org.cyk.system.product.server.persistence.entities.Product;
import org.cyk.system.product.server.representation.entities.ProductDto;
import org.cyk.system.product.server.representation.entities.ProductDtoCollection;
import org.cyk.utility.server.representation.RepresentationEntity;

@Path(ProductRepresentation.PATH)
public interface ProductRepresentation extends RepresentationEntity<Product,ProductDto,ProductDtoCollection> {
	
	String PATH = "product";
}
