package org.com.compiladores.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.com.compiladores.danfe.DanfePackage;
import org.com.compiladores.danfe.DomainModel;
import org.com.compiladores.services.CGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class CSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DanfePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DanfePackage.DOMAIN_MODEL:
				if(context == grammarAccess.getDomainModelRule()) {
					sequence_DomainModel(context, (DomainModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     geetings+=testa
	 */
	protected void sequence_DomainModel(EObject context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
