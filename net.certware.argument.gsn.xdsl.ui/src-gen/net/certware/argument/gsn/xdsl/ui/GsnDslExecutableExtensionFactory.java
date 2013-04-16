/*
 * generated by Xtext
 */
package net.certware.argument.gsn.xdsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import net.certware.argument.gsn.xdsl.ui.internal.GsnDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GsnDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GsnDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GsnDslActivator.getInstance().getInjector(GsnDslActivator.NET_CERTWARE_ARGUMENT_GSN_XDSL_GSNDSL);
	}
	
}
