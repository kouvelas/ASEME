package SUC.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import SUC.diagram.edit.commands.HumanRoleCreateCommand;
import SUC.diagram.edit.commands.RoleCreateCommand;
import SUC.diagram.edit.commands.SystemRoleCreateCommand;
import SUC.diagram.edit.commands.UseCaseCreateCommand;
import SUC.diagram.providers.SUCElementTypes;

/**
 * @generated
 */
public class SUCmodelItemSemanticEditPolicy extends
		SUCBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SUCmodelItemSemanticEditPolicy() {
		super(SUCElementTypes.SUCmodel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SUCElementTypes.SystemRole_2007 == req.getElementType()) {
			return getGEFWrapper(new SystemRoleCreateCommand(req));
		}
		if (SUCElementTypes.HumanRole_2008 == req.getElementType()) {
			return getGEFWrapper(new HumanRoleCreateCommand(req));
		}
		if (SUCElementTypes.UseCase_2009 == req.getElementType()) {
			return getGEFWrapper(new UseCaseCreateCommand(req));
		}
		if (SUCElementTypes.Role_2010 == req.getElementType()) {
			return getGEFWrapper(new RoleCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
