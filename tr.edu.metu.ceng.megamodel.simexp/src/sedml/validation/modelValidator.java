/**
 *
 * $Id$
 */
package sedml.validation;


/**
 * A sample validator interface for {@link sedml.model}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface modelValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateLanguage(String value);
	boolean validateSource(String value);
	boolean validateName(String value);
}