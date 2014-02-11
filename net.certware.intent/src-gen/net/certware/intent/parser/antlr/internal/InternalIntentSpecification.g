/*
* generated by Xtext
*/
grammar InternalIntentSpecification;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package net.certware.intent.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package net.certware.intent.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.certware.intent.services.IntentSpecificationGrammarAccess;

}

@parser::members {

 	private IntentSpecificationGrammarAccess grammarAccess;
 	
    public InternalIntentSpecificationParser(TokenStream input, IntentSpecificationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Specification";	
   	}
   	
   	@Override
   	protected IntentSpecificationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSpecification
entryRuleSpecification returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSpecificationRule()); }
	 iv_ruleSpecification=ruleSpecification 
	 { $current=$iv_ruleSpecification.current; } 
	 EOF 
;

// Rule Specification
ruleSpecification returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='specification' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
    }
(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getSpecificationAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSpecificationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSpecificationAccess().getRefinementsRefinementParserRuleCall_2_0()); 
	    }
		lv_refinements_2_0=ruleRefinement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSpecificationRule());
	        }
       		add(
       			$current, 
       			"refinements",
        		lv_refinements_2_0, 
        		"Refinement");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleRefinement
entryRuleRefinement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRefinementRule()); }
	 iv_ruleRefinement=ruleRefinement 
	 { $current=$iv_ruleRefinement.current; } 
	 EOF 
;

// Rule Refinement
ruleRefinement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='refinement' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRefinementAccess().getRefinementKeyword_0());
    }
(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getRefinementAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefinementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)(
(
		lv_desc_2_0=RULE_STRING
		{
			newLeafNode(lv_desc_2_0, grammarAccess.getRefinementAccess().getDescSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefinementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRefinementAccess().getIntentsIntentParserRuleCall_3_0()); 
	    }
		lv_intents_3_0=ruleIntent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRefinementRule());
	        }
       		add(
       			$current, 
       			"intents",
        		lv_intents_3_0, 
        		"Intent");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleIntent
entryRuleIntent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntentRule()); }
	 iv_ruleIntent=ruleIntent 
	 { $current=$iv_ruleIntent.current; } 
	 EOF 
;

// Rule Intent
ruleIntent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getIntentAccess().getTypeIntentTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleIntentType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntentRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"IntentType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getIntentAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)(
(
		lv_desc_2_0=RULE_STRING
		{
			newLeafNode(lv_desc_2_0, grammarAccess.getIntentAccess().getDescSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getIntentAccess().getDecompositionsDecompositionParserRuleCall_3_0()); 
	    }
		lv_decompositions_3_0=ruleDecomposition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntentRule());
	        }
       		add(
       			$current, 
       			"decompositions",
        		lv_decompositions_3_0, 
        		"Decomposition");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleIntentType
entryRuleIntentType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntentTypeRule()); } 
	 iv_ruleIntentType=ruleIntentType 
	 { $current=$iv_ruleIntentType.current.getText(); }  
	 EOF 
;

// Rule IntentType
ruleIntentType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='basic' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getIntentTypeAccess().getBasicKeyword_0()); 
    }

    |
	kw='purpose' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getIntentTypeAccess().getPurposeKeyword_1()); 
    }

    |
	kw='principles' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getIntentTypeAccess().getPrinciplesKeyword_2()); 
    }

    |
	kw='models' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getIntentTypeAccess().getModelsKeyword_3()); 
    }

    |
	kw='design' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getIntentTypeAccess().getDesignKeyword_4()); 
    }

    |
	kw='implementation' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getIntentTypeAccess().getImplementationKeyword_5()); 
    }

    |
	kw='operation' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getIntentTypeAccess().getOperationKeyword_6()); 
    }
)
    ;





// Entry rule entryRuleDecomposition
entryRuleDecomposition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDecompositionRule()); }
	 iv_ruleDecomposition=ruleDecomposition 
	 { $current=$iv_ruleDecomposition.current; } 
	 EOF 
;

// Rule Decomposition
ruleDecomposition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getDecompositionAccess().getTypeDecompositionTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleDecompositionType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDecompositionRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"DecompositionType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getDecompositionAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDecompositionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)(
(
		lv_desc_2_0=RULE_STRING
		{
			newLeafNode(lv_desc_2_0, grammarAccess.getDecompositionAccess().getDescSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDecompositionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"STRING");
	    }

)
)(	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getLeftCurlyBracketKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDecompositionAccess().getDocumentsDocumentParserRuleCall_3_1_0()); 
	    }
		lv_documents_4_0=ruleDocument		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDecompositionRule());
	        }
       		add(
       			$current, 
       			"documents",
        		lv_documents_4_0, 
        		"Document");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDecompositionAccess().getRightCurlyBracketKeyword_3_2());
    }
)?(	otherlv_6='[' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDecompositionAccess().getModelsModelItemParserRuleCall_4_1_0()); 
	    }
		lv_models_7_0=ruleModelItem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDecompositionRule());
	        }
       		add(
       			$current, 
       			"models",
        		lv_models_7_0, 
        		"ModelItem");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8=']' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_4_2());
    }
)?(	otherlv_9='(' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDecompositionAccess().getItemsListItemParserRuleCall_5_1_0()); 
	    }
		lv_items_10_0=ruleListItem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDecompositionRule());
	        }
       		add(
       			$current, 
       			"items",
        		lv_items_10_0, 
        		"ListItem");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_11=')' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_5_2());
    }
)?)
;





// Entry rule entryRuleDecompositionType
entryRuleDecompositionType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDecompositionTypeRule()); } 
	 iv_ruleDecompositionType=ruleDecompositionType 
	 { $current=$iv_ruleDecompositionType.current.getText(); }  
	 EOF 
;

// Rule DecompositionType
ruleDecompositionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='environment' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDecompositionTypeAccess().getEnvironmentKeyword_0()); 
    }

    |
	kw='operator' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDecompositionTypeAccess().getOperatorKeyword_1()); 
    }

    |
	kw='system' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDecompositionTypeAccess().getSystemKeyword_2()); 
    }

    |
	kw='verification' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDecompositionTypeAccess().getVerificationKeyword_3()); 
    }
)
    ;





// Entry rule entryRuleDocument
entryRuleDocument returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDocumentRule()); }
	 iv_ruleDocument=ruleDocument 
	 { $current=$iv_ruleDocument.current; } 
	 EOF 
;

// Rule Document
ruleDocument returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDocumentAccess().getEntriesDocItemParserRuleCall_1_0()); 
	    }
		lv_entries_1_0=ruleDocItem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDocumentRule());
	        }
       		add(
       			$current, 
       			"entries",
        		lv_entries_1_0, 
        		"DocItem");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='}' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_2());
    }
)
;





// Entry rule entryRuleDocItemType
entryRuleDocItemType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDocItemTypeRule()); } 
	 iv_ruleDocItemType=ruleDocItemType 
	 { $current=$iv_ruleDocItemType.current.getText(); }  
	 EOF 
;

// Rule DocItemType
ruleDocItemType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='condition' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDocItemTypeAccess().getConditionKeyword_0()); 
    }

    |
	kw='figure' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDocItemTypeAccess().getFigureKeyword_1()); 
    }

    |
	kw='break' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDocItemTypeAccess().getBreakKeyword_2()); 
    }

    |
	kw='model' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDocItemTypeAccess().getModelKeyword_3()); 
    }

    |
	kw='paragraph' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDocItemTypeAccess().getParagraphKeyword_4()); 
    }

    |
	kw='section' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDocItemTypeAccess().getSectionKeyword_5()); 
    }

    |
	kw='table' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDocItemTypeAccess().getTableKeyword_6()); 
    }
)
    ;





// Entry rule entryRuleDocItem
entryRuleDocItem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDocItemRule()); }
	 iv_ruleDocItem=ruleDocItem 
	 { $current=$iv_ruleDocItem.current; } 
	 EOF 
;

