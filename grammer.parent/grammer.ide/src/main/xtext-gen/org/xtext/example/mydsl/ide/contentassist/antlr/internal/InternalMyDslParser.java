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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mindtree'", "'rohit'", "'abhishek'", "'credit'", "'debit'", "'<'", "'>'", "'transfer'", "'request'", "'rule'", "'{'", "'}'", "'when'", "'then '", "'to'"
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

                if ( (LA1_0==20) ) {
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


    // $ANTLR start "entryRulePayerEvent"
    // InternalMyDsl.g:128:1: entryRulePayerEvent : rulePayerEvent EOF ;
    public final void entryRulePayerEvent() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( rulePayerEvent EOF )
            // InternalMyDsl.g:130:1: rulePayerEvent EOF
            {
             before(grammarAccess.getPayerEventRule()); 
            pushFollow(FOLLOW_1);
            rulePayerEvent();

            state._fsp--;

             after(grammarAccess.getPayerEventRule()); 
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
    // $ANTLR end "entryRulePayerEvent"


    // $ANTLR start "rulePayerEvent"
    // InternalMyDsl.g:137:1: rulePayerEvent : ( ( rule__PayerEvent__Group__0 ) ) ;
    public final void rulePayerEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__PayerEvent__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__PayerEvent__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__PayerEvent__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__PayerEvent__Group__0 )
            {
             before(grammarAccess.getPayerEventAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__PayerEvent__Group__0 )
            // InternalMyDsl.g:144:4: rule__PayerEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PayerEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPayerEventAccess().getGroup()); 

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
    // $ANTLR end "rulePayerEvent"


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


    // $ANTLR start "rulePayerName"
    // InternalMyDsl.g:178:1: rulePayerName : ( ( rule__PayerName__Alternatives ) ) ;
    public final void rulePayerName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:182:1: ( ( ( rule__PayerName__Alternatives ) ) )
            // InternalMyDsl.g:183:2: ( ( rule__PayerName__Alternatives ) )
            {
            // InternalMyDsl.g:183:2: ( ( rule__PayerName__Alternatives ) )
            // InternalMyDsl.g:184:3: ( rule__PayerName__Alternatives )
            {
             before(grammarAccess.getPayerNameAccess().getAlternatives()); 
            // InternalMyDsl.g:185:3: ( rule__PayerName__Alternatives )
            // InternalMyDsl.g:185:4: rule__PayerName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PayerName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPayerNameAccess().getAlternatives()); 

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
    // $ANTLR end "rulePayerName"


    // $ANTLR start "rulePayerEventName"
    // InternalMyDsl.g:194:1: rulePayerEventName : ( ( rule__PayerEventName__Alternatives ) ) ;
    public final void rulePayerEventName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:1: ( ( ( rule__PayerEventName__Alternatives ) ) )
            // InternalMyDsl.g:199:2: ( ( rule__PayerEventName__Alternatives ) )
            {
            // InternalMyDsl.g:199:2: ( ( rule__PayerEventName__Alternatives ) )
            // InternalMyDsl.g:200:3: ( rule__PayerEventName__Alternatives )
            {
             before(grammarAccess.getPayerEventNameAccess().getAlternatives()); 
            // InternalMyDsl.g:201:3: ( rule__PayerEventName__Alternatives )
            // InternalMyDsl.g:201:4: rule__PayerEventName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PayerEventName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPayerEventNameAccess().getAlternatives()); 

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
    // $ANTLR end "rulePayerEventName"


    // $ANTLR start "ruleSymbol"
    // InternalMyDsl.g:210:1: ruleSymbol : ( ( rule__Symbol__Alternatives ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:214:1: ( ( ( rule__Symbol__Alternatives ) ) )
            // InternalMyDsl.g:215:2: ( ( rule__Symbol__Alternatives ) )
            {
            // InternalMyDsl.g:215:2: ( ( rule__Symbol__Alternatives ) )
            // InternalMyDsl.g:216:3: ( rule__Symbol__Alternatives )
            {
             before(grammarAccess.getSymbolAccess().getAlternatives()); 
            // InternalMyDsl.g:217:3: ( rule__Symbol__Alternatives )
            // InternalMyDsl.g:217:4: rule__Symbol__Alternatives
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


    // $ANTLR start "ruleAmountEvent"
    // InternalMyDsl.g:226:1: ruleAmountEvent : ( ( rule__AmountEvent__Alternatives ) ) ;
    public final void ruleAmountEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:230:1: ( ( ( rule__AmountEvent__Alternatives ) ) )
            // InternalMyDsl.g:231:2: ( ( rule__AmountEvent__Alternatives ) )
            {
            // InternalMyDsl.g:231:2: ( ( rule__AmountEvent__Alternatives ) )
            // InternalMyDsl.g:232:3: ( rule__AmountEvent__Alternatives )
            {
             before(grammarAccess.getAmountEventAccess().getAlternatives()); 
            // InternalMyDsl.g:233:3: ( rule__AmountEvent__Alternatives )
            // InternalMyDsl.g:233:4: rule__AmountEvent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AmountEvent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAmountEventAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAmountEvent"


    // $ANTLR start "rule__PayerName__Alternatives"
    // InternalMyDsl.g:241:1: rule__PayerName__Alternatives : ( ( ( 'mindtree' ) ) | ( ( 'rohit' ) ) | ( ( 'abhishek' ) ) );
    public final void rule__PayerName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:245:1: ( ( ( 'mindtree' ) ) | ( ( 'rohit' ) ) | ( ( 'abhishek' ) ) )
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
                    // InternalMyDsl.g:246:2: ( ( 'mindtree' ) )
                    {
                    // InternalMyDsl.g:246:2: ( ( 'mindtree' ) )
                    // InternalMyDsl.g:247:3: ( 'mindtree' )
                    {
                     before(grammarAccess.getPayerNameAccess().getMINDTREEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:248:3: ( 'mindtree' )
                    // InternalMyDsl.g:248:4: 'mindtree'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getPayerNameAccess().getMINDTREEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:252:2: ( ( 'rohit' ) )
                    {
                    // InternalMyDsl.g:252:2: ( ( 'rohit' ) )
                    // InternalMyDsl.g:253:3: ( 'rohit' )
                    {
                     before(grammarAccess.getPayerNameAccess().getROHITEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:254:3: ( 'rohit' )
                    // InternalMyDsl.g:254:4: 'rohit'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPayerNameAccess().getROHITEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:258:2: ( ( 'abhishek' ) )
                    {
                    // InternalMyDsl.g:258:2: ( ( 'abhishek' ) )
                    // InternalMyDsl.g:259:3: ( 'abhishek' )
                    {
                     before(grammarAccess.getPayerNameAccess().getABHISHEKEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:260:3: ( 'abhishek' )
                    // InternalMyDsl.g:260:4: 'abhishek'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPayerNameAccess().getABHISHEKEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__PayerName__Alternatives"


    // $ANTLR start "rule__PayerEventName__Alternatives"
    // InternalMyDsl.g:268:1: rule__PayerEventName__Alternatives : ( ( ( 'credit' ) ) | ( ( 'debit' ) ) );
    public final void rule__PayerEventName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:272:1: ( ( ( 'credit' ) ) | ( ( 'debit' ) ) )
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
                    // InternalMyDsl.g:273:2: ( ( 'credit' ) )
                    {
                    // InternalMyDsl.g:273:2: ( ( 'credit' ) )
                    // InternalMyDsl.g:274:3: ( 'credit' )
                    {
                     before(grammarAccess.getPayerEventNameAccess().getCREDITEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:275:3: ( 'credit' )
                    // InternalMyDsl.g:275:4: 'credit'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPayerEventNameAccess().getCREDITEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:279:2: ( ( 'debit' ) )
                    {
                    // InternalMyDsl.g:279:2: ( ( 'debit' ) )
                    // InternalMyDsl.g:280:3: ( 'debit' )
                    {
                     before(grammarAccess.getPayerEventNameAccess().getDEBITEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:281:3: ( 'debit' )
                    // InternalMyDsl.g:281:4: 'debit'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPayerEventNameAccess().getDEBITEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__PayerEventName__Alternatives"


    // $ANTLR start "rule__Symbol__Alternatives"
    // InternalMyDsl.g:289:1: rule__Symbol__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__Symbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( ( ( '<' ) ) | ( ( '>' ) ) )
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
                    // InternalMyDsl.g:294:2: ( ( '<' ) )
                    {
                    // InternalMyDsl.g:294:2: ( ( '<' ) )
                    // InternalMyDsl.g:295:3: ( '<' )
                    {
                     before(grammarAccess.getSymbolAccess().getGREATEREnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:296:3: ( '<' )
                    // InternalMyDsl.g:296:4: '<'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSymbolAccess().getGREATEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:300:2: ( ( '>' ) )
                    {
                    // InternalMyDsl.g:300:2: ( ( '>' ) )
                    // InternalMyDsl.g:301:3: ( '>' )
                    {
                     before(grammarAccess.getSymbolAccess().getLESSEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:302:3: ( '>' )
                    // InternalMyDsl.g:302:4: '>'
                    {
                    match(input,17,FOLLOW_2); 

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


    // $ANTLR start "rule__AmountEvent__Alternatives"
    // InternalMyDsl.g:310:1: rule__AmountEvent__Alternatives : ( ( ( 'transfer' ) ) | ( ( 'request' ) ) );
    public final void rule__AmountEvent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( ( ( 'transfer' ) ) | ( ( 'request' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:315:2: ( ( 'transfer' ) )
                    {
                    // InternalMyDsl.g:315:2: ( ( 'transfer' ) )
                    // InternalMyDsl.g:316:3: ( 'transfer' )
                    {
                     before(grammarAccess.getAmountEventAccess().getTRANSFEREnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:317:3: ( 'transfer' )
                    // InternalMyDsl.g:317:4: 'transfer'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getAmountEventAccess().getTRANSFEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:321:2: ( ( 'request' ) )
                    {
                    // InternalMyDsl.g:321:2: ( ( 'request' ) )
                    // InternalMyDsl.g:322:3: ( 'request' )
                    {
                     before(grammarAccess.getAmountEventAccess().getREQUESTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:323:3: ( 'request' )
                    // InternalMyDsl.g:323:4: 'request'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getAmountEventAccess().getREQUESTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AmountEvent__Alternatives"


    // $ANTLR start "rule__RuleFragments__Group__0"
    // InternalMyDsl.g:331:1: rule__RuleFragments__Group__0 : rule__RuleFragments__Group__0__Impl rule__RuleFragments__Group__1 ;
    public final void rule__RuleFragments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( rule__RuleFragments__Group__0__Impl rule__RuleFragments__Group__1 )
            // InternalMyDsl.g:336:2: rule__RuleFragments__Group__0__Impl rule__RuleFragments__Group__1
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
    // InternalMyDsl.g:343:1: rule__RuleFragments__Group__0__Impl : ( 'rule' ) ;
    public final void rule__RuleFragments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( ( 'rule' ) )
            // InternalMyDsl.g:348:1: ( 'rule' )
            {
            // InternalMyDsl.g:348:1: ( 'rule' )
            // InternalMyDsl.g:349:2: 'rule'
            {
             before(grammarAccess.getRuleFragmentsAccess().getRuleKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:358:1: rule__RuleFragments__Group__1 : rule__RuleFragments__Group__1__Impl rule__RuleFragments__Group__2 ;
    public final void rule__RuleFragments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( rule__RuleFragments__Group__1__Impl rule__RuleFragments__Group__2 )
            // InternalMyDsl.g:363:2: rule__RuleFragments__Group__1__Impl rule__RuleFragments__Group__2
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
    // InternalMyDsl.g:370:1: rule__RuleFragments__Group__1__Impl : ( ( rule__RuleFragments__RuleNameAssignment_1 ) ) ;
    public final void rule__RuleFragments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:374:1: ( ( ( rule__RuleFragments__RuleNameAssignment_1 ) ) )
            // InternalMyDsl.g:375:1: ( ( rule__RuleFragments__RuleNameAssignment_1 ) )
            {
            // InternalMyDsl.g:375:1: ( ( rule__RuleFragments__RuleNameAssignment_1 ) )
            // InternalMyDsl.g:376:2: ( rule__RuleFragments__RuleNameAssignment_1 )
            {
             before(grammarAccess.getRuleFragmentsAccess().getRuleNameAssignment_1()); 
            // InternalMyDsl.g:377:2: ( rule__RuleFragments__RuleNameAssignment_1 )
            // InternalMyDsl.g:377:3: rule__RuleFragments__RuleNameAssignment_1
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
    // InternalMyDsl.g:385:1: rule__RuleFragments__Group__2 : rule__RuleFragments__Group__2__Impl rule__RuleFragments__Group__3 ;
    public final void rule__RuleFragments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( rule__RuleFragments__Group__2__Impl rule__RuleFragments__Group__3 )
            // InternalMyDsl.g:390:2: rule__RuleFragments__Group__2__Impl rule__RuleFragments__Group__3
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
    // InternalMyDsl.g:397:1: rule__RuleFragments__Group__2__Impl : ( '{' ) ;
    public final void rule__RuleFragments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:401:1: ( ( '{' ) )
            // InternalMyDsl.g:402:1: ( '{' )
            {
            // InternalMyDsl.g:402:1: ( '{' )
            // InternalMyDsl.g:403:2: '{'
            {
             before(grammarAccess.getRuleFragmentsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:412:1: rule__RuleFragments__Group__3 : rule__RuleFragments__Group__3__Impl rule__RuleFragments__Group__4 ;
    public final void rule__RuleFragments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( rule__RuleFragments__Group__3__Impl rule__RuleFragments__Group__4 )
            // InternalMyDsl.g:417:2: rule__RuleFragments__Group__3__Impl rule__RuleFragments__Group__4
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
    // InternalMyDsl.g:424:1: rule__RuleFragments__Group__3__Impl : ( ( rule__RuleFragments__RuleBodyAssignment_3 ) ) ;
    public final void rule__RuleFragments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( ( ( rule__RuleFragments__RuleBodyAssignment_3 ) ) )
            // InternalMyDsl.g:429:1: ( ( rule__RuleFragments__RuleBodyAssignment_3 ) )
            {
            // InternalMyDsl.g:429:1: ( ( rule__RuleFragments__RuleBodyAssignment_3 ) )
            // InternalMyDsl.g:430:2: ( rule__RuleFragments__RuleBodyAssignment_3 )
            {
             before(grammarAccess.getRuleFragmentsAccess().getRuleBodyAssignment_3()); 
            // InternalMyDsl.g:431:2: ( rule__RuleFragments__RuleBodyAssignment_3 )
            // InternalMyDsl.g:431:3: rule__RuleFragments__RuleBodyAssignment_3
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
    // InternalMyDsl.g:439:1: rule__RuleFragments__Group__4 : rule__RuleFragments__Group__4__Impl ;
    public final void rule__RuleFragments__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( rule__RuleFragments__Group__4__Impl )
            // InternalMyDsl.g:444:2: rule__RuleFragments__Group__4__Impl
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
    // InternalMyDsl.g:450:1: rule__RuleFragments__Group__4__Impl : ( '}' ) ;
    public final void rule__RuleFragments__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( ( '}' ) )
            // InternalMyDsl.g:455:1: ( '}' )
            {
            // InternalMyDsl.g:455:1: ( '}' )
            // InternalMyDsl.g:456:2: '}'
            {
             before(grammarAccess.getRuleFragmentsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:466:1: rule__RuleBody__Group__0 : rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 ;
    public final void rule__RuleBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1 )
            // InternalMyDsl.g:471:2: rule__RuleBody__Group__0__Impl rule__RuleBody__Group__1
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
    // InternalMyDsl.g:478:1: rule__RuleBody__Group__0__Impl : ( 'when' ) ;
    public final void rule__RuleBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:482:1: ( ( 'when' ) )
            // InternalMyDsl.g:483:1: ( 'when' )
            {
            // InternalMyDsl.g:483:1: ( 'when' )
            // InternalMyDsl.g:484:2: 'when'
            {
             before(grammarAccess.getRuleBodyAccess().getWhenKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:493:1: rule__RuleBody__Group__1 : rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2 ;
    public final void rule__RuleBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:497:1: ( rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2 )
            // InternalMyDsl.g:498:2: rule__RuleBody__Group__1__Impl rule__RuleBody__Group__2
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
    // InternalMyDsl.g:505:1: rule__RuleBody__Group__1__Impl : ( ( rule__RuleBody__PayerEventAssignment_1 ) ) ;
    public final void rule__RuleBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:509:1: ( ( ( rule__RuleBody__PayerEventAssignment_1 ) ) )
            // InternalMyDsl.g:510:1: ( ( rule__RuleBody__PayerEventAssignment_1 ) )
            {
            // InternalMyDsl.g:510:1: ( ( rule__RuleBody__PayerEventAssignment_1 ) )
            // InternalMyDsl.g:511:2: ( rule__RuleBody__PayerEventAssignment_1 )
            {
             before(grammarAccess.getRuleBodyAccess().getPayerEventAssignment_1()); 
            // InternalMyDsl.g:512:2: ( rule__RuleBody__PayerEventAssignment_1 )
            // InternalMyDsl.g:512:3: rule__RuleBody__PayerEventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleBody__PayerEventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getPayerEventAssignment_1()); 

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
    // InternalMyDsl.g:520:1: rule__RuleBody__Group__2 : rule__RuleBody__Group__2__Impl ;
    public final void rule__RuleBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( rule__RuleBody__Group__2__Impl )
            // InternalMyDsl.g:525:2: rule__RuleBody__Group__2__Impl
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
    // InternalMyDsl.g:531:1: rule__RuleBody__Group__2__Impl : ( ( rule__RuleBody__SubEventAssignment_2 )* ) ;
    public final void rule__RuleBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( ( ( rule__RuleBody__SubEventAssignment_2 )* ) )
            // InternalMyDsl.g:536:1: ( ( rule__RuleBody__SubEventAssignment_2 )* )
            {
            // InternalMyDsl.g:536:1: ( ( rule__RuleBody__SubEventAssignment_2 )* )
            // InternalMyDsl.g:537:2: ( rule__RuleBody__SubEventAssignment_2 )*
            {
             before(grammarAccess.getRuleBodyAccess().getSubEventAssignment_2()); 
            // InternalMyDsl.g:538:2: ( rule__RuleBody__SubEventAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:538:3: rule__RuleBody__SubEventAssignment_2
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


    // $ANTLR start "rule__PayerEvent__Group__0"
    // InternalMyDsl.g:547:1: rule__PayerEvent__Group__0 : rule__PayerEvent__Group__0__Impl rule__PayerEvent__Group__1 ;
    public final void rule__PayerEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:551:1: ( rule__PayerEvent__Group__0__Impl rule__PayerEvent__Group__1 )
            // InternalMyDsl.g:552:2: rule__PayerEvent__Group__0__Impl rule__PayerEvent__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PayerEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PayerEvent__Group__1();

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
    // $ANTLR end "rule__PayerEvent__Group__0"


    // $ANTLR start "rule__PayerEvent__Group__0__Impl"
    // InternalMyDsl.g:559:1: rule__PayerEvent__Group__0__Impl : ( ( rule__PayerEvent__PayerNameAssignment_0 ) ) ;
    public final void rule__PayerEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:563:1: ( ( ( rule__PayerEvent__PayerNameAssignment_0 ) ) )
            // InternalMyDsl.g:564:1: ( ( rule__PayerEvent__PayerNameAssignment_0 ) )
            {
            // InternalMyDsl.g:564:1: ( ( rule__PayerEvent__PayerNameAssignment_0 ) )
            // InternalMyDsl.g:565:2: ( rule__PayerEvent__PayerNameAssignment_0 )
            {
             before(grammarAccess.getPayerEventAccess().getPayerNameAssignment_0()); 
            // InternalMyDsl.g:566:2: ( rule__PayerEvent__PayerNameAssignment_0 )
            // InternalMyDsl.g:566:3: rule__PayerEvent__PayerNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PayerEvent__PayerNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPayerEventAccess().getPayerNameAssignment_0()); 

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
    // $ANTLR end "rule__PayerEvent__Group__0__Impl"


    // $ANTLR start "rule__PayerEvent__Group__1"
    // InternalMyDsl.g:574:1: rule__PayerEvent__Group__1 : rule__PayerEvent__Group__1__Impl rule__PayerEvent__Group__2 ;
    public final void rule__PayerEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( rule__PayerEvent__Group__1__Impl rule__PayerEvent__Group__2 )
            // InternalMyDsl.g:579:2: rule__PayerEvent__Group__1__Impl rule__PayerEvent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PayerEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PayerEvent__Group__2();

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
    // $ANTLR end "rule__PayerEvent__Group__1"


    // $ANTLR start "rule__PayerEvent__Group__1__Impl"
    // InternalMyDsl.g:586:1: rule__PayerEvent__Group__1__Impl : ( ( rule__PayerEvent__PayerEventNameAssignment_1 ) ) ;
    public final void rule__PayerEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:590:1: ( ( ( rule__PayerEvent__PayerEventNameAssignment_1 ) ) )
            // InternalMyDsl.g:591:1: ( ( rule__PayerEvent__PayerEventNameAssignment_1 ) )
            {
            // InternalMyDsl.g:591:1: ( ( rule__PayerEvent__PayerEventNameAssignment_1 ) )
            // InternalMyDsl.g:592:2: ( rule__PayerEvent__PayerEventNameAssignment_1 )
            {
             before(grammarAccess.getPayerEventAccess().getPayerEventNameAssignment_1()); 
            // InternalMyDsl.g:593:2: ( rule__PayerEvent__PayerEventNameAssignment_1 )
            // InternalMyDsl.g:593:3: rule__PayerEvent__PayerEventNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PayerEvent__PayerEventNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPayerEventAccess().getPayerEventNameAssignment_1()); 

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
    // $ANTLR end "rule__PayerEvent__Group__1__Impl"


    // $ANTLR start "rule__PayerEvent__Group__2"
    // InternalMyDsl.g:601:1: rule__PayerEvent__Group__2 : rule__PayerEvent__Group__2__Impl rule__PayerEvent__Group__3 ;
    public final void rule__PayerEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( rule__PayerEvent__Group__2__Impl rule__PayerEvent__Group__3 )
            // InternalMyDsl.g:606:2: rule__PayerEvent__Group__2__Impl rule__PayerEvent__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__PayerEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PayerEvent__Group__3();

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
    // $ANTLR end "rule__PayerEvent__Group__2"


    // $ANTLR start "rule__PayerEvent__Group__2__Impl"
    // InternalMyDsl.g:613:1: rule__PayerEvent__Group__2__Impl : ( ( rule__PayerEvent__SymbolAssignment_2 ) ) ;
    public final void rule__PayerEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:617:1: ( ( ( rule__PayerEvent__SymbolAssignment_2 ) ) )
            // InternalMyDsl.g:618:1: ( ( rule__PayerEvent__SymbolAssignment_2 ) )
            {
            // InternalMyDsl.g:618:1: ( ( rule__PayerEvent__SymbolAssignment_2 ) )
            // InternalMyDsl.g:619:2: ( rule__PayerEvent__SymbolAssignment_2 )
            {
             before(grammarAccess.getPayerEventAccess().getSymbolAssignment_2()); 
            // InternalMyDsl.g:620:2: ( rule__PayerEvent__SymbolAssignment_2 )
            // InternalMyDsl.g:620:3: rule__PayerEvent__SymbolAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PayerEvent__SymbolAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPayerEventAccess().getSymbolAssignment_2()); 

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
    // $ANTLR end "rule__PayerEvent__Group__2__Impl"


    // $ANTLR start "rule__PayerEvent__Group__3"
    // InternalMyDsl.g:628:1: rule__PayerEvent__Group__3 : rule__PayerEvent__Group__3__Impl ;
    public final void rule__PayerEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( rule__PayerEvent__Group__3__Impl )
            // InternalMyDsl.g:633:2: rule__PayerEvent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PayerEvent__Group__3__Impl();

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
    // $ANTLR end "rule__PayerEvent__Group__3"


    // $ANTLR start "rule__PayerEvent__Group__3__Impl"
    // InternalMyDsl.g:639:1: rule__PayerEvent__Group__3__Impl : ( ( rule__PayerEvent__AmountAssignment_3 ) ) ;
    public final void rule__PayerEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:643:1: ( ( ( rule__PayerEvent__AmountAssignment_3 ) ) )
            // InternalMyDsl.g:644:1: ( ( rule__PayerEvent__AmountAssignment_3 ) )
            {
            // InternalMyDsl.g:644:1: ( ( rule__PayerEvent__AmountAssignment_3 ) )
            // InternalMyDsl.g:645:2: ( rule__PayerEvent__AmountAssignment_3 )
            {
             before(grammarAccess.getPayerEventAccess().getAmountAssignment_3()); 
            // InternalMyDsl.g:646:2: ( rule__PayerEvent__AmountAssignment_3 )
            // InternalMyDsl.g:646:3: rule__PayerEvent__AmountAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PayerEvent__AmountAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPayerEventAccess().getAmountAssignment_3()); 

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
    // $ANTLR end "rule__PayerEvent__Group__3__Impl"


    // $ANTLR start "rule__SubEvent__Group__0"
    // InternalMyDsl.g:655:1: rule__SubEvent__Group__0 : rule__SubEvent__Group__0__Impl rule__SubEvent__Group__1 ;
    public final void rule__SubEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( rule__SubEvent__Group__0__Impl rule__SubEvent__Group__1 )
            // InternalMyDsl.g:660:2: rule__SubEvent__Group__0__Impl rule__SubEvent__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:667:1: rule__SubEvent__Group__0__Impl : ( 'then ' ) ;
    public final void rule__SubEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( 'then ' ) )
            // InternalMyDsl.g:672:1: ( 'then ' )
            {
            // InternalMyDsl.g:672:1: ( 'then ' )
            // InternalMyDsl.g:673:2: 'then '
            {
             before(grammarAccess.getSubEventAccess().getThenKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:682:1: rule__SubEvent__Group__1 : rule__SubEvent__Group__1__Impl rule__SubEvent__Group__2 ;
    public final void rule__SubEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( rule__SubEvent__Group__1__Impl rule__SubEvent__Group__2 )
            // InternalMyDsl.g:687:2: rule__SubEvent__Group__1__Impl rule__SubEvent__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:694:1: rule__SubEvent__Group__1__Impl : ( ( rule__SubEvent__AmountEventAssignment_1 ) ) ;
    public final void rule__SubEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( ( ( rule__SubEvent__AmountEventAssignment_1 ) ) )
            // InternalMyDsl.g:699:1: ( ( rule__SubEvent__AmountEventAssignment_1 ) )
            {
            // InternalMyDsl.g:699:1: ( ( rule__SubEvent__AmountEventAssignment_1 ) )
            // InternalMyDsl.g:700:2: ( rule__SubEvent__AmountEventAssignment_1 )
            {
             before(grammarAccess.getSubEventAccess().getAmountEventAssignment_1()); 
            // InternalMyDsl.g:701:2: ( rule__SubEvent__AmountEventAssignment_1 )
            // InternalMyDsl.g:701:3: rule__SubEvent__AmountEventAssignment_1
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
    // InternalMyDsl.g:709:1: rule__SubEvent__Group__2 : rule__SubEvent__Group__2__Impl rule__SubEvent__Group__3 ;
    public final void rule__SubEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( rule__SubEvent__Group__2__Impl rule__SubEvent__Group__3 )
            // InternalMyDsl.g:714:2: rule__SubEvent__Group__2__Impl rule__SubEvent__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SubEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEvent__Group__3();

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
    // InternalMyDsl.g:721:1: rule__SubEvent__Group__2__Impl : ( ( rule__SubEvent__AmountAssignment_2 ) ) ;
    public final void rule__SubEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( ( ( rule__SubEvent__AmountAssignment_2 ) ) )
            // InternalMyDsl.g:726:1: ( ( rule__SubEvent__AmountAssignment_2 ) )
            {
            // InternalMyDsl.g:726:1: ( ( rule__SubEvent__AmountAssignment_2 ) )
            // InternalMyDsl.g:727:2: ( rule__SubEvent__AmountAssignment_2 )
            {
             before(grammarAccess.getSubEventAccess().getAmountAssignment_2()); 
            // InternalMyDsl.g:728:2: ( rule__SubEvent__AmountAssignment_2 )
            // InternalMyDsl.g:728:3: rule__SubEvent__AmountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubEvent__AmountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubEventAccess().getAmountAssignment_2()); 

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


    // $ANTLR start "rule__SubEvent__Group__3"
    // InternalMyDsl.g:736:1: rule__SubEvent__Group__3 : rule__SubEvent__Group__3__Impl rule__SubEvent__Group__4 ;
    public final void rule__SubEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( rule__SubEvent__Group__3__Impl rule__SubEvent__Group__4 )
            // InternalMyDsl.g:741:2: rule__SubEvent__Group__3__Impl rule__SubEvent__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SubEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEvent__Group__4();

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
    // $ANTLR end "rule__SubEvent__Group__3"


    // $ANTLR start "rule__SubEvent__Group__3__Impl"
    // InternalMyDsl.g:748:1: rule__SubEvent__Group__3__Impl : ( 'to' ) ;
    public final void rule__SubEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( ( 'to' ) )
            // InternalMyDsl.g:753:1: ( 'to' )
            {
            // InternalMyDsl.g:753:1: ( 'to' )
            // InternalMyDsl.g:754:2: 'to'
            {
             before(grammarAccess.getSubEventAccess().getToKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSubEventAccess().getToKeyword_3()); 

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
    // $ANTLR end "rule__SubEvent__Group__3__Impl"


    // $ANTLR start "rule__SubEvent__Group__4"
    // InternalMyDsl.g:763:1: rule__SubEvent__Group__4 : rule__SubEvent__Group__4__Impl ;
    public final void rule__SubEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( rule__SubEvent__Group__4__Impl )
            // InternalMyDsl.g:768:2: rule__SubEvent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubEvent__Group__4__Impl();

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
    // $ANTLR end "rule__SubEvent__Group__4"


    // $ANTLR start "rule__SubEvent__Group__4__Impl"
    // InternalMyDsl.g:774:1: rule__SubEvent__Group__4__Impl : ( ( rule__SubEvent__PayerNameAssignment_4 ) ) ;
    public final void rule__SubEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:778:1: ( ( ( rule__SubEvent__PayerNameAssignment_4 ) ) )
            // InternalMyDsl.g:779:1: ( ( rule__SubEvent__PayerNameAssignment_4 ) )
            {
            // InternalMyDsl.g:779:1: ( ( rule__SubEvent__PayerNameAssignment_4 ) )
            // InternalMyDsl.g:780:2: ( rule__SubEvent__PayerNameAssignment_4 )
            {
             before(grammarAccess.getSubEventAccess().getPayerNameAssignment_4()); 
            // InternalMyDsl.g:781:2: ( rule__SubEvent__PayerNameAssignment_4 )
            // InternalMyDsl.g:781:3: rule__SubEvent__PayerNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SubEvent__PayerNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubEventAccess().getPayerNameAssignment_4()); 

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
    // $ANTLR end "rule__SubEvent__Group__4__Impl"


    // $ANTLR start "rule__Rules__RuleFragmentsAssignment"
    // InternalMyDsl.g:790:1: rule__Rules__RuleFragmentsAssignment : ( ruleRuleFragments ) ;
    public final void rule__Rules__RuleFragmentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( ( ruleRuleFragments ) )
            // InternalMyDsl.g:795:2: ( ruleRuleFragments )
            {
            // InternalMyDsl.g:795:2: ( ruleRuleFragments )
            // InternalMyDsl.g:796:3: ruleRuleFragments
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
    // InternalMyDsl.g:805:1: rule__RuleFragments__RuleNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleFragments__RuleNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:810:2: ( RULE_ID )
            {
            // InternalMyDsl.g:810:2: ( RULE_ID )
            // InternalMyDsl.g:811:3: RULE_ID
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
    // InternalMyDsl.g:820:1: rule__RuleFragments__RuleBodyAssignment_3 : ( ruleRuleBody ) ;
    public final void rule__RuleFragments__RuleBodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( ( ruleRuleBody ) )
            // InternalMyDsl.g:825:2: ( ruleRuleBody )
            {
            // InternalMyDsl.g:825:2: ( ruleRuleBody )
            // InternalMyDsl.g:826:3: ruleRuleBody
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


    // $ANTLR start "rule__RuleBody__PayerEventAssignment_1"
    // InternalMyDsl.g:835:1: rule__RuleBody__PayerEventAssignment_1 : ( rulePayerEvent ) ;
    public final void rule__RuleBody__PayerEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( rulePayerEvent ) )
            // InternalMyDsl.g:840:2: ( rulePayerEvent )
            {
            // InternalMyDsl.g:840:2: ( rulePayerEvent )
            // InternalMyDsl.g:841:3: rulePayerEvent
            {
             before(grammarAccess.getRuleBodyAccess().getPayerEventPayerEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePayerEvent();

            state._fsp--;

             after(grammarAccess.getRuleBodyAccess().getPayerEventPayerEventParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RuleBody__PayerEventAssignment_1"


    // $ANTLR start "rule__RuleBody__SubEventAssignment_2"
    // InternalMyDsl.g:850:1: rule__RuleBody__SubEventAssignment_2 : ( ruleSubEvent ) ;
    public final void rule__RuleBody__SubEventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( ruleSubEvent ) )
            // InternalMyDsl.g:855:2: ( ruleSubEvent )
            {
            // InternalMyDsl.g:855:2: ( ruleSubEvent )
            // InternalMyDsl.g:856:3: ruleSubEvent
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


    // $ANTLR start "rule__PayerEvent__PayerNameAssignment_0"
    // InternalMyDsl.g:865:1: rule__PayerEvent__PayerNameAssignment_0 : ( rulePayerName ) ;
    public final void rule__PayerEvent__PayerNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( ( rulePayerName ) )
            // InternalMyDsl.g:870:2: ( rulePayerName )
            {
            // InternalMyDsl.g:870:2: ( rulePayerName )
            // InternalMyDsl.g:871:3: rulePayerName
            {
             before(grammarAccess.getPayerEventAccess().getPayerNamePayerNameEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePayerName();

            state._fsp--;

             after(grammarAccess.getPayerEventAccess().getPayerNamePayerNameEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__PayerEvent__PayerNameAssignment_0"


    // $ANTLR start "rule__PayerEvent__PayerEventNameAssignment_1"
    // InternalMyDsl.g:880:1: rule__PayerEvent__PayerEventNameAssignment_1 : ( rulePayerEventName ) ;
    public final void rule__PayerEvent__PayerEventNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:884:1: ( ( rulePayerEventName ) )
            // InternalMyDsl.g:885:2: ( rulePayerEventName )
            {
            // InternalMyDsl.g:885:2: ( rulePayerEventName )
            // InternalMyDsl.g:886:3: rulePayerEventName
            {
             before(grammarAccess.getPayerEventAccess().getPayerEventNamePayerEventNameEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePayerEventName();

            state._fsp--;

             after(grammarAccess.getPayerEventAccess().getPayerEventNamePayerEventNameEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__PayerEvent__PayerEventNameAssignment_1"


    // $ANTLR start "rule__PayerEvent__SymbolAssignment_2"
    // InternalMyDsl.g:895:1: rule__PayerEvent__SymbolAssignment_2 : ( ruleSymbol ) ;
    public final void rule__PayerEvent__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( ( ruleSymbol ) )
            // InternalMyDsl.g:900:2: ( ruleSymbol )
            {
            // InternalMyDsl.g:900:2: ( ruleSymbol )
            // InternalMyDsl.g:901:3: ruleSymbol
            {
             before(grammarAccess.getPayerEventAccess().getSymbolSymbolEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getPayerEventAccess().getSymbolSymbolEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__PayerEvent__SymbolAssignment_2"


    // $ANTLR start "rule__PayerEvent__AmountAssignment_3"
    // InternalMyDsl.g:910:1: rule__PayerEvent__AmountAssignment_3 : ( RULE_INT ) ;
    public final void rule__PayerEvent__AmountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:915:2: ( RULE_INT )
            {
            // InternalMyDsl.g:915:2: ( RULE_INT )
            // InternalMyDsl.g:916:3: RULE_INT
            {
             before(grammarAccess.getPayerEventAccess().getAmountINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPayerEventAccess().getAmountINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__PayerEvent__AmountAssignment_3"


    // $ANTLR start "rule__SubEvent__AmountEventAssignment_1"
    // InternalMyDsl.g:925:1: rule__SubEvent__AmountEventAssignment_1 : ( ruleAmountEvent ) ;
    public final void rule__SubEvent__AmountEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( ( ruleAmountEvent ) )
            // InternalMyDsl.g:930:2: ( ruleAmountEvent )
            {
            // InternalMyDsl.g:930:2: ( ruleAmountEvent )
            // InternalMyDsl.g:931:3: ruleAmountEvent
            {
             before(grammarAccess.getSubEventAccess().getAmountEventAmountEventEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAmountEvent();

            state._fsp--;

             after(grammarAccess.getSubEventAccess().getAmountEventAmountEventEnumRuleCall_1_0()); 

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


    // $ANTLR start "rule__SubEvent__AmountAssignment_2"
    // InternalMyDsl.g:940:1: rule__SubEvent__AmountAssignment_2 : ( RULE_INT ) ;
    public final void rule__SubEvent__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:945:2: ( RULE_INT )
            {
            // InternalMyDsl.g:945:2: ( RULE_INT )
            // InternalMyDsl.g:946:3: RULE_INT
            {
             before(grammarAccess.getSubEventAccess().getAmountINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSubEventAccess().getAmountINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SubEvent__AmountAssignment_2"


    // $ANTLR start "rule__SubEvent__PayerNameAssignment_4"
    // InternalMyDsl.g:955:1: rule__SubEvent__PayerNameAssignment_4 : ( rulePayerName ) ;
    public final void rule__SubEvent__PayerNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:959:1: ( ( rulePayerName ) )
            // InternalMyDsl.g:960:2: ( rulePayerName )
            {
            // InternalMyDsl.g:960:2: ( rulePayerName )
            // InternalMyDsl.g:961:3: rulePayerName
            {
             before(grammarAccess.getSubEventAccess().getPayerNamePayerNameEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePayerName();

            state._fsp--;

             after(grammarAccess.getSubEventAccess().getPayerNamePayerNameEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__SubEvent__PayerNameAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});

}