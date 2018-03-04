/**
 *
 * $Id$
 */
package sedml.validation;

import sedml.listOfCurves;

/**
 * A sample validator interface for {@link sedml.plot2D}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface plot2DValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateName(String value);
	boolean validateListOfCurves(listOfCurves value);
}
