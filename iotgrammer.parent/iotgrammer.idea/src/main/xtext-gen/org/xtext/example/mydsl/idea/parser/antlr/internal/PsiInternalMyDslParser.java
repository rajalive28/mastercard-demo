package org.xtext.example.mydsl.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.xtext.example.mydsl.idea.lang.MyDslElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalMyDslParser extends AbstractPsiAntlrParser {
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


        public PsiInternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalMyDsl.g"; }



    	protected MyDslGrammarAccess grammarAccess;

    	protected MyDslElementTypeProvider elementTypeProvider;

    	public PsiInternalMyDslParser(PsiBuilder builder, TokenStream input, MyDslElementTypeProvider elementTypeProvider, MyDslGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Rules";
    	}




    // $ANTLR start "entryRuleRules"
    // PsiInternalMyDsl.g:52:1: entryRuleRules returns [Boolean current=false] : iv_ruleRules= ruleRules EOF ;
    public final Boolean entryRuleRules() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRules = null;


        try {
            // PsiInternalMyDsl.g:52:47: (iv_ruleRules= ruleRules EOF )
            // PsiInternalMyDsl.g:53:2: iv_ruleRules= ruleRules EOF
            {
             markComposite(elementTypeProvider.getRulesElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // PsiInternalMyDsl.g:59:1: ruleRules returns [Boolean current=false] : ( (lv_ruleFragments_0_0= ruleRuleFragments ) )* ;
    public final Boolean ruleRules() throws RecognitionException {
        Boolean current = false;

        Boolean lv_ruleFragments_0_0 = null;


        try {
            // PsiInternalMyDsl.g:60:1: ( ( (lv_ruleFragments_0_0= ruleRuleFragments ) )* )
            // PsiInternalMyDsl.g:61:2: ( (lv_ruleFragments_0_0= ruleRuleFragments ) )*
            {
            // PsiInternalMyDsl.g:61:2: ( (lv_ruleFragments_0_0= ruleRuleFragments ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalMyDsl.g:62:3: (lv_ruleFragments_0_0= ruleRuleFragments )
            	    {
            	    // PsiInternalMyDsl.g:62:3: (lv_ruleFragments_0_0= ruleRuleFragments )
            	    // PsiInternalMyDsl.g:63:4: lv_ruleFragments_0_0= ruleRuleFragments
            	    {

            	    				markComposite(elementTypeProvider.getRules_RuleFragmentsRuleFragmentsParserRuleCall_0ElementType());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_ruleFragments_0_0=ruleRuleFragments();

            	    state._fsp--;


            	    				doneComposite();
            	    				if(!current) {
            	    					associateWithSemanticElement();
            	    					current = true;
            	    				}
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleRuleFragments"
    // PsiInternalMyDsl.g:79:1: entryRuleRuleFragments returns [Boolean current=false] : iv_ruleRuleFragments= ruleRuleFragments EOF ;
    public final Boolean entryRuleRuleFragments() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRuleFragments = null;


        try {
            // PsiInternalMyDsl.g:79:55: (iv_ruleRuleFragments= ruleRuleFragments EOF )
            // PsiInternalMyDsl.g:80:2: iv_ruleRuleFragments= ruleRuleFragments EOF
            {
             markComposite(elementTypeProvider.getRuleFragmentsElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleFragments=ruleRuleFragments();

            state._fsp--;

             current =iv_ruleRuleFragments; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleFragments"


    // $ANTLR start "ruleRuleFragments"
    // PsiInternalMyDsl.g:86:1: ruleRuleFragments returns [Boolean current=false] : (otherlv_0= 'rule' ( (lv_ruleName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' ) ;
    public final Boolean ruleRuleFragments() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_ruleName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean lv_ruleBody_3_0 = null;


        try {
            // PsiInternalMyDsl.g:87:1: ( (otherlv_0= 'rule' ( (lv_ruleName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' ) )
            // PsiInternalMyDsl.g:88:2: (otherlv_0= 'rule' ( (lv_ruleName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' )
            {
            // PsiInternalMyDsl.g:88:2: (otherlv_0= 'rule' ( (lv_ruleName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}' )
            // PsiInternalMyDsl.g:89:3: otherlv_0= 'rule' ( (lv_ruleName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ruleBody_3_0= ruleRuleBody ) ) otherlv_4= '}'
            {

            			markLeaf(elementTypeProvider.getRuleFragments_RuleKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalMyDsl.g:96:3: ( (lv_ruleName_1_0= RULE_ID ) )
            // PsiInternalMyDsl.g:97:4: (lv_ruleName_1_0= RULE_ID )
            {
            // PsiInternalMyDsl.g:97:4: (lv_ruleName_1_0= RULE_ID )
            // PsiInternalMyDsl.g:98:5: lv_ruleName_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getRuleFragments_RuleNameIDTerminalRuleCall_1_0ElementType());
            				
            lv_ruleName_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_ruleName_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getRuleFragments_LeftCurlyBracketKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalMyDsl.g:120:3: ( (lv_ruleBody_3_0= ruleRuleBody ) )
            // PsiInternalMyDsl.g:121:4: (lv_ruleBody_3_0= ruleRuleBody )
            {
            // PsiInternalMyDsl.g:121:4: (lv_ruleBody_3_0= ruleRuleBody )
            // PsiInternalMyDsl.g:122:5: lv_ruleBody_3_0= ruleRuleBody
            {

            					markComposite(elementTypeProvider.getRuleFragments_RuleBodyRuleBodyParserRuleCall_3_0ElementType());
            				
            pushFollow(FOLLOW_7);
            lv_ruleBody_3_0=ruleRuleBody();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getRuleFragments_RightCurlyBracketKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			doneLeaf(otherlv_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleFragments"


    // $ANTLR start "entryRuleRuleBody"
    // PsiInternalMyDsl.g:146:1: entryRuleRuleBody returns [Boolean current=false] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final Boolean entryRuleRuleBody() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRuleBody = null;


        try {
            // PsiInternalMyDsl.g:146:50: (iv_ruleRuleBody= ruleRuleBody EOF )
            // PsiInternalMyDsl.g:147:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             markComposite(elementTypeProvider.getRuleBodyElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // PsiInternalMyDsl.g:153:1: ruleRuleBody returns [Boolean current=false] : (otherlv_0= 'when' ( (lv_Event_1_0= ruleEvent ) ) ( (lv_subEvent_2_0= ruleSubEvent ) )* ) ;
    public final Boolean ruleRuleBody() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_Event_1_0 = null;

        Boolean lv_subEvent_2_0 = null;


        try {
            // PsiInternalMyDsl.g:154:1: ( (otherlv_0= 'when' ( (lv_Event_1_0= ruleEvent ) ) ( (lv_subEvent_2_0= ruleSubEvent ) )* ) )
            // PsiInternalMyDsl.g:155:2: (otherlv_0= 'when' ( (lv_Event_1_0= ruleEvent ) ) ( (lv_subEvent_2_0= ruleSubEvent ) )* )
            {
            // PsiInternalMyDsl.g:155:2: (otherlv_0= 'when' ( (lv_Event_1_0= ruleEvent ) ) ( (lv_subEvent_2_0= ruleSubEvent ) )* )
            // PsiInternalMyDsl.g:156:3: otherlv_0= 'when' ( (lv_Event_1_0= ruleEvent ) ) ( (lv_subEvent_2_0= ruleSubEvent ) )*
            {

            			markLeaf(elementTypeProvider.getRuleBody_WhenKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalMyDsl.g:163:3: ( (lv_Event_1_0= ruleEvent ) )
            // PsiInternalMyDsl.g:164:4: (lv_Event_1_0= ruleEvent )
            {
            // PsiInternalMyDsl.g:164:4: (lv_Event_1_0= ruleEvent )
            // PsiInternalMyDsl.g:165:5: lv_Event_1_0= ruleEvent
            {

            					markComposite(elementTypeProvider.getRuleBody_EventEventParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_9);
            lv_Event_1_0=ruleEvent();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalMyDsl.g:178:3: ( (lv_subEvent_2_0= ruleSubEvent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalMyDsl.g:179:4: (lv_subEvent_2_0= ruleSubEvent )
            	    {
            	    // PsiInternalMyDsl.g:179:4: (lv_subEvent_2_0= ruleSubEvent )
            	    // PsiInternalMyDsl.g:180:5: lv_subEvent_2_0= ruleSubEvent
            	    {

            	    					markComposite(elementTypeProvider.getRuleBody_SubEventSubEventParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_subEvent_2_0=ruleSubEvent();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleEvent"
    // PsiInternalMyDsl.g:197:1: entryRuleEvent returns [Boolean current=false] : iv_ruleEvent= ruleEvent EOF ;
    public final Boolean entryRuleEvent() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEvent = null;


        try {
            // PsiInternalMyDsl.g:197:47: (iv_ruleEvent= ruleEvent EOF )
            // PsiInternalMyDsl.g:198:2: iv_ruleEvent= ruleEvent EOF
            {
             markComposite(elementTypeProvider.getEventElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // PsiInternalMyDsl.g:204:1: ruleEvent returns [Boolean current=false] : ( ( (lv_attribute_0_0= ruleAttribute ) ) ( (lv_symbol_1_0= ruleSymbol ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final Boolean ruleEvent() throws RecognitionException {
        Boolean current = false;

        Token lv_value_2_0=null;
        Boolean lv_attribute_0_0 = null;

        Boolean lv_symbol_1_0 = null;


        try {
            // PsiInternalMyDsl.g:205:1: ( ( ( (lv_attribute_0_0= ruleAttribute ) ) ( (lv_symbol_1_0= ruleSymbol ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // PsiInternalMyDsl.g:206:2: ( ( (lv_attribute_0_0= ruleAttribute ) ) ( (lv_symbol_1_0= ruleSymbol ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // PsiInternalMyDsl.g:206:2: ( ( (lv_attribute_0_0= ruleAttribute ) ) ( (lv_symbol_1_0= ruleSymbol ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // PsiInternalMyDsl.g:207:3: ( (lv_attribute_0_0= ruleAttribute ) ) ( (lv_symbol_1_0= ruleSymbol ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            // PsiInternalMyDsl.g:207:3: ( (lv_attribute_0_0= ruleAttribute ) )
            // PsiInternalMyDsl.g:208:4: (lv_attribute_0_0= ruleAttribute )
            {
            // PsiInternalMyDsl.g:208:4: (lv_attribute_0_0= ruleAttribute )
            // PsiInternalMyDsl.g:209:5: lv_attribute_0_0= ruleAttribute
            {

            					markComposite(elementTypeProvider.getEvent_AttributeAttributeEnumRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_10);
            lv_attribute_0_0=ruleAttribute();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalMyDsl.g:222:3: ( (lv_symbol_1_0= ruleSymbol ) )
            // PsiInternalMyDsl.g:223:4: (lv_symbol_1_0= ruleSymbol )
            {
            // PsiInternalMyDsl.g:223:4: (lv_symbol_1_0= ruleSymbol )
            // PsiInternalMyDsl.g:224:5: lv_symbol_1_0= ruleSymbol
            {

            					markComposite(elementTypeProvider.getEvent_SymbolSymbolEnumRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_11);
            lv_symbol_1_0=ruleSymbol();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalMyDsl.g:237:3: ( (lv_value_2_0= RULE_INT ) )
            // PsiInternalMyDsl.g:238:4: (lv_value_2_0= RULE_INT )
            {
            // PsiInternalMyDsl.g:238:4: (lv_value_2_0= RULE_INT )
            // PsiInternalMyDsl.g:239:5: lv_value_2_0= RULE_INT
            {

            					markLeaf(elementTypeProvider.getEvent_ValueINTTerminalRuleCall_2_0ElementType());
            				
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_value_2_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleSubEvent"
    // PsiInternalMyDsl.g:258:1: entryRuleSubEvent returns [Boolean current=false] : iv_ruleSubEvent= ruleSubEvent EOF ;
    public final Boolean entryRuleSubEvent() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSubEvent = null;


        try {
            // PsiInternalMyDsl.g:258:50: (iv_ruleSubEvent= ruleSubEvent EOF )
            // PsiInternalMyDsl.g:259:2: iv_ruleSubEvent= ruleSubEvent EOF
            {
             markComposite(elementTypeProvider.getSubEventElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubEvent=ruleSubEvent();

            state._fsp--;

             current =iv_ruleSubEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubEvent"


    // $ANTLR start "ruleSubEvent"
    // PsiInternalMyDsl.g:265:1: ruleSubEvent returns [Boolean current=false] : (otherlv_0= 'then ' ( (lv_amountEvent_1_0= ruleAction ) ) ( (lv_entity_2_0= ruleEntity ) ) ) ;
    public final Boolean ruleSubEvent() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_amountEvent_1_0 = null;

        Boolean lv_entity_2_0 = null;


        try {
            // PsiInternalMyDsl.g:266:1: ( (otherlv_0= 'then ' ( (lv_amountEvent_1_0= ruleAction ) ) ( (lv_entity_2_0= ruleEntity ) ) ) )
            // PsiInternalMyDsl.g:267:2: (otherlv_0= 'then ' ( (lv_amountEvent_1_0= ruleAction ) ) ( (lv_entity_2_0= ruleEntity ) ) )
            {
            // PsiInternalMyDsl.g:267:2: (otherlv_0= 'then ' ( (lv_amountEvent_1_0= ruleAction ) ) ( (lv_entity_2_0= ruleEntity ) ) )
            // PsiInternalMyDsl.g:268:3: otherlv_0= 'then ' ( (lv_amountEvent_1_0= ruleAction ) ) ( (lv_entity_2_0= ruleEntity ) )
            {

            			markLeaf(elementTypeProvider.getSubEvent_ThenKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_12); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalMyDsl.g:275:3: ( (lv_amountEvent_1_0= ruleAction ) )
            // PsiInternalMyDsl.g:276:4: (lv_amountEvent_1_0= ruleAction )
            {
            // PsiInternalMyDsl.g:276:4: (lv_amountEvent_1_0= ruleAction )
            // PsiInternalMyDsl.g:277:5: lv_amountEvent_1_0= ruleAction
            {

            					markComposite(elementTypeProvider.getSubEvent_AmountEventActionEnumRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_13);
            lv_amountEvent_1_0=ruleAction();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalMyDsl.g:290:3: ( (lv_entity_2_0= ruleEntity ) )
            // PsiInternalMyDsl.g:291:4: (lv_entity_2_0= ruleEntity )
            {
            // PsiInternalMyDsl.g:291:4: (lv_entity_2_0= ruleEntity )
            // PsiInternalMyDsl.g:292:5: lv_entity_2_0= ruleEntity
            {

            					markComposite(elementTypeProvider.getSubEvent_EntityEntityEnumRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_2);
            lv_entity_2_0=ruleEntity();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubEvent"


    // $ANTLR start "ruleAttribute"
    // PsiInternalMyDsl.g:309:1: ruleAttribute returns [Boolean current=false] : ( (enumLiteral_0= 'temperature' ) | (enumLiteral_1= 'vibration' ) | (enumLiteral_2= 'humidity' ) ) ;
    public final Boolean ruleAttribute() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

        try {
            // PsiInternalMyDsl.g:310:1: ( ( (enumLiteral_0= 'temperature' ) | (enumLiteral_1= 'vibration' ) | (enumLiteral_2= 'humidity' ) ) )
            // PsiInternalMyDsl.g:311:2: ( (enumLiteral_0= 'temperature' ) | (enumLiteral_1= 'vibration' ) | (enumLiteral_2= 'humidity' ) )
            {
            // PsiInternalMyDsl.g:311:2: ( (enumLiteral_0= 'temperature' ) | (enumLiteral_1= 'vibration' ) | (enumLiteral_2= 'humidity' ) )
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
                    // PsiInternalMyDsl.g:312:3: (enumLiteral_0= 'temperature' )
                    {
                    // PsiInternalMyDsl.g:312:3: (enumLiteral_0= 'temperature' )
                    // PsiInternalMyDsl.g:313:4: enumLiteral_0= 'temperature'
                    {

                    				markLeaf(elementTypeProvider.getAttribute_TEMPERATUREEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalMyDsl.g:322:3: (enumLiteral_1= 'vibration' )
                    {
                    // PsiInternalMyDsl.g:322:3: (enumLiteral_1= 'vibration' )
                    // PsiInternalMyDsl.g:323:4: enumLiteral_1= 'vibration'
                    {

                    				markLeaf(elementTypeProvider.getAttribute_VIBRATIONEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalMyDsl.g:332:3: (enumLiteral_2= 'humidity' )
                    {
                    // PsiInternalMyDsl.g:332:3: (enumLiteral_2= 'humidity' )
                    // PsiInternalMyDsl.g:333:4: enumLiteral_2= 'humidity'
                    {

                    				markLeaf(elementTypeProvider.getAttribute_HUMIDITYEnumLiteralDeclaration_2ElementType());
                    			
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				doneLeaf(enumLiteral_2);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleSymbol"
    // PsiInternalMyDsl.g:345:1: ruleSymbol returns [Boolean current=false] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) ) ;
    public final Boolean ruleSymbol() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // PsiInternalMyDsl.g:346:1: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) ) )
            // PsiInternalMyDsl.g:347:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) )
            {
            // PsiInternalMyDsl.g:347:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) )
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
                    // PsiInternalMyDsl.g:348:3: (enumLiteral_0= '<' )
                    {
                    // PsiInternalMyDsl.g:348:3: (enumLiteral_0= '<' )
                    // PsiInternalMyDsl.g:349:4: enumLiteral_0= '<'
                    {

                    				markLeaf(elementTypeProvider.getSymbol_GREATEREnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalMyDsl.g:358:3: (enumLiteral_1= '>' )
                    {
                    // PsiInternalMyDsl.g:358:3: (enumLiteral_1= '>' )
                    // PsiInternalMyDsl.g:359:4: enumLiteral_1= '>'
                    {

                    				markLeaf(elementTypeProvider.getSymbol_LESSEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "ruleAction"
    // PsiInternalMyDsl.g:371:1: ruleAction returns [Boolean current=false] : ( (enumLiteral_0= 'turn_on' ) | (enumLiteral_1= 'turn_off' ) ) ;
    public final Boolean ruleAction() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // PsiInternalMyDsl.g:372:1: ( ( (enumLiteral_0= 'turn_on' ) | (enumLiteral_1= 'turn_off' ) ) )
            // PsiInternalMyDsl.g:373:2: ( (enumLiteral_0= 'turn_on' ) | (enumLiteral_1= 'turn_off' ) )
            {
            // PsiInternalMyDsl.g:373:2: ( (enumLiteral_0= 'turn_on' ) | (enumLiteral_1= 'turn_off' ) )
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
                    // PsiInternalMyDsl.g:374:3: (enumLiteral_0= 'turn_on' )
                    {
                    // PsiInternalMyDsl.g:374:3: (enumLiteral_0= 'turn_on' )
                    // PsiInternalMyDsl.g:375:4: enumLiteral_0= 'turn_on'
                    {

                    				markLeaf(elementTypeProvider.getAction_TURN_ONEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalMyDsl.g:384:3: (enumLiteral_1= 'turn_off' )
                    {
                    // PsiInternalMyDsl.g:384:3: (enumLiteral_1= 'turn_off' )
                    // PsiInternalMyDsl.g:385:4: enumLiteral_1= 'turn_off'
                    {

                    				markLeaf(elementTypeProvider.getAction_TURN_OFFEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleEntity"
    // PsiInternalMyDsl.g:397:1: ruleEntity returns [Boolean current=false] : ( (enumLiteral_0= 'light_bulb' ) | (enumLiteral_1= 'fan' ) | (enumLiteral_2= 'ac' ) ) ;
    public final Boolean ruleEntity() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

        try {
            // PsiInternalMyDsl.g:398:1: ( ( (enumLiteral_0= 'light_bulb' ) | (enumLiteral_1= 'fan' ) | (enumLiteral_2= 'ac' ) ) )
            // PsiInternalMyDsl.g:399:2: ( (enumLiteral_0= 'light_bulb' ) | (enumLiteral_1= 'fan' ) | (enumLiteral_2= 'ac' ) )
            {
            // PsiInternalMyDsl.g:399:2: ( (enumLiteral_0= 'light_bulb' ) | (enumLiteral_1= 'fan' ) | (enumLiteral_2= 'ac' ) )
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
                    // PsiInternalMyDsl.g:400:3: (enumLiteral_0= 'light_bulb' )
                    {
                    // PsiInternalMyDsl.g:400:3: (enumLiteral_0= 'light_bulb' )
                    // PsiInternalMyDsl.g:401:4: enumLiteral_0= 'light_bulb'
                    {

                    				markLeaf(elementTypeProvider.getEntity_LIGHT_BULBEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalMyDsl.g:410:3: (enumLiteral_1= 'fan' )
                    {
                    // PsiInternalMyDsl.g:410:3: (enumLiteral_1= 'fan' )
                    // PsiInternalMyDsl.g:411:4: enumLiteral_1= 'fan'
                    {

                    				markLeaf(elementTypeProvider.getEntity_FANEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalMyDsl.g:420:3: (enumLiteral_2= 'ac' )
                    {
                    // PsiInternalMyDsl.g:420:3: (enumLiteral_2= 'ac' )
                    // PsiInternalMyDsl.g:421:4: enumLiteral_2= 'ac'
                    {

                    				markLeaf(elementTypeProvider.getEntity_ACEnumLiteralDeclaration_2ElementType());
                    			
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				doneLeaf(enumLiteral_2);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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