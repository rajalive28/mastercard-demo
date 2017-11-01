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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'temperature'", "'vibration'", "'humidity'", "'<'", "'>'", "'turn_on'", "'turn_off'", "'light_bulb'", "'fan'", "'ac'", "'rule'", "'{'", "'}'", "'when'", "'then '"
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



    // $ANTLR start "entryRuleRules"
    // InternalMyDsl.g:53:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleRules EOF )
            // InternalMyDsl.g:55:1: ruleRules EOF
            {
             before(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getRulesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalMyDsl.g:62:1: ruleRules : ( ( rule__Rules__RuleFragmentsAssignment )* ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Rules__RuleFragmentsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Rules__RuleFragmentsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Rules__RuleFragmentsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Rules__RuleFragmentsAssignment )*
            {
             before(grammarAccess.getRulesAccess().getRuleFragmentsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Rules__RuleFragmentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Rules__RuleFragmentsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Rules__RuleFragmentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRulesAccess().getRuleFragmentsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleRuleFragments"
    // InternalMyDsl.g:78:1: entryRuleRuleFragments : ruleRuleFragments EOF ;
    public final void entryRuleRuleFragments() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleRuleFragments EOF )
            // InternalMyDsl.g:80:1: ruleRuleFragments EOF
            {
             before(grammarAccess.getRuleFragmentsRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleFragments();

            state._fsp--;

             after(grammarAccess.getRuleFragmentsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleFragments"


    // $ANTLR start "ruleRuleFragments"
    // InternalMyDsl.g:87:1: ruleRuleFragments : ( ( rule__RuleFragments__Group__0 ) ) ;
    public final void ruleRuleFragments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__RuleFragments__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__RuleFragments__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__RuleFragments__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__RuleFragments__Group__0 )
            {
             before(grammarAccess.getRuleFragmentsAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__RuleFragments__Group__0 )
            // InternalMyDsl.g:94:4: rule__RuleFragments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleFragments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleFragmentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleFragments"


    // $ANTLR start "entryRuleRuleBody"
    // InternalMyDsl.g:103:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleRuleBody EOF )
            // InternalMyDsl.g:105:1: ruleRuleBody EOF
            {
             before(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalMyDsl.g:112:1: ruleRuleBody : ( ( rule__RuleBody__Group__0 ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__RuleBody__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__RuleBody__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__RuleBody__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__RuleBody__Group__0 )
            {
             before(grammarAccess.getRuleBodyAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__RuleBody__Group__0 )
            // InternalMyDsl.g:119:4: rule__RuleBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:128:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEvent EOF )
            // InternalMyDsl.g:130:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMyDsl.g:137:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Event__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Event__Group__0 )
            // InternalMyDsl.g:144:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleSubEvent"
    // InternalMyDsl.g:153:1: entryRuleSubEvent : ruleSubEvent EOF ;
    public final void entryRuleSubEvent() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleSubEvent EOF )
            // InternalMyDsl.g:155:1: ruleSubEvent EOF
            {
             before(grammarAccess.getSubEventRule()); 
            pushFollow(FOLLOW_1);
            ruleSubEvent();

            state._fsp--;

             after(grammarAccess.getSubEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubEvent"


    // $ANTLR start "ruleSubEvent"
    // InternalMyDsl.g:162:1: ruleSubEvent : ( ( rule__SubEvent__Group__0 ) ) ;
    public final void ruleSubEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__SubEvent__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__SubEvent__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__SubEvent__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__SubEvent__Group__0 )
            {
             before(grammarAccess.getSubEventAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__SubEvent__Group__0 )
            // InternalMyDsl.g:169:4: rule__SubEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubEvent"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:178:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:182:1: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalMyDsl.g:183:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalMyDsl.g:183:2: ( ( rule__Attribute__Alternatives ) )
            // InternalMyDsl.g:184:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalMyDsl.g:185:3: ( rule__Attribute__Alternatives )
            // InternalMyDsl.g:185:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleSymbol"
    // InternalMyDsl.g:194:1: ruleSymbol : ( ( rule__Symbol__Alternatives ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:1: ( ( ( rule__Symbol__Alternatives ) ) )
            // InternalMyDsl.g:199:2: ( ( rule__Symbol__Alternatives ) )
            {
            // InternalMyDsl.g:199:2: ( ( rule__Symbol__Alternatives ) )
            // InternalMyDsl.g:200:3: ( rule__Symbol__Alternatives )
            {
             before(grammarAccess.getSymbolAccess().getAlternatives()); 
            // InternalMyDsl.g:201:3: ( rule__Symbol__Alternatives )
            // InternalMyDsl.g:201:4: rule__Symbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:210:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:214:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMyDsl.g:215:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMyDsl.g:215:2: ( ( rule__Action__Alternatives ) )
            // InternalMyDsl.g:216:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalMyDsl.g:217:3: ( rule__Action__Alternatives )
            // InternalMyDsl.g:217:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:226:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:230:1: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalMyDsl.g:231:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalMyDsl.g:231:2: ( ( rule__Entity__Alternatives ) )
            // InternalMyDsl.g:232:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalMyDsl.g:233:3: ( rule__Entity__Alternatives )
            // InternalMyDsl.g:233:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalMyDsl.g:241:1: rule__Attribute__Alternatives : ( ( ( 'temperature' ) ) | ( ( 'vibration' ) ) | ( ( 'humidity' ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:245:1: ( ( ( 'temperature' ) ) | ( ( 'vibration' ) ) | ( ( 'humidity' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:246:2: ( ( 'temperature' ) )
                    {
                    // InternalMyDsl.g:246:2: ( ( 'temperature' ) )
                    // InternalMyDsl.g:247:3: ( 'temperature' )
                    {
                     before(grammarAccess.getAttributeAccess().getTEMPERATUREEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:248:3: ( 'temperature' )
                    // InternalMyDsl.g:248:4: 'temperature'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getTEMPERATUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:252:2: ( ( 'vibration' ) )
                    {
                    // InternalMyDsl.g:252:2: ( ( 'vibration' ) )
                    // InternalMyDsl.g:253:3: ( 'vibration' )
                    {
                     before(grammarAccess.getAttributeAccess().getVIBRATIONEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:254:3: ( 'vibration' )
                    // InternalMyDsl.g:254:4: 'vibration'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getVIBRATIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:258:2: ( ( 'humidity' ) )
                    {
                    // InternalMyDsl.g:258:2: ( ( 'humidity' ) )
                    // InternalMyDsl.g:259:3: ( 'humidity' )
                    {
                     before(grammarAccess.getAttributeAccess().getHUMIDITYEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:260:3: ( 'humidity' )
                    // InternalMyDsl.g:260:4: 'humidity'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getHUMIDITYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Symbol__Alternatives"
    // InternalMyDsl.g:268:1: rule__Symbol__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__Symbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:272:1: ( ( ( '<' ) ) | ( ( '>' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:273:2: ( ( '<' ) )
                    {
                    // InternalMyDsl.g:273:2: ( ( '<' ) )
                    // InternalMyDsl.g:274:3: ( '<' )
                    {
                     before(grammarAccess.getSymbolAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:275:3: ( '<' )
                    // InternalMyDsl.g:275:4: '<'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSymbolAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:279:2: ( ( '>' ) )
                    {
                    // InternalMyDsl.g:279:2: ( ( '>' ) )
                    // InternalMyDsl.g:280:3: ( '>' )
                    {
                     before(grammarAccess.getSymbolAccess().getLESSEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:281:3: ( '>' )
                    // InternalMyDsl.g:281:4: '>'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSymbolAccess().getLESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalMyDsl.g:289:1: rule__Action__Alternatives : ( ( ( 'turn_on' ) ) | ( ( 'turn_off' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( ( ( 'turn_on' ) ) | ( ( 'turn_off' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:294:2: ( ( 'turn_on' ) )
                    {
                    // InternalMyDsl.g:294:2: ( ( 'turn_on' ) )
                    // InternalMyDsl.g:295:3: ( 'turn_on' )
                    {
                     before(grammarAccess.getActionAccess().getTURN_ONEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:296:3: ( 'turn_on' )
                    // InternalMyDsl.g:296:4: 'turn_on'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getTURN_ONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:300:2: ( ( 'turn_off' ) )
                    {
                    // InternalMyDsl.g:300:2: ( ( 'turn_off' ) )
                    // InternalMyDsl.g:301:3: ( 'turn_off' )
                    {
                     before(grammarAccess.getActionAccess().getTURN_OFFEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:302:3: ( 'turn_off' )
                    // InternalMyDsl.g:302:4: 'turn_off'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getTURN_OFFEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalMyDsl.g:310:1: rule__Entity__Alternatives : ( ( ( 'light_bulb' ) ) | ( ( 'fan' ) ) | ( ( 'ac' ) ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( ( ( 'light_bulb' ) ) | ( ( 'fan' ) ) | ( ( 'ac' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:315:2: ( ( 'light_bulb' ) )
                    {
                    // InternalMyDsl.g:315:2: ( ( 'light_bulb' ) )
                    // InternalMyDsl.g:316:3: ( 'light_bulb' )
                    {
                     before(grammarAccess.getEntityAccess().getLIGHT_BULBEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:317:3: ( 'light_bulb' )
                    // InternalMyDsl.g:317:4: 'light_bulb'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEntityAccess().getLIGHT_BULBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:321:2: ( ( 'fan' ) )
                    {
                    // InternalMyDsl.g:321:2: ( ( 'fan' ) )
                    // InternalMyDsl.g:322:3: ( 'fan' )
                    {
                     before(grammarAccess.getEntityAccess().getFANEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:323:3: ( 'fan' )
                    // InternalMyDsl.g:323:4: 'fan'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEntityAccess().getFANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:327:2: ( ( 'ac' ) )
                    {
                    // InternalMyDsl.g:327:2: ( ( 'ac' ) )
                    // InternalMyDsl.g:328:3: ( 'ac' )
                    {
                     before(grammarAccess.getEntityAccess().getACEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:329:3: ( 'ac' )
                    // InternalMyDsl.g:329:4: 'ac'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getEntityAccess().getACEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__RuleFragments__Group__0"
    // InternalMyDsl.g:337:1: rule__RuleFragments__Group__0 : rule__RuleFragments__Group__0__Impl rule__RuleFragments__Group__1 ;
    public final void rule__RuleFragments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( rule__RuleFragments__Group__0__Impl rule__RuleFragments__Group__1 )
            // InternalMyDsl.g:342:2: rule__RuleFragments__Group__0__Impl rule__RuleFragments__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RuleFragments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleFragments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__Group__0"


    // $ANTLR start "rule__RuleFragments__Group__0__Impl"
    // InternalMyDsl.g:349:1: rule__RuleFragments__Group__0__Impl : ( 'rule' ) ;
    public final void rule__RuleFragments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( ( 'rule' ) )
            // InternalMyDsl.g:354:1: ( 'rule' )
            {
            // InternalMyDsl.g:354:1: ( 'rule' )
            // InternalMyDsl.g:355:2: 'rule'
            {
             before(grammarAccess.getRuleFragmentsAccess().getRuleKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleFragmentsAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__Group__0__Impl"


    // $ANTLR start "rule__RuleFragments__Group__1"
    // InternalMyDsl.g:364:1: rule__RuleFragments__Group__1 : rule__RuleFragments__Group__1__Impl rule__RuleFragments__Group__2 ;
    public final void rule__RuleFragments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( rule__RuleFragments__Group__1__Impl rule__RuleFragments__Group__2 )
            // InternalMyDsl.g:369:2: rule__RuleFragments__Group__1__Impl rule__RuleFragments__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RuleFragments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleFragments__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__Group__1"


    // $ANTLR start "rule__RuleFragments__Group__1__Impl"
    // InternalMyDsl.g:376:1: rule__RuleFragments__Group__1__Impl : ( ( rule__RuleFragments__RuleNameAssignment_1 ) ) ;
    public final void rule__RuleFragments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( ( ( rule__RuleFragments__RuleNameAssignment_1 ) ) )
            // InternalMyDsl.g:381:1: ( ( rule__RuleFragments__RuleNameAssignment_1 ) )
            {
            // InternalMyDsl.g:381:1: ( ( rule__RuleFragments__RuleNameAssignment_1 ) )
            // InternalMyDsl.g:382:2: ( rule__RuleFragments__RuleNameAssignment_1 )
            {
             before(grammarAccess.getRuleFragmentsAccess().getRuleNameAssignment_1()); 
            // InternalMyDsl.g:383:2: ( rule__RuleFragments__RuleNameAssignment_1 )
            // InternalMyDsl.g:383:3: rule__RuleFragments__RuleNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleFragments__RuleNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleFragmentsAccess().getRuleNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__Group__1__Impl"


    // $ANTLR start "rule__RuleFragments__Group__2"
    // InternalMyDsl.g:391:1: rule__RuleFragments__Group__2 : rule__RuleFragments__Group__2__Impl rule__RuleFragments__Group__3 ;
    public final void rule__RuleFragments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( rule__RuleFragments__Group__2__Impl rule__RuleFragments__Group__3 )
            // InternalMyDsl.g:396:2: rule__RuleFragments__Group__2__Impl rule__RuleFragments__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RuleFragments__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleFragments__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__Group__2"


    // $ANTLR start "rule__RuleFragments__Group__2__Impl"
    // InternalMyDsl.g:403:1: rule__RuleFragments__Group__2__Impl : ( '{' ) ;
    public final void rule__RuleFragments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( '{' ) )
            // InternalMyDsl.g:408:1: ( '{' )
            {
            // InternalMyDsl.g:408:1: ( '{' )
            // InternalMyDsl.g:409:2: '{'
            {
             before(grammarAccess.getRuleFragmentsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleFragmentsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__Group__2__Impl"


    // $ANTLR start "rule__RuleFragments__Group__3"
    // InternalMyDsl.g:418:1: rule__RuleFragments__Group__3 : rule__RuleFragments__Group__3__Impl rule__RuleFragments__Group__4 ;
    public final void rule__RuleFragments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( rule__RuleFragments__Group__3__Impl rule__RuleFragments__Group__4 )
            // InternalMyDsl.g:423:2: rule__RuleFragments__Group__3__Impl rule__RuleFragments__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__RuleFragments__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleFragments__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__Group__3"


    // $ANTLR start "rule__RuleFragments__Group__3__Impl"
    // InternalMyDsl.g:430:1: rule__RuleFragments__Group__3__Impl : ( ( rule__RuleFragments__RuleBodyAssignment_3 ) ) ;
    public final void rule__RuleFragments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( ( rule__RuleFragments__RuleBodyAssignment_3 ) ) )
            // InternalMyDsl.g:435:1: ( ( rule__RuleFragments__RuleBodyAssignment_3 ) )
            {
            // InternalMyDsl.g:435:1: ( ( rule__RuleFragments__RuleBodyAssignment_3 ) )
            // InternalMyDsl.g:436:2: ( rule__RuleFragments__RuleBodyAssignment_3 )
            {
             before(grammarAccess.getRuleFragmentsAccess().getRuleBodyAssignment_3()); 
            // InternalMyDsl.g:437:2: ( rule__RuleFragments__RuleBodyAssignment_3 )
            // InternalMyDsl.g:437:3: rule__RuleFragments__RuleBodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleFragments__RuleBodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleFragmentsAccess().getRuleBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__Group__3__Impl"


    // $ANTLR start "rule__RuleFragments__Group__4"
    // InternalMyDsl.g:445:1: rule__RuleFragments__Group__4 : rule__RuleFragments__Group__4__Impl ;
    public final void rule__RuleFragments__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( rule__RuleFragments__Group__4__Impl )
            // InternalMyDsl.g:450:2: rule__RuleFragments__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleFragments__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__Group__4"


    // $ANTLR start "rule__RuleFragments__Group__4__Impl"
    // InternalMyDsl.g:456:1: rule__RuleFragments__Group__4__Impl : ( '}' ) ;
    public final void rule__RuleFragments__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:460:1: ( ( '}' ) )
            // InternalMyDsl.g:461:1: ( '}' )
            {
            // InternalMyDsl.g:461:1: ( '}' )
            // InternalMyDsl.g:462:2: '}'
            {
             before(grammarAccess.getRuleFragmentsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleFragmentsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__Group__4__Impl"


    // $ANTLR start "rule__RuleBody__Group__0"
    // InternalMyDsl.g:472:1: rule__RuleBody__Group__0 : rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 ;
    public final void rule__RuleBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 )
            // InternalMyDsl.g:477:2: rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__0"


    // $ANTLR start "rule__RuleBody__Group__0__Impl"
    // InternalMyDsl.g:484:1: rule__RuleBody__Group__0__Impl : ( 'when' ) ;
    public final void rule__RuleBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( ( 'when' ) )
            // InternalMyDsl.g:489:1: ( 'when' )
            {
            // InternalMyDsl.g:489:1: ( 'when' )
            // InternalMyDsl.g:490:2: 'when'
            {
             before(grammarAccess.getRuleBodyAccess().getWhenKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleBodyAccess().getWhenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__0__Impl"


    // $ANTLR start "rule__RuleBody__Group__1"
    // InternalMyDsl.g:499:1: rule__RuleBody__Group__1 : rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2 ;
    public final void rule__RuleBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2 )
            // InternalMyDsl.g:504:2: rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__RuleBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__1"


    // $ANTLR start "rule__RuleBody__Group__1__Impl"
    // InternalMyDsl.g:511:1: rule__RuleBody__Group__1__Impl : ( ( rule__RuleBody__EventAssignment_1 ) ) ;
    public final void rule__RuleBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( ( rule__RuleBody__EventAssignment_1 ) ) )
            // InternalMyDsl.g:516:1: ( ( rule__RuleBody__EventAssignment_1 ) )
            {
            // InternalMyDsl.g:516:1: ( ( rule__RuleBody__EventAssignment_1 ) )
            // InternalMyDsl.g:517:2: ( rule__RuleBody__EventAssignment_1 )
            {
             before(grammarAccess.getRuleBodyAccess().getEventAssignment_1()); 
            // InternalMyDsl.g:518:2: ( rule__RuleBody__EventAssignment_1 )
            // InternalMyDsl.g:518:3: rule__RuleBody__EventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__1__Impl"


    // $ANTLR start "rule__RuleBody__Group__2"
    // InternalMyDsl.g:526:1: rule__RuleBody__Group__2 : rule__RuleBody__Group__2__Impl ;
    public final void rule__RuleBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( rule__RuleBody__Group__2__Impl )
            // InternalMyDsl.g:531:2: rule__RuleBody__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__2"


    // $ANTLR start "rule__RuleBody__Group__2__Impl"
    // InternalMyDsl.g:537:1: rule__RuleBody__Group__2__Impl : ( ( rule__RuleBody__SubEventAssignment_2 )* ) ;
    public final void rule__RuleBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( ( ( rule__RuleBody__SubEventAssignment_2 )* ) )
            // InternalMyDsl.g:542:1: ( ( rule__RuleBody__SubEventAssignment_2 )* )
            {
            // InternalMyDsl.g:542:1: ( ( rule__RuleBody__SubEventAssignment_2 )* )
            // InternalMyDsl.g:543:2: ( rule__RuleBody__SubEventAssignment_2 )*
            {
             before(grammarAccess.getRuleBodyAccess().getSubEventAssignment_2()); 
            // InternalMyDsl.g:544:2: ( rule__RuleBody__SubEventAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:544:3: rule__RuleBody__SubEventAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RuleBody__SubEventAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRuleBodyAccess().getSubEventAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalMyDsl.g:553:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalMyDsl.g:558:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalMyDsl.g:565:1: rule__Event__Group__0__Impl : ( ( rule__Event__AttributeAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( ( ( rule__Event__AttributeAssignment_0 ) ) )
            // InternalMyDsl.g:570:1: ( ( rule__Event__AttributeAssignment_0 ) )
            {
            // InternalMyDsl.g:570:1: ( ( rule__Event__AttributeAssignment_0 ) )
            // InternalMyDsl.g:571:2: ( rule__Event__AttributeAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getAttributeAssignment_0()); 
            // InternalMyDsl.g:572:2: ( rule__Event__AttributeAssignment_0 )
            // InternalMyDsl.g:572:3: rule__Event__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Event__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalMyDsl.g:580:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalMyDsl.g:585:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalMyDsl.g:592:1: rule__Event__Group__1__Impl : ( ( rule__Event__SymbolAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( ( rule__Event__SymbolAssignment_1 ) ) )
            // InternalMyDsl.g:597:1: ( ( rule__Event__SymbolAssignment_1 ) )
            {
            // InternalMyDsl.g:597:1: ( ( rule__Event__SymbolAssignment_1 ) )
            // InternalMyDsl.g:598:2: ( rule__Event__SymbolAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getSymbolAssignment_1()); 
            // InternalMyDsl.g:599:2: ( rule__Event__SymbolAssignment_1 )
            // InternalMyDsl.g:599:3: rule__Event__SymbolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__SymbolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getSymbolAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalMyDsl.g:607:1: rule__Event__Group__2 : rule__Event__Group__2__Impl ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( rule__Event__Group__2__Impl )
            // InternalMyDsl.g:612:2: rule__Event__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalMyDsl.g:618:1: rule__Event__Group__2__Impl : ( ( rule__Event__ValueAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:622:1: ( ( ( rule__Event__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:623:1: ( ( rule__Event__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:623:1: ( ( rule__Event__ValueAssignment_2 ) )
            // InternalMyDsl.g:624:2: ( rule__Event__ValueAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:625:2: ( rule__Event__ValueAssignment_2 )
            // InternalMyDsl.g:625:3: rule__Event__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__SubEvent__Group__0"
    // InternalMyDsl.g:634:1: rule__SubEvent__Group__0 : rule__SubEvent__Group__0__Impl rule__SubEvent__Group__1 ;
    public final void rule__SubEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( rule__SubEvent__Group__0__Impl rule__SubEvent__Group__1 )
            // InternalMyDsl.g:639:2: rule__SubEvent__Group__0__Impl rule__SubEvent__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SubEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubEvent__Group__0"


    // $ANTLR start "rule__SubEvent__Group__0__Impl"
    // InternalMyDsl.g:646:1: rule__SubEvent__Group__0__Impl : ( 'then ' ) ;
    public final void rule__SubEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( 'then ' ) )
            // InternalMyDsl.g:651:1: ( 'then ' )
            {
            // InternalMyDsl.g:651:1: ( 'then ' )
            // InternalMyDsl.g:652:2: 'then '
            {
             before(grammarAccess.getSubEventAccess().getThenKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSubEventAccess().getThenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubEvent__Group__0__Impl"


    // $ANTLR start "rule__SubEvent__Group__1"
    // InternalMyDsl.g:661:1: rule__SubEvent__Group__1 : rule__SubEvent__Group__1__Impl rule__SubEvent__Group__2 ;
    public final void rule__SubEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( rule__SubEvent__Group__1__Impl rule__SubEvent__Group__2 )
            // InternalMyDsl.g:666:2: rule__SubEvent__Group__1__Impl rule__SubEvent__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SubEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubEvent__Group__1"


    // $ANTLR start "rule__SubEvent__Group__1__Impl"
    // InternalMyDsl.g:673:1: rule__SubEvent__Group__1__Impl : ( ( rule__SubEvent__AmountEventAssignment_1 ) ) ;
    public final void rule__SubEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( ( rule__SubEvent__AmountEventAssignment_1 ) ) )
            // InternalMyDsl.g:678:1: ( ( rule__SubEvent__AmountEventAssignment_1 ) )
            {
            // InternalMyDsl.g:678:1: ( ( rule__SubEvent__AmountEventAssignment_1 ) )
            // InternalMyDsl.g:679:2: ( rule__SubEvent__AmountEventAssignment_1 )
            {
             before(grammarAccess.getSubEventAccess().getAmountEventAssignment_1()); 
            // InternalMyDsl.g:680:2: ( rule__SubEvent__AmountEventAssignment_1 )
            // InternalMyDsl.g:680:3: rule__SubEvent__AmountEventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubEvent__AmountEventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubEventAccess().getAmountEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubEvent__Group__1__Impl"


    // $ANTLR start "rule__SubEvent__Group__2"
    // InternalMyDsl.g:688:1: rule__SubEvent__Group__2 : rule__SubEvent__Group__2__Impl ;
    public final void rule__SubEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( rule__SubEvent__Group__2__Impl )
            // InternalMyDsl.g:693:2: rule__SubEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubEvent__Group__2"


    // $ANTLR start "rule__SubEvent__Group__2__Impl"
    // InternalMyDsl.g:699:1: rule__SubEvent__Group__2__Impl : ( ( rule__SubEvent__EntityAssignment_2 ) ) ;
    public final void rule__SubEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( ( ( rule__SubEvent__EntityAssignment_2 ) ) )
            // InternalMyDsl.g:704:1: ( ( rule__SubEvent__EntityAssignment_2 ) )
            {
            // InternalMyDsl.g:704:1: ( ( rule__SubEvent__EntityAssignment_2 ) )
            // InternalMyDsl.g:705:2: ( rule__SubEvent__EntityAssignment_2 )
            {
             before(grammarAccess.getSubEventAccess().getEntityAssignment_2()); 
            // InternalMyDsl.g:706:2: ( rule__SubEvent__EntityAssignment_2 )
            // InternalMyDsl.g:706:3: rule__SubEvent__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubEvent__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubEventAccess().getEntityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubEvent__Group__2__Impl"


    // $ANTLR start "rule__Rules__RuleFragmentsAssignment"
    // InternalMyDsl.g:715:1: rule__Rules__RuleFragmentsAssignment : ( ruleRuleFragments ) ;
    public final void rule__Rules__RuleFragmentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( ruleRuleFragments ) )
            // InternalMyDsl.g:720:2: ( ruleRuleFragments )
            {
            // InternalMyDsl.g:720:2: ( ruleRuleFragments )
            // InternalMyDsl.g:721:3: ruleRuleFragments
            {
             before(grammarAccess.getRulesAccess().getRuleFragmentsRuleFragmentsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleFragments();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getRuleFragmentsRuleFragmentsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__RuleFragmentsAssignment"


    // $ANTLR start "rule__RuleFragments__RuleNameAssignment_1"
    // InternalMyDsl.g:730:1: rule__RuleFragments__RuleNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleFragments__RuleNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:735:2: ( RULE_ID )
            {
            // InternalMyDsl.g:735:2: ( RULE_ID )
            // InternalMyDsl.g:736:3: RULE_ID
            {
             before(grammarAccess.getRuleFragmentsAccess().getRuleNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleFragmentsAccess().getRuleNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__RuleNameAssignment_1"


    // $ANTLR start "rule__RuleFragments__RuleBodyAssignment_3"
    // InternalMyDsl.g:745:1: rule__RuleFragments__RuleBodyAssignment_3 : ( ruleRuleBody ) ;
    public final void rule__RuleFragments__RuleBodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:749:1: ( ( ruleRuleBody ) )
            // InternalMyDsl.g:750:2: ( ruleRuleBody )
            {
            // InternalMyDsl.g:750:2: ( ruleRuleBody )
            // InternalMyDsl.g:751:3: ruleRuleBody
            {
             before(grammarAccess.getRuleFragmentsAccess().getRuleBodyRuleBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleFragmentsAccess().getRuleBodyRuleBodyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFragments__RuleBodyAssignment_3"


    // $ANTLR start "rule__RuleBody__EventAssignment_1"
    // InternalMyDsl.g:760:1: rule__RuleBody__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__RuleBody__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:1: ( ( ruleEvent ) )
            // InternalMyDsl.g:765:2: ( ruleEvent )
            {
            // InternalMyDsl.g:765:2: ( ruleEvent )
            // InternalMyDsl.g:766:3: ruleEvent
            {
             before(grammarAccess.getRuleBodyAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getRuleBodyAccess().getEventEventParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__EventAssignment_1"


    // $ANTLR start "rule__RuleBody__SubEventAssignment_2"
    // InternalMyDsl.g:775:1: rule__RuleBody__SubEventAssignment_2 : ( ruleSubEvent ) ;
    public final void rule__RuleBody__SubEventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( ruleSubEvent ) )
            // InternalMyDsl.g:780:2: ( ruleSubEvent )
            {
            // InternalMyDsl.g:780:2: ( ruleSubEvent )
            // InternalMyDsl.g:781:3: ruleSubEvent
            {
             before(grammarAccess.getRuleBodyAccess().getSubEventSubEventParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubEvent();

            state._fsp--;

             after(grammarAccess.getRuleBodyAccess().getSubEventSubEventParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleBody__SubEventAssignment_2"


    // $ANTLR start "rule__Event__AttributeAssignment_0"
    // InternalMyDsl.g:790:1: rule__Event__AttributeAssignment_0 : ( ruleAttribute ) ;
    public final void rule__Event__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:795:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:795:2: ( ruleAttribute )
            // InternalMyDsl.g:796:3: ruleAttribute
            {
             before(grammarAccess.getEventAccess().getAttributeAttributeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEventAccess().getAttributeAttributeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__AttributeAssignment_0"


    // $ANTLR start "rule__Event__SymbolAssignment_1"
    // InternalMyDsl.g:805:1: rule__Event__SymbolAssignment_1 : ( ruleSymbol ) ;
    public final void rule__Event__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( ruleSymbol ) )
            // InternalMyDsl.g:810:2: ( ruleSymbol )
            {
            // InternalMyDsl.g:810:2: ( ruleSymbol )
            // InternalMyDsl.g:811:3: ruleSymbol
            {
             before(grammarAccess.getEventAccess().getSymbolSymbolEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getEventAccess().getSymbolSymbolEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__SymbolAssignment_1"


    // $ANTLR start "rule__Event__ValueAssignment_2"
    // InternalMyDsl.g:820:1: rule__Event__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Event__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:825:2: ( RULE_INT )
            {
            // InternalMyDsl.g:825:2: ( RULE_INT )
            // InternalMyDsl.g:826:3: RULE_INT
            {
             before(grammarAccess.getEventAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ValueAssignment_2"


    // $ANTLR start "rule__SubEvent__AmountEventAssignment_1"
    // InternalMyDsl.g:835:1: rule__SubEvent__AmountEventAssignment_1 : ( ruleAction ) ;
    public final void rule__SubEvent__AmountEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( ruleAction ) )
            // InternalMyDsl.g:840:2: ( ruleAction )
            {
            // InternalMyDsl.g:840:2: ( ruleAction )
            // InternalMyDsl.g:841:3: ruleAction
            {
             before(grammarAccess.getSubEventAccess().getAmountEventActionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSubEventAccess().getAmountEventActionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubEvent__AmountEventAssignment_1"


    // $ANTLR start "rule__SubEvent__EntityAssignment_2"
    // InternalMyDsl.g:850:1: rule__SubEvent__EntityAssignment_2 : ( ruleEntity ) ;
    public final void rule__SubEvent__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:855:2: ( ruleEntity )
            {
            // InternalMyDsl.g:855:2: ( ruleEntity )
            // InternalMyDsl.g:856:3: ruleEntity
            {
             before(grammarAccess.getSubEventAccess().getEntityEntityEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSubEventAccess().getEntityEntityEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubEvent__EntityAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001C0000L});

}