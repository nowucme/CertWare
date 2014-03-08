// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.Evidence.IsAcquiredAt;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;
import net.certware.sacm.SACM.Evidence.parts.IsAcquiredAtPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.NotesPropertiesEditionPart;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;


// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public class IsAcquiredAtPropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 * 
	 */
	private IsAcquiredAtPropertiesEditionPart basePart;

	/**
	 * The IsAcquiredAtBasePropertiesEditionComponent sub component
	 * 
	 */
	protected IsAcquiredAtBasePropertiesEditionComponent isAcquiredAtBasePropertiesEditionComponent;

	/**
	 * The Notes part
	 * 
	 */
	private NotesPropertiesEditionPart notesPart;

	/**
	 * The IsAcquiredAtNotesPropertiesEditionComponent sub component
	 * 
	 */
	protected IsAcquiredAtNotesPropertiesEditionComponent isAcquiredAtNotesPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param isAcquiredAt the EObject to edit
	 * 
	 */
	public IsAcquiredAtPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject isAcquiredAt, String editing_mode) {
		super(editingContext, editing_mode);
		if (isAcquiredAt instanceof IsAcquiredAt) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isAcquiredAt, PropertiesEditingProvider.class);
			isAcquiredAtBasePropertiesEditionComponent = (IsAcquiredAtBasePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsAcquiredAtBasePropertiesEditionComponent.BASE_PART, IsAcquiredAtBasePropertiesEditionComponent.class);
			addSubComponent(isAcquiredAtBasePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(isAcquiredAt, PropertiesEditingProvider.class);
			isAcquiredAtNotesPropertiesEditionComponent = (IsAcquiredAtNotesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, IsAcquiredAtNotesPropertiesEditionComponent.NOTES_PART, IsAcquiredAtNotesPropertiesEditionComponent.class);
			addSubComponent(isAcquiredAtNotesPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      getPropertiesEditionPart(int, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (IsAcquiredAtBasePropertiesEditionComponent.BASE_PART.equals(key)) {
			basePart = (IsAcquiredAtPropertiesEditionPart)isAcquiredAtBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		if (IsAcquiredAtNotesPropertiesEditionComponent.NOTES_PART.equals(key)) {
			notesPart = (NotesPropertiesEditionPart)isAcquiredAtNotesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)notesPart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Object key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (EvidenceViewsRepository.IsAcquiredAt.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (IsAcquiredAtPropertiesEditionPart)propertiesEditionPart;
		}
		if (EvidenceViewsRepository.Notes.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			notesPart = (NotesPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == EvidenceViewsRepository.IsAcquiredAt.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == EvidenceViewsRepository.Notes.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
