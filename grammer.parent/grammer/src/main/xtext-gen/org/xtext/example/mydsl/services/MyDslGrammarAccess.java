/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RulesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Rules");
		private final Assignment cRuleFragmentsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cRuleFragmentsRuleFragmentsParserRuleCall_0 = (RuleCall)cRuleFragmentsAssignment.eContents().get(0);
		
		//Rules:
		//	ruleFragments+=RuleFragments*;
		@Override public ParserRule getRule() { return rule; }
		
		//ruleFragments+=RuleFragments*
		public Assignment getRuleFragmentsAssignment() { return cRuleFragmentsAssignment; }
		
		//RuleFragments
		public RuleCall getRuleFragmentsRuleFragmentsParserRuleCall_0() { return cRuleFragmentsRuleFragmentsParserRuleCall_0; }
	}
	public class RuleFragmentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.RuleFragments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRuleNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRuleNameIDTerminalRuleCall_1_0 = (RuleCall)cRuleNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRuleBodyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRuleBodyRuleBodyParserRuleCall_3_0 = (RuleCall)cRuleBodyAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//RuleFragments:
		//	'rule' ruleName=ID
		//	'{'
		//	ruleBody=RuleBody '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'rule' ruleName=ID '{' ruleBody=RuleBody '}'
		public Group getGroup() { return cGroup; }
		
		//'rule'
		public Keyword getRuleKeyword_0() { return cRuleKeyword_0; }
		
		//ruleName=ID
		public Assignment getRuleNameAssignment_1() { return cRuleNameAssignment_1; }
		
		//ID
		public RuleCall getRuleNameIDTerminalRuleCall_1_0() { return cRuleNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//ruleBody=RuleBody
		public Assignment getRuleBodyAssignment_3() { return cRuleBodyAssignment_3; }
		
		//RuleBody
		public RuleCall getRuleBodyRuleBodyParserRuleCall_3_0() { return cRuleBodyRuleBodyParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class RuleBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.RuleBody");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWhenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPayerEventAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPayerEventPayerEventParserRuleCall_1_0 = (RuleCall)cPayerEventAssignment_1.eContents().get(0);
		private final Assignment cSubEventAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSubEventSubEventParserRuleCall_2_0 = (RuleCall)cSubEventAssignment_2.eContents().get(0);
		
		//RuleBody:
		//	'when' payerEvent=PayerEvent subEvent+=SubEvent*;
		@Override public ParserRule getRule() { return rule; }
		
		//'when' payerEvent=PayerEvent subEvent+=SubEvent*
		public Group getGroup() { return cGroup; }
		
		//'when'
		public Keyword getWhenKeyword_0() { return cWhenKeyword_0; }
		
		//payerEvent=PayerEvent
		public Assignment getPayerEventAssignment_1() { return cPayerEventAssignment_1; }
		
		//PayerEvent
		public RuleCall getPayerEventPayerEventParserRuleCall_1_0() { return cPayerEventPayerEventParserRuleCall_1_0; }
		
		//subEvent+=SubEvent*
		public Assignment getSubEventAssignment_2() { return cSubEventAssignment_2; }
		
		//SubEvent
		public RuleCall getSubEventSubEventParserRuleCall_2_0() { return cSubEventSubEventParserRuleCall_2_0; }
	}
	public class PayerEventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.PayerEvent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPayerNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPayerNamePayerNameEnumRuleCall_0_0 = (RuleCall)cPayerNameAssignment_0.eContents().get(0);
		private final Assignment cPayerEventNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPayerEventNamePayerEventNameEnumRuleCall_1_0 = (RuleCall)cPayerEventNameAssignment_1.eContents().get(0);
		private final Assignment cSymbolAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSymbolSymbolEnumRuleCall_2_0 = (RuleCall)cSymbolAssignment_2.eContents().get(0);
		private final Assignment cAmountAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAmountINTTerminalRuleCall_3_0 = (RuleCall)cAmountAssignment_3.eContents().get(0);
		
		//PayerEvent:
		//	payerName=PayerName payerEventName=PayerEventName symbol=Symbol amount=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//payerName=PayerName payerEventName=PayerEventName symbol=Symbol amount=INT
		public Group getGroup() { return cGroup; }
		
		//payerName=PayerName
		public Assignment getPayerNameAssignment_0() { return cPayerNameAssignment_0; }
		
		//PayerName
		public RuleCall getPayerNamePayerNameEnumRuleCall_0_0() { return cPayerNamePayerNameEnumRuleCall_0_0; }
		
		//payerEventName=PayerEventName
		public Assignment getPayerEventNameAssignment_1() { return cPayerEventNameAssignment_1; }
		
		//PayerEventName
		public RuleCall getPayerEventNamePayerEventNameEnumRuleCall_1_0() { return cPayerEventNamePayerEventNameEnumRuleCall_1_0; }
		
		//symbol=Symbol
		public Assignment getSymbolAssignment_2() { return cSymbolAssignment_2; }
		
		//Symbol
		public RuleCall getSymbolSymbolEnumRuleCall_2_0() { return cSymbolSymbolEnumRuleCall_2_0; }
		
		//amount=INT
		public Assignment getAmountAssignment_3() { return cAmountAssignment_3; }
		
		//INT
		public RuleCall getAmountINTTerminalRuleCall_3_0() { return cAmountINTTerminalRuleCall_3_0; }
	}
	public class SubEventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.SubEvent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cThenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAmountEventAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAmountEventAmountEventEnumRuleCall_1_0 = (RuleCall)cAmountEventAssignment_1.eContents().get(0);
		private final Assignment cAmountAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAmountINTTerminalRuleCall_2_0 = (RuleCall)cAmountAssignment_2.eContents().get(0);
		private final Keyword cToKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPayerNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPayerNamePayerNameEnumRuleCall_4_0 = (RuleCall)cPayerNameAssignment_4.eContents().get(0);
		
		//SubEvent:
		//	'then ' amountEvent=AmountEvent amount=INT 'to' payerName=PayerName;
		@Override public ParserRule getRule() { return rule; }
		
		//'then ' amountEvent=AmountEvent amount=INT 'to' payerName=PayerName
		public Group getGroup() { return cGroup; }
		
		//'then '
		public Keyword getThenKeyword_0() { return cThenKeyword_0; }
		
		//amountEvent=AmountEvent
		public Assignment getAmountEventAssignment_1() { return cAmountEventAssignment_1; }
		
		//AmountEvent
		public RuleCall getAmountEventAmountEventEnumRuleCall_1_0() { return cAmountEventAmountEventEnumRuleCall_1_0; }
		
		//amount=INT
		public Assignment getAmountAssignment_2() { return cAmountAssignment_2; }
		
		//INT
		public RuleCall getAmountINTTerminalRuleCall_2_0() { return cAmountINTTerminalRuleCall_2_0; }
		
		//'to'
		public Keyword getToKeyword_3() { return cToKeyword_3; }
		
		//payerName=PayerName
		public Assignment getPayerNameAssignment_4() { return cPayerNameAssignment_4; }
		
		//PayerName
		public RuleCall getPayerNamePayerNameEnumRuleCall_4_0() { return cPayerNamePayerNameEnumRuleCall_4_0; }
	}
	
	public class PayerNameElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.PayerName");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMINDTREEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMINDTREEMindtreeKeyword_0_0 = (Keyword)cMINDTREEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cROHITEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cROHITRohitKeyword_1_0 = (Keyword)cROHITEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cABHISHEKEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cABHISHEKAbhishekKeyword_2_0 = (Keyword)cABHISHEKEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum PayerName:
		//	MINDTREE='mindtree' | ROHIT='rohit' | ABHISHEK='abhishek';
		public EnumRule getRule() { return rule; }
		
		//MINDTREE='mindtree' | ROHIT='rohit' | ABHISHEK='abhishek'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MINDTREE='mindtree'
		public EnumLiteralDeclaration getMINDTREEEnumLiteralDeclaration_0() { return cMINDTREEEnumLiteralDeclaration_0; }
		
		//'mindtree'
		public Keyword getMINDTREEMindtreeKeyword_0_0() { return cMINDTREEMindtreeKeyword_0_0; }
		
		//ROHIT='rohit'
		public EnumLiteralDeclaration getROHITEnumLiteralDeclaration_1() { return cROHITEnumLiteralDeclaration_1; }
		
		//'rohit'
		public Keyword getROHITRohitKeyword_1_0() { return cROHITRohitKeyword_1_0; }
		
		//ABHISHEK='abhishek'
		public EnumLiteralDeclaration getABHISHEKEnumLiteralDeclaration_2() { return cABHISHEKEnumLiteralDeclaration_2; }
		
		//'abhishek'
		public Keyword getABHISHEKAbhishekKeyword_2_0() { return cABHISHEKAbhishekKeyword_2_0; }
	}
	public class PayerEventNameElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.PayerEventName");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCREDITEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCREDITCreditKeyword_0_0 = (Keyword)cCREDITEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDEBITEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDEBITDebitKeyword_1_0 = (Keyword)cDEBITEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum PayerEventName:
		//	CREDIT='credit' | DEBIT='debit';
		public EnumRule getRule() { return rule; }
		
		//CREDIT='credit' | DEBIT='debit'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CREDIT='credit'
		public EnumLiteralDeclaration getCREDITEnumLiteralDeclaration_0() { return cCREDITEnumLiteralDeclaration_0; }
		
		//'credit'
		public Keyword getCREDITCreditKeyword_0_0() { return cCREDITCreditKeyword_0_0; }
		
		//DEBIT='debit'
		public EnumLiteralDeclaration getDEBITEnumLiteralDeclaration_1() { return cDEBITEnumLiteralDeclaration_1; }
		
		//'debit'
		public Keyword getDEBITDebitKeyword_1_0() { return cDEBITDebitKeyword_1_0; }
	}
	public class SymbolElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Symbol");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cGREATEREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cGREATERLessThanSignKeyword_0_0 = (Keyword)cGREATEREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLESSEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLESSGreaterThanSignKeyword_1_0 = (Keyword)cLESSEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Symbol:
		//	GREATER='<' | LESS='>';
		public EnumRule getRule() { return rule; }
		
		//GREATER='<' | LESS='>'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GREATER='<'
		public EnumLiteralDeclaration getGREATEREnumLiteralDeclaration_0() { return cGREATEREnumLiteralDeclaration_0; }
		
		//'<'
		public Keyword getGREATERLessThanSignKeyword_0_0() { return cGREATERLessThanSignKeyword_0_0; }
		
		//LESS='>'
		public EnumLiteralDeclaration getLESSEnumLiteralDeclaration_1() { return cLESSEnumLiteralDeclaration_1; }
		
		//'>'
		public Keyword getLESSGreaterThanSignKeyword_1_0() { return cLESSGreaterThanSignKeyword_1_0; }
	}
	public class AmountEventElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.AmountEvent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTRANSFEREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTRANSFERTransferKeyword_0_0 = (Keyword)cTRANSFEREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cREQUESTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cREQUESTRequestKeyword_1_0 = (Keyword)cREQUESTEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum AmountEvent:
		//	TRANSFER='transfer' | REQUEST='request';
		public EnumRule getRule() { return rule; }
		
		//TRANSFER='transfer' | REQUEST='request'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TRANSFER='transfer'
		public EnumLiteralDeclaration getTRANSFEREnumLiteralDeclaration_0() { return cTRANSFEREnumLiteralDeclaration_0; }
		
		//'transfer'
		public Keyword getTRANSFERTransferKeyword_0_0() { return cTRANSFERTransferKeyword_0_0; }
		
		//REQUEST='request'
		public EnumLiteralDeclaration getREQUESTEnumLiteralDeclaration_1() { return cREQUESTEnumLiteralDeclaration_1; }
		
		//'request'
		public Keyword getREQUESTRequestKeyword_1_0() { return cREQUESTRequestKeyword_1_0; }
	}
	
	private final RulesElements pRules;
	private final RuleFragmentsElements pRuleFragments;
	private final RuleBodyElements pRuleBody;
	private final PayerEventElements pPayerEvent;
	private final PayerNameElements ePayerName;
	private final PayerEventNameElements ePayerEventName;
	private final SymbolElements eSymbol;
	private final SubEventElements pSubEvent;
	private final AmountEventElements eAmountEvent;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRules = new RulesElements();
		this.pRuleFragments = new RuleFragmentsElements();
		this.pRuleBody = new RuleBodyElements();
		this.pPayerEvent = new PayerEventElements();
		this.ePayerName = new PayerNameElements();
		this.ePayerEventName = new PayerEventNameElements();
		this.eSymbol = new SymbolElements();
		this.pSubEvent = new SubEventElements();
		this.eAmountEvent = new AmountEventElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Rules:
	//	ruleFragments+=RuleFragments*;
	public RulesElements getRulesAccess() {
		return pRules;
	}
	
	public ParserRule getRulesRule() {
		return getRulesAccess().getRule();
	}
	
	//RuleFragments:
	//	'rule' ruleName=ID
	//	'{'
	//	ruleBody=RuleBody '}';
	public RuleFragmentsElements getRuleFragmentsAccess() {
		return pRuleFragments;
	}
	
	public ParserRule getRuleFragmentsRule() {
		return getRuleFragmentsAccess().getRule();
	}
	
	//RuleBody:
	//	'when' payerEvent=PayerEvent subEvent+=SubEvent*;
	public RuleBodyElements getRuleBodyAccess() {
		return pRuleBody;
	}
	
	public ParserRule getRuleBodyRule() {
		return getRuleBodyAccess().getRule();
	}
	
	//PayerEvent:
	//	payerName=PayerName payerEventName=PayerEventName symbol=Symbol amount=INT;
	public PayerEventElements getPayerEventAccess() {
		return pPayerEvent;
	}
	
	public ParserRule getPayerEventRule() {
		return getPayerEventAccess().getRule();
	}
	
	//enum PayerName:
	//	MINDTREE='mindtree' | ROHIT='rohit' | ABHISHEK='abhishek';
	public PayerNameElements getPayerNameAccess() {
		return ePayerName;
	}
	
	public EnumRule getPayerNameRule() {
		return getPayerNameAccess().getRule();
	}
	
	//enum PayerEventName:
	//	CREDIT='credit' | DEBIT='debit';
	public PayerEventNameElements getPayerEventNameAccess() {
		return ePayerEventName;
	}
	
	public EnumRule getPayerEventNameRule() {
		return getPayerEventNameAccess().getRule();
	}
	
	//enum Symbol:
	//	GREATER='<' | LESS='>';
	public SymbolElements getSymbolAccess() {
		return eSymbol;
	}
	
	public EnumRule getSymbolRule() {
		return getSymbolAccess().getRule();
	}
	
	//SubEvent:
	//	'then ' amountEvent=AmountEvent amount=INT 'to' payerName=PayerName;
	public SubEventElements getSubEventAccess() {
		return pSubEvent;
	}
	
	public ParserRule getSubEventRule() {
		return getSubEventAccess().getRule();
	}
	
	//enum AmountEvent:
	//	TRANSFER='transfer' | REQUEST='request';
	public AmountEventElements getAmountEventAccess() {
		return eAmountEvent;
	}
	
	public EnumRule getAmountEventRule() {
		return getAmountEventAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