// Rule DocItem
ruleDocItem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getDocItemAccess().getTypeDocItemTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleDocItemType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDocItemRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"DocItemType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getDocItemAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDocItemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)(
(
		lv_ref_2_0=RULE_STRING
		{
			newLeafNode(lv_ref_2_0, grammarAccess.getDocItemAccess().getRefSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDocItemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"ref",
        		lv_ref_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDocItemAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleModelType
entryRuleModelType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelTypeRule()); } 
	 iv_ruleModelType=ruleModelType 
	 { $current=$iv_ruleModelType.current.getText(); }  
	 EOF 
;

// Rule ModelType
ruleModelType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='output' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getModelTypeAccess().getOutputKeyword_0()); 
    }

    |
	kw='mode' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getModelTypeAccess().getModeKeyword_1()); 
    }

    |
	kw='state' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getModelTypeAccess().getStateKeyword_2()); 
    }

    |
	kw='macro' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getModelTypeAccess().getMacroKeyword_3()); 
    }

    |
	kw='function' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getModelTypeAccess().getFunctionKeyword_4()); 
    }

    |
	kw='input' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getModelTypeAccess().getInputKeyword_5()); 
    }
)
    ;





// Entry rule entryRuleModelItem
entryRuleModelItem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelItemRule()); }
	 iv_ruleModelItem=ruleModelItem 
	 { $current=$iv_ruleModelItem.current; } 
	 EOF 
;

// Rule ModelItem
ruleModelItem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getModelItemAccess().getTypeModelTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleModelType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelItemRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"ModelType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getModelItemAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelItemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)(
(
		lv_desc_2_0=RULE_STRING
		{
			newLeafNode(lv_desc_2_0, grammarAccess.getModelItemAccess().getDescSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelItemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModelItemAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleListItemType
entryRuleListItemType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getListItemTypeRule()); } 
	 iv_ruleListItemType=ruleListItemType 
	 { $current=$iv_ruleListItemType.current.getText(); }  
	 EOF 
;

// Rule ListItemType
ruleListItemType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='requirement' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getListItemTypeAccess().getRequirementKeyword_0()); 
    }

    |
	kw='goal' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getListItemTypeAccess().getGoalKeyword_1()); 
    }

    |
	kw='hazard' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getListItemTypeAccess().getHazardKeyword_2()); 
    }

    |
	kw='constraint' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getListItemTypeAccess().getConstraintKeyword_3()); 
    }
)
    ;





// Entry rule entryRuleListItem
entryRuleListItem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getListItemRule()); }
	 iv_ruleListItem=ruleListItem 
	 { $current=$iv_ruleListItem.current; } 
	 EOF 
;

// Rule ListItem
ruleListItem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getListItemAccess().getTypeListItemTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleListItemType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getListItemRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"ListItemType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getListItemAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getListItemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"ID");
	    }

)
)(
(
		lv_desc_2_0=RULE_STRING
		{
			newLeafNode(lv_desc_2_0, grammarAccess.getListItemAccess().getDescSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getListItemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_2_0, 
        		"STRING");
	    }

)
)(	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getListItemAccess().getLeftCurlyBracketKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getListItemRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getListItemAccess().getDocReferencesDocItemCrossReference_3_1_0()); 
	}

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getListItemAccess().getRightCurlyBracketKeyword_3_2());
    }
)?(	otherlv_6='(' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getListItemAccess().getLeftParenthesisKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getListItemRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getListItemAccess().getItemReferencesListItemCrossReference_4_1_0()); 
	}

)
)*	otherlv_8=')' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getListItemAccess().getRightParenthesisKeyword_4_2());
    }
)?(	otherlv_9='[' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getListItemAccess().getLeftSquareBracketKeyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getListItemRule());
	        }
        }
	otherlv_10=RULE_ID
	{
		newLeafNode(otherlv_10, grammarAccess.getListItemAccess().getModelReferencesModelItemCrossReference_5_1_0()); 
	}

)
)*	otherlv_11=']' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getListItemAccess().getRightSquareBracketKeyword_5_2());
    }
)?	otherlv_12=';' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getListItemAccess().getSemicolonKeyword_6());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


