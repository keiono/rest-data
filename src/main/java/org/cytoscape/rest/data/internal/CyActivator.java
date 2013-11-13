package org.cytoscape.rest.data.internal;

import java.util.Properties;

import org.cytoscape.rest.RESTResource;
import org.cytoscape.rest.data.internal.resource.NetworkResource;
import org.cytoscape.service.util.AbstractCyActivator;
import org.cytoscape.task.NetworkTaskFactory;
import org.cytoscape.work.ServiceProperties;
import org.osgi.framework.BundleContext;

public class CyActivator extends AbstractCyActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		
		final NetworkResource networkResource = new NetworkResource();
		
		final Properties properties = new Properties();
		properties.put(ServiceProperties.ID, "networkResource");
		
		registerService(context, networkResource, RESTResource.class, properties);
	}

}
