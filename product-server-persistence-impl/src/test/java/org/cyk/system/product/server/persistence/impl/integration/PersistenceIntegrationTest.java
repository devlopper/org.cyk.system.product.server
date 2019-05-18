package org.cyk.system.product.server.persistence.impl.integration;

import org.cyk.system.product.server.persistence.entities.Product;
import org.cyk.utility.server.persistence.test.TestPersistenceCreate;
import org.cyk.utility.server.persistence.test.arquillian.AbstractPersistenceArquillianIntegrationTestWithDefaultDeployment;
import org.junit.Test;

public class PersistenceIntegrationTest extends AbstractPersistenceArquillianIntegrationTestWithDefaultDeployment {
	private static final long serialVersionUID = 1L;
	
	@Test
	public void create_product() throws Exception{
		String code = __getRandomCode__();
		Product product = new Product().setCode(code);
		__inject__(TestPersistenceCreate.class).addObjects(product).execute();
	}
	
}
