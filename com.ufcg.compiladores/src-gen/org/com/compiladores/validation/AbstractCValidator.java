/*
 * generated by Xtext
 */
package org.com.compiladores.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractCValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.com.compiladores.danfe.DanfePackage.eINSTANCE);
		return result;
	}
}