/*
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.diagram.edit.policies;

import java.util.Iterator;

import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentCriteriaCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.ArgumentArgumentCriteriaReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.CriteriaCriteriaAssumptionsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.CriteriaCriteriaAssumptionsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.CriteriaCriteriaContextsCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.CriteriaCriteriaContextsReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionSolutionCriteriaCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.SolutionSolutionCriteriaReorientCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyCriteriaCreateCommand;
import net.certware.argument.euz.diagram.edit.commands.StrategyStrategyCriteriaReorientCommand;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyCriteriaEditPart;
import net.certware.argument.euz.diagram.part.EuzVisualIDRegistry;
import net.certware.argument.euz.diagram.providers.EuzElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CriteriaItemSemanticEditPolicy extends
		EuzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CriteriaItemSemanticEditPolicy() {
		super(EuzElementTypes.Criteria_2008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == ArgumentArgumentCriteriaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == StrategyStrategyCriteriaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(incomingLink) == SolutionSolutionCriteriaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == CriteriaCriteriaContextsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (EuzVisualIDRegistry.getVisualID(outgoingLink) == CriteriaCriteriaAssumptionsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EuzElementTypes.ArgumentArgumentCriteria_4005 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.CriteriaCriteriaContexts_4008 == req
				.getElementType()) {
			return getGEFWrapper(new CriteriaCriteriaContextsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.CriteriaCriteriaAssumptions_4009 == req
				.getElementType()) {
			return getGEFWrapper(new CriteriaCriteriaAssumptionsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.StrategyStrategyCriteria_4012 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.SolutionSolutionCriteria_4016 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EuzElementTypes.ArgumentArgumentCriteria_4005 == req
				.getElementType()) {
			return getGEFWrapper(new ArgumentArgumentCriteriaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.CriteriaCriteriaContexts_4008 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.CriteriaCriteriaAssumptions_4009 == req
				.getElementType()) {
			return null;
		}
		if (EuzElementTypes.StrategyStrategyCriteria_4012 == req
				.getElementType()) {
			return getGEFWrapper(new StrategyStrategyCriteriaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EuzElementTypes.SolutionSolutionCriteria_4016 == req
				.getElementType()) {
			return getGEFWrapper(new SolutionSolutionCriteriaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ArgumentArgumentCriteriaEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentArgumentCriteriaReorientCommand(
					req));
		case CriteriaCriteriaContextsEditPart.VISUAL_ID:
			return getGEFWrapper(new CriteriaCriteriaContextsReorientCommand(
					req));
		case CriteriaCriteriaAssumptionsEditPart.VISUAL_ID:
			return getGEFWrapper(new CriteriaCriteriaAssumptionsReorientCommand(
					req));
		case StrategyStrategyCriteriaEditPart.VISUAL_ID:
			return getGEFWrapper(new StrategyStrategyCriteriaReorientCommand(
					req));
		case SolutionSolutionCriteriaEditPart.VISUAL_ID:
			return getGEFWrapper(new SolutionSolutionCriteriaReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
