/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.dirfile.ui.internal.DirfileActivator;

public class DirFileUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DirfileActivator.getInstance().getInjector("org.xtext.example.DirFile");
	}

}