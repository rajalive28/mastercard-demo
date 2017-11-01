package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'{'", "'}'", "'when'", "'then '", "'temperature'", "'vibration'", "'humidity'", "'<'", "'>'", "'turn_on'", "'turn_off'", "'light_bulb'", "'fan'", "'ac'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Rules";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRules"
    // InternalMyDsl.g:65:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleRules= ruleRules EOF )
            // InternalMyDsl.g:66:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalMyDsl.g:72:1: ruleRules returns [EObject current=null] : ( (lv_ruleFragments_0_0= ruleRuleFragments ) )* ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        EObject lv_ruleFragments_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_ruleFragments_0_0= ruleRuleFragments ) )* )
            // InternalMyDsl.g:79:2: ( (lv_ruleFragments_0_0= ruleRuleFragments ) )*
            {
            // InternalMyDsl.g:79:2: ( (lv_ruleFragments_0_0= ruleRuleFragments ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:3: (lv_ruleFragments_0_0= ruleRuleFragments )
            	    {
            	    // InternalMyDsl.g:80:3: (lv_ruleFragments_0_0= ruleRuleFragments )
            	    // InternalMyDsl.g:81:4: lv_ruleFragments_0_0= ruleRuleFragments
            	    {

            	    				newCompositeNode(grammarAccess.getRulesAccess().getRuleFragmentsRuleFragmentsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_ruleFragments_0_0=ruleRuleFragments();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRulesRule());
            	    				}
            	    				add(
            	    					current,
            	    					"ruleFragments",
            	    					lv_ruleFragments_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.RuleFragments");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleRuleFragments"
    // InternalMyDsl.g:101:1: entryRuleRuleFragments returns [EObject current=null] : iv_ruleRuleFragments= ruleRuleFragments EOF ;
    public final EObject entryRuleRuleFragments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleFragments = null;


        try {
            // InternalMyDsl.g:101:54: (iv_ruleRuleFragments= ruleRuleFragments EOF )
            // InternalMyDsl.g:102:2: iv_ruleRuleFragments= ruleRuleFragments EOF
            {
             newCompositeNode(grammarAccess.getRuleFragmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleFragments=ruleRuleFragments();

            state._fsp--;

             current =iv_ruleRuleFragments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleFragments"


    // $ANTLR start "ruleRuleFragments"
    // InternalMyDsl.g:108:1: ruleRuleFragments returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_ruleName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' ) ;
    public final EObject ruleRuleFragments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ruleName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ruleBody_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( (otherlv_0= 'rule' ( (lv_ruleName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:115:2: (otherlv_0= 'rule' ( (lv_ruleName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:115:2: (otherlv_0= 'rule' ( (lv_ruleName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' )
            // InternalMyDsl.g:116:3: otherlv_0= 'rule' ( (lv_ruleName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleFragmentsAccess().getRuleKeyword_0());
            		
            // InternalMyDsl.g:120:3: ( (lv_ruleName_1_0= RULE_ID ) )
            // InternalMyDsl.g:121:4: (lv_ruleName_1_0= RULE_ID )
            {
            // InternalMyDsl.g:121:4: (lv_ruleName_1_0= RULE_ID )
            // InternalMyDsl.g:122:5: lv_ruleName_1_0= RULE_ID
            {
            lv_ruleName_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_ruleName_1_0, grammarAccess.getRuleFragmentsAccess().getRuleNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleFragmentsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ruleName",
            						lv_ruleName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleFragmentsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:142:3: ( (lv_ruleBody_3_0= ruleRuleBody ) )
            // InternalMyDsl.g:143:4: (lv_ruleBody_3_0= ruleRuleBody )
            {
            // InternalMyDsl.g:143:4: (lv_ruleBody_3_0= ruleRuleBody )
            // InternalMyDsl.g:144:5: lv_ruleBody_3_0= ruleRuleBody
            {

            					newCompositeNode(grammarAccess.getRuleFragmentsAccess().getRuleBodyRuleBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_ruleBody_3_0=ruleRuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleFragmentsRule());
            					}
            					set(
            						current,
            						"ruleBody",
            						lv_ruleBody_3_0,
            						"org.xtext.example.mydsl.MyDsl.RuleBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleFragmentsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleFragments"


    // $ANTLR start "entryRuleRuleBody"
    // InternalMyDsl.g:169:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalMyDsl.g:169:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalMyDsl.g:170:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalMyDsl.g:176:1: ruleRuleBody returns [EObject current=null] : (otherlv_0= 'when' ( (lv_Event_1_0= ruleEvent ) ) ( (lv_subEvent_2_0= ruleSubEvent ) )* ) ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_Event_1_0 = null;

        EObject lv_subEvent_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:182:2: ( (otherlv_0= 'when' ( (lv_Event_1_0= ruleEvent ) ) ( (lv_subEvent_2_0= ruleSubEvent ) )* ) )
            // InternalMyDsl.g:183:2: (otherlv_0= 'when' ( (lv_Event_1_0= ruleEvent ) ) ( (lv_subEvent_2_0= ruleSubEvent ) )* )
            {
            // InternalMyDsl.g:183:2: (otherlv_0= 'when' ( (lv_Event_1_0= ruleEvent ) ) ( (lv_subEvent_2_0= ruleSubEvent ) )* )
            // InternalMyDsl.g:184:3: otherlv_0= 'when' ( (lv_Event_1_0= ruleEvent ) ) ( (lv_subEvent_2_0= ruleSubEvent ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleBodyAccess().getWhenKeyword_0());
            		
            // InternalMyDsl.g:188:3: ( (lv_Event_1_0= ruleEvent ) )
            // InternalMyDsl.g:189:4: (lv_Event_1_0= ruleEvent )
            {
            // InternalMyDsl.g:189:4: (lv_Event_1_0= ruleEvent )
            // InternalMyDsl.g:190:5: lv_Event_1_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getRuleBodyAccess().getEventEventParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_Event_1_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            					}
            					set(
            						current,
            						"Event",
            						lv_Event_1_0,
            						"org.xtext.example.mydsl.MyDsl.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:207:3: ( (lv_subEvent_2_0= ruleSubEvent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:208:4: (lv_subEvent_2_0= ruleSubEvent )
            	    {
            	    // InternalMyDsl.g:208:4: (lv_subEvent_2_0= ruleSubEvent )
            	    // InternalMyDsl.g:209:5: lv_subEvent_2_0= ruleSubEvent
            	    {

            	    					newCompositeNode(grammarAccess.getRuleBodyAccess().getSubEventSubEventParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_subEvent_2_0=ruleSubEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subEvent",
            	    						lv_subEvent_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.SubEvent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:230:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMyDsl.g:230:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMyDsl.g:231:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMyDsl.g:237:1: ruleEvent returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleAttribute ) ) ( (lv_symbol_1_0= ruleSymbol ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        Enumerator lv_attribute_0_0 = null;

        Enumerator lv_symbol_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:243:2: ( ( ( (lv_attribute_0_0= ruleAttribute ) ) ( (lv_symbol_1_0= ruleSymbol ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:244:2: ( ( (lv_attribute_0_0= ruleAttribute ) ) ( (lv_symbol_1_0= ruleSymbol ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:244:2: ( ( (lv_attribute_0_0= ruleAttribute ) ) ( (lv_symbol_1_0= ruleSymbol ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:245:3: ( (lv_attribute_0_0= ruleAttribute ) ) ( (lv_symbol_1_0= ruleSymbol ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalMyDsl.g:245:3: ( (lv_attribute_0_0= ruleAttribute ) )
            // InternalMyDsl.g:246:4: (lv_attribute_0_0= ruleAttribute )
            {
            // InternalMyDsl.g:246:4: (lv_attribute_0_0= ruleAttribute )
            // InternalMyDsl.g:247:5: lv_attribute_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getEventAccess().getAttributeAttributeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_attribute_0_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_0_0,
            						"org.xtext.example.mydsl.MyDsl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:264:3: ( (lv_symbol_1_0= ruleSymbol ) )
            // InternalMyDsl.g:265:4: (lv_symbol_1_0= ruleSymbol )
            {
            // InternalMyDsl.g:265:4: (lv_symbol_1_0= ruleSymbol )
            // InternalMyDsl.g:266:5: lv_symbol_1_0= ruleSymbol
            {

            					newCompositeNode(grammarAccess.getEventAccess().getSymbolSymbolEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_symbol_1_0=ruleSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_1_0,
            						"org.xtext.example.mydsl.MyDsl.Symbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:283:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalMyDsl.g:284:4: (lv_value_2_0= RULE_INT )
            {
            // InternalMyDsl.g:284:4: (lv_value_2_0= RULE_INT )
            // InternalMyDsl.g:285:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getEventAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleSubEvent"
    // InternalMyDsl.g:305:1: entryRuleSubEvent returns [EObject current=null] : iv_ruleSubEvent= ruleSubEvent EOF ;
    public final EObject entryRuleSubEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubEvent = null;


        try {
            // InternalMyDsl.g:305:49: (iv_ruleSubEvent= ruleSubEvent EOF )
            // InternalMyDsl.g:306:2: iv_ruleSubEvent= ruleSubEvent EOF
            {
             newCompositeNode(grammarAccess.getSubEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubEvent=ruleSubEvent();

            state._fsp--;

             current =iv_ruleSubEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubEvent"


    // $ANTLR start "ruleSubEvent"
    // InternalMyDsl.g:312:1: ruleSubEvent returns [EObject current=null] : (otherlv_0= 'then ' ( (lv_amountEvent_1_0= ruleAction ) ) ( (lv_entity_2_0= ruleEntity ) ) ) ;
    public final EObject ruleSubEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_amountEvent_1_0 = null;

        Enumerator lv_entity_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:318:2: ( (otherlv_0= 'then ' ( (lv_amountEvent_1_0= ruleAction ) ) ( (lv_entity_2_0= ruleEntity ) ) ) )
            // InternalMyDsl.g:319:2: (otherlv_0= 'then ' ( (lv_amountEvent_1_0= ruleAction ) ) ( (lv_entity_2_0= ruleEntity ) ) )
            {
            // InternalMyDsl.g:319:2: (otherlv_0= 'then ' ( (lv_amountEvent_1_0= ruleAction ) ) ( (lv_entity_2_0= ruleEntity ) ) )
            // InternalMyDsl.g:320:3: otherlv_0= 'then ' ( (lv_amountEvent_1_0= ruleAction ) ) ( (lv_entity_2_0= ruleEntity ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSubEventAccess().getThenKeyword_0());
            		
            // InternalMyDsl.g:324:3: ( (lv_amountEvent_1_0= ruleAction ) )
            // InternalMyDsl.g:325:4: (lv_amountEvent_1_0= ruleAction )
            {
            // InternalMyDsl.g:325:4: (lv_amountEvent_1_0= ruleAction )
            // InternalMyDsl.g:326:5: lv_amountEvent_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getSubEventAccess().getAmountEventActionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_amountEvent_1_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubEventRule());
            					}
            					set(
            						current,
            						"amountEvent",
            						lv_amountEvent_1_0,
            						"org.xtext.example.mydsl.MyDsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:343:3: ( (lv_entity_2_0= ruleEntity ) )
            // InternalMyDsl.g:344:4: (lv_entity_2_0= ruleEntity )
            {
            // InternalMyDsl.g:344:4: (lv_entity_2_0= ruleEntity )
            // InternalMyDsl.g:345:5: lv_entity_2_0= ruleEntity
            {

            					newCompositeNode(grammarAccess.getSubEventAccess().getEntityEntityEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_entity_2_0=ruleEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubEventRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_2_0,
            						"org.xtext.example.mydsl.MyDsl.Entity");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubEvent"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:366:1: ruleAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'temperature' ) | (enumLiteral_1= 'vibration' ) | (enumLiteral_2= 'humidity' ) ) ;
    public final Enumerator ruleAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:372:2: ( ( (enumLiteral_0= 'temperature' ) | (enumLiteral_1= 'vibration' ) | (enumLiteral_2= 'humidity' ) ) )
            // InternalMyDsl.g:373:2: ( (enumLiteral_0= 'temperature' ) | (enumLiteral_1= 'vibration' ) | (enumLiteral_2= 'humidity' ) )
            {
            // InternalMyDsl.g:373:2: ( (enumLiteral_0= 'temperature' ) | (enumLiteral_1= 'vibration' ) | (enumLiteral_2= 'humidity' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:374:3: (enumLiteral_0= 'temperature' )
                    {
                    // InternalMyDsl.g:374:3: (enumLiteral_0= 'temperature' )
                    // InternalMyDsl.g:375:4: enumLiteral_0= 'temperature'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getTEMPERATUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeAccess().getTEMPERATUREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:382:3: (enumLiteral_1= 'vibration' )
                    {
                    // InternalMyDsl.g:382:3: (enumLiteral_1= 'vibration' )
                    // InternalMyDsl.g:383:4: enumLiteral_1= 'vibration'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getVIBRATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeAccess().getVIBRATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:390:3: (enumLiteral_2= 'humidity' )
                    {
                    // InternalMyDsl.g:390:3: (enumLiteral_2= 'humidity' )
                    // InternalMyDsl.g:391:4: enumLiteral_2= 'humidity'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getHUMIDITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeAccess().getHUMIDITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleSymbol"
    // InternalMyDsl.g:401:1: ruleSymbol returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) ) ;
    public final Enumerator ruleSymbol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:407:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) ) )
            // InternalMyDsl.g:408:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) )
            {
            // InternalMyDsl.g:408:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:409:3: (enumLiteral_0= '<' )
                    {
                    // InternalMyDsl.g:409:3: (enumLiteral_0= '<' )
                    // InternalMyDsl.g:410:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getSymbolAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSymbolAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:417:3: (enumLiteral_1= '>' )
                    {
                    // InternalMyDsl.g:417:3: (enumLiteral_1= '>' )
                    // InternalMyDsl.g:418:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getSymbolAccess().getLESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSymbolAccess().getLESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:428:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'turn_on' ) | (enumLiteral_1= 'turn_off' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:434:2: ( ( (enumLiteral_0= 'turn_on' ) | (enumLiteral_1= 'turn_off' ) ) )
            // InternalMyDsl.g:435:2: ( (enumLiteral_0= 'turn_on' ) | (enumLiteral_1= 'turn_off' ) )
            {
            // InternalMyDsl.g:435:2: ( (enumLiteral_0= 'turn_on' ) | (enumLiteral_1= 'turn_off' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:436:3: (enumLiteral_0= 'turn_on' )
                    {
                    // InternalMyDsl.g:436:3: (enumLiteral_0= 'turn_on' )
                    // InternalMyDsl.g:437:4: enumLiteral_0= 'turn_on'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getTURN_ONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getTURN_ONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:444:3: (enumLiteral_1= 'turn_off' )
                    {
                    // InternalMyDsl.g:444:3: (enumLiteral_1= 'turn_off' )
                    // InternalMyDsl.g:445:4: enumLiteral_1= 'turn_off'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getTURN_OFFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getTURN_OFFEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:455:1: ruleEntity returns [Enumerator current=null] : ( (enumLiteral_0= 'light_bulb' ) | (enumLiteral_1= 'fan' ) | (enumLiteral_2= 'ac' ) ) ;
    public final Enumerator ruleEntity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:461:2: ( ( (enumLiteral_0= 'light_bulb' ) | (enumLiteral_1= 'fan' ) | (enumLiteral_2= 'ac' ) ) )
            // InternalMyDsl.g:462:2: ( (enumLiteral_0= 'light_bulb' ) | (enumLiteral_1= 'fan' ) | (enumLiteral_2= 'ac' ) )
            {
            // InternalMyDsl.g:462:2: ( (enumLiteral_0= 'light_bulb' ) | (enumLiteral_1= 'fan' ) | (enumLiteral_2= 'ac' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:463:3: (enumLiteral_0= 'light_bulb' )
                    {
                    // InternalMyDsl.g:463:3: (enumLiteral_0= 'light_bulb' )
                    // InternalMyDsl.g:464:4: enumLiteral_0= 'light_bulb'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEntityAccess().getLIGHT_BULBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEntityAccess().getLIGHT_BULBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:471:3: (enumLiteral_1= 'fan' )
                    {
                    // InternalMyDsl.g:471:3: (enumLiteral_1= 'fan' )
                    // InternalMyDsl.g:472:4: enumLiteral_1= 'fan'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEntityAccess().getFANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEntityAccess().getFANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:479:3: (enumLiteral_2= 'ac' )
                    {
                    // InternalMyDsl.g:479:3: (enumLiteral_2= 'ac' )
                    // InternalMyDsl.g:480:4: enumLiteral_2= 'ac'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEntityAccess().getACEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEntityAccess().getACEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003800000L});

}