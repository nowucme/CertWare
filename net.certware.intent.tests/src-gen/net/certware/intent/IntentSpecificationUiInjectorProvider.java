/*
* generated by Xtext
*/
package net.certware.intent;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class IntentSpecificationUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return net.certware.intent.ui.internal.IntentSpecificationActivator.getInstance().getInjector("net.certware.intent.IntentSpecification");
	}
	
}
