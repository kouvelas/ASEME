/*
 * Kouretes Statechart Editor-KSE developed 
 * by Angeliki Topalidou-Kyniazopoulou
 * for Kouretes Team. Code developed by Nikolaos Spanoudakis, Alex Parashos,
 * ibm, apache and eclipse is used.
 */
package statechart.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import statechart.StatechartPackage;
import statechart.diagram.edit.parts.NodeName2EditPart;
import statechart.diagram.edit.parts.NodeName3EditPart;
import statechart.diagram.edit.parts.NodeName4EditPart;
import statechart.diagram.edit.parts.NodeName5EditPart;
import statechart.diagram.edit.parts.NodeName6EditPart;
import statechart.diagram.edit.parts.NodeNameEditPart;
import statechart.diagram.edit.parts.TransitionTEEditPart;
import statechart.diagram.edit.parts.VariableNameEditPart;
import statechart.diagram.edit.parts.VariableTypeEditPart;
import statechart.diagram.parsers.MessageFormatParser;
import statechart.diagram.part.StateChartVisualIDRegistry;

/**
 * @generated
 */
public class StateChartParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser nodeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5006Parser() {
		if (nodeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5006Parser = parser;
		}
		return nodeName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5007Parser() {
		if (nodeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5007Parser = parser;
		}
		return nodeName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser variableName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getVariableName_5008Parser() {
		if (variableName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { StatechartPackage.eINSTANCE
					.getVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { StatechartPackage.eINSTANCE
					.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			variableName_5008Parser = parser;
		}
		return variableName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser variableType_5009Parser;

	/**
	 * @generated
	 */
	private IParser getVariableType_5009Parser() {
		if (variableType_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { StatechartPackage.eINSTANCE
					.getVariable_Type() };
			EAttribute[] editableFeatures = new EAttribute[] { StatechartPackage.eINSTANCE
					.getVariable_Type() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			variableType_5009Parser = parser;
		}
		return variableType_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5011Parser() {
		if (nodeName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5011Parser = parser;
		}
		return nodeName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5002Parser() {
		if (nodeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5002Parser = parser;
		}
		return nodeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5005Parser() {
		if (nodeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5005Parser = parser;
		}
		return nodeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5003Parser() {
		if (nodeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { StatechartPackage.eINSTANCE
					.getNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			nodeName_5003Parser = parser;
		}
		return nodeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionTE_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionTE_6001Parser() {
		if (transitionTE_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { StatechartPackage.eINSTANCE
					.getTransition_TE() };
			EAttribute[] editableFeatures = new EAttribute[] { StatechartPackage.eINSTANCE
					.getTransition_TE() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			transitionTE_6001Parser = parser;
		}
		return transitionTE_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5006Parser();
		case NodeName2EditPart.VISUAL_ID:
			return getNodeName_5007Parser();
		case VariableNameEditPart.VISUAL_ID:
			return getVariableName_5008Parser();
		case VariableTypeEditPart.VISUAL_ID:
			return getVariableType_5009Parser();
		case NodeName3EditPart.VISUAL_ID:
			return getNodeName_5011Parser();
		case NodeName4EditPart.VISUAL_ID:
			return getNodeName_5002Parser();
		case NodeName5EditPart.VISUAL_ID:
			return getNodeName_5005Parser();
		case NodeName6EditPart.VISUAL_ID:
			return getNodeName_5003Parser();
		case TransitionTEEditPart.VISUAL_ID:
			return getTransitionTE_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(StateChartVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(StateChartVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (StateChartElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
