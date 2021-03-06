/*
 * generated by Xtext 2.9.2
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleRules
entryRuleRules
:
{ before(grammarAccess.getRulesRule()); }
	 ruleRules
{ after(grammarAccess.getRulesRule()); } 
	 EOF 
;

// Rule Rules
ruleRules 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRulesAccess().getRuleFragmentsAssignment()); }
		(rule__Rules__RuleFragmentsAssignment)*
		{ after(grammarAccess.getRulesAccess().getRuleFragmentsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRuleFragments
entryRuleRuleFragments
:
{ before(grammarAccess.getRuleFragmentsRule()); }
	 ruleRuleFragments
{ after(grammarAccess.getRuleFragmentsRule()); } 
	 EOF 
;

// Rule RuleFragments
ruleRuleFragments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleFragmentsAccess().getGroup()); }
		(rule__RuleFragments__Group__0)
		{ after(grammarAccess.getRuleFragmentsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRuleBody
entryRuleRuleBody
:
{ before(grammarAccess.getRuleBodyRule()); }
	 ruleRuleBody
{ after(grammarAccess.getRuleBodyRule()); } 
	 EOF 
;

// Rule RuleBody
ruleRuleBody 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleBodyAccess().getGroup()); }
		(rule__RuleBody__Group__0)
		{ after(grammarAccess.getRuleBodyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvent
entryRuleEvent
:
{ before(grammarAccess.getEventRule()); }
	 ruleEvent
{ after(grammarAccess.getEventRule()); } 
	 EOF 
;

// Rule Event
ruleEvent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEventAccess().getGroup()); }
		(rule__Event__Group__0)
		{ after(grammarAccess.getEventAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubEvent
entryRuleSubEvent
:
{ before(grammarAccess.getSubEventRule()); }
	 ruleSubEvent
{ after(grammarAccess.getSubEventRule()); } 
	 EOF 
;

// Rule SubEvent
ruleSubEvent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubEventAccess().getGroup()); }
		(rule__SubEvent__Group__0)
		{ after(grammarAccess.getSubEventAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Attribute
ruleAttribute
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getAlternatives()); }
		(rule__Attribute__Alternatives)
		{ after(grammarAccess.getAttributeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Symbol
ruleSymbol
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSymbolAccess().getAlternatives()); }
		(rule__Symbol__Alternatives)
		{ after(grammarAccess.getSymbolAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Action
ruleAction
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getAlternatives()); }
		(rule__Action__Alternatives)
		{ after(grammarAccess.getActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Entity
ruleEntity
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getAlternatives()); }
		(rule__Entity__Alternatives)
		{ after(grammarAccess.getEntityAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getTEMPERATUREEnumLiteralDeclaration_0()); }
		('temperature')
		{ after(grammarAccess.getAttributeAccess().getTEMPERATUREEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeAccess().getVIBRATIONEnumLiteralDeclaration_1()); }
		('vibration')
		{ after(grammarAccess.getAttributeAccess().getVIBRATIONEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeAccess().getHUMIDITYEnumLiteralDeclaration_2()); }
		('humidity')
		{ after(grammarAccess.getAttributeAccess().getHUMIDITYEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Symbol__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSymbolAccess().getGREATEREnumLiteralDeclaration_0()); }
		('<')
		{ after(grammarAccess.getSymbolAccess().getGREATEREnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getSymbolAccess().getLESSEnumLiteralDeclaration_1()); }
		('>')
		{ after(grammarAccess.getSymbolAccess().getLESSEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getTURN_ONEnumLiteralDeclaration_0()); }
		('turn_on')
		{ after(grammarAccess.getActionAccess().getTURN_ONEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getTURN_OFFEnumLiteralDeclaration_1()); }
		('turn_off')
		{ after(grammarAccess.getActionAccess().getTURN_OFFEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getLIGHT_BULBEnumLiteralDeclaration_0()); }
		('light_bulb')
		{ after(grammarAccess.getEntityAccess().getLIGHT_BULBEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEntityAccess().getFANEnumLiteralDeclaration_1()); }
		('fan')
		{ after(grammarAccess.getEntityAccess().getFANEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getEntityAccess().getACEnumLiteralDeclaration_2()); }
		('ac')
		{ after(grammarAccess.getEntityAccess().getACEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleFragments__Group__0__Impl
	rule__RuleFragments__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleFragmentsAccess().getRuleKeyword_0()); }
	'rule'
	{ after(grammarAccess.getRuleFragmentsAccess().getRuleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleFragments__Group__1__Impl
	rule__RuleFragments__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleFragmentsAccess().getRuleNameAssignment_1()); }
	(rule__RuleFragments__RuleNameAssignment_1)
	{ after(grammarAccess.getRuleFragmentsAccess().getRuleNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleFragments__Group__2__Impl
	rule__RuleFragments__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleFragmentsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getRuleFragmentsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleFragments__Group__3__Impl
	rule__RuleFragments__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleFragmentsAccess().getRuleBodyAssignment_3()); }
	(rule__RuleFragments__RuleBodyAssignment_3)
	{ after(grammarAccess.getRuleFragmentsAccess().getRuleBodyAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleFragments__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleFragmentsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getRuleFragmentsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RuleBody__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleBody__Group__0__Impl
	rule__RuleBody__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleBody__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleBodyAccess().getWhenKeyword_0()); }
	'when'
	{ after(grammarAccess.getRuleBodyAccess().getWhenKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleBody__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleBody__Group__1__Impl
	rule__RuleBody__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleBody__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleBodyAccess().getEventAssignment_1()); }
	(rule__RuleBody__EventAssignment_1)
	{ after(grammarAccess.getRuleBodyAccess().getEventAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleBody__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RuleBody__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleBody__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleBodyAccess().getSubEventAssignment_2()); }
	(rule__RuleBody__SubEventAssignment_2)*
	{ after(grammarAccess.getRuleBodyAccess().getSubEventAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Event__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__0__Impl
	rule__Event__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getAttributeAssignment_0()); }
	(rule__Event__AttributeAssignment_0)
	{ after(grammarAccess.getEventAccess().getAttributeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__1__Impl
	rule__Event__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getSymbolAssignment_1()); }
	(rule__Event__SymbolAssignment_1)
	{ after(grammarAccess.getEventAccess().getSymbolAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getValueAssignment_2()); }
	(rule__Event__ValueAssignment_2)
	{ after(grammarAccess.getEventAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubEvent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubEvent__Group__0__Impl
	rule__SubEvent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubEvent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubEventAccess().getThenKeyword_0()); }
	'then '
	{ after(grammarAccess.getSubEventAccess().getThenKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubEvent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubEvent__Group__1__Impl
	rule__SubEvent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SubEvent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubEventAccess().getAmountEventAssignment_1()); }
	(rule__SubEvent__AmountEventAssignment_1)
	{ after(grammarAccess.getSubEventAccess().getAmountEventAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubEvent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubEvent__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubEvent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubEventAccess().getEntityAssignment_2()); }
	(rule__SubEvent__EntityAssignment_2)
	{ after(grammarAccess.getSubEventAccess().getEntityAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rules__RuleFragmentsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRulesAccess().getRuleFragmentsRuleFragmentsParserRuleCall_0()); }
		ruleRuleFragments
		{ after(grammarAccess.getRulesAccess().getRuleFragmentsRuleFragmentsParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__RuleNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleFragmentsAccess().getRuleNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRuleFragmentsAccess().getRuleNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleFragments__RuleBodyAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleFragmentsAccess().getRuleBodyRuleBodyParserRuleCall_3_0()); }
		ruleRuleBody
		{ after(grammarAccess.getRuleFragmentsAccess().getRuleBodyRuleBodyParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleBody__EventAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleBodyAccess().getEventEventParserRuleCall_1_0()); }
		ruleEvent
		{ after(grammarAccess.getRuleBodyAccess().getEventEventParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleBody__SubEventAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleBodyAccess().getSubEventSubEventParserRuleCall_2_0()); }
		ruleSubEvent
		{ after(grammarAccess.getRuleBodyAccess().getSubEventSubEventParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__AttributeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getAttributeAttributeEnumRuleCall_0_0()); }
		ruleAttribute
		{ after(grammarAccess.getEventAccess().getAttributeAttributeEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__SymbolAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getSymbolSymbolEnumRuleCall_1_0()); }
		ruleSymbol
		{ after(grammarAccess.getEventAccess().getSymbolSymbolEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getValueINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getEventAccess().getValueINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubEvent__AmountEventAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubEventAccess().getAmountEventActionEnumRuleCall_1_0()); }
		ruleAction
		{ after(grammarAccess.getSubEventAccess().getAmountEventActionEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubEvent__EntityAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubEventAccess().getEntityEntityEnumRuleCall_2_0()); }
		ruleEntity
		{ after(grammarAccess.getSubEventAccess().getEntityEntityEnumRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
