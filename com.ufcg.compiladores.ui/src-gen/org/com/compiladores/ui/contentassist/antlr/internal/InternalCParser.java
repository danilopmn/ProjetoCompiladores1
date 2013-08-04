package org.com.compiladores.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.com.compiladores.services.CGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pega'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__11=11;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCParser.tokenNames; }
    public String getGrammarFileName() { return "../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g"; }


     
     	private CGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDomainModel"
    // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:60:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:61:1: ( ruleDomainModel EOF )
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:62:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel61);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel68); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:69:1: ruleDomainModel : ( ( rule__DomainModel__GeetingsAssignment ) ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:73:2: ( ( ( rule__DomainModel__GeetingsAssignment ) ) )
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:74:1: ( ( rule__DomainModel__GeetingsAssignment ) )
            {
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:74:1: ( ( rule__DomainModel__GeetingsAssignment ) )
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:75:1: ( rule__DomainModel__GeetingsAssignment )
            {
             before(grammarAccess.getDomainModelAccess().getGeetingsAssignment()); 
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:76:1: ( rule__DomainModel__GeetingsAssignment )
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:76:2: rule__DomainModel__GeetingsAssignment
            {
            pushFollow(FOLLOW_rule__DomainModel__GeetingsAssignment_in_ruleDomainModel94);
            rule__DomainModel__GeetingsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getGeetingsAssignment()); 

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuletesta"
    // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:88:1: entryRuletesta : ruletesta EOF ;
    public final void entryRuletesta() throws RecognitionException {
        try {
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:89:1: ( ruletesta EOF )
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:90:1: ruletesta EOF
            {
             before(grammarAccess.getTestaRule()); 
            pushFollow(FOLLOW_ruletesta_in_entryRuletesta121);
            ruletesta();

            state._fsp--;

             after(grammarAccess.getTestaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletesta128); 

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
    // $ANTLR end "entryRuletesta"


    // $ANTLR start "ruletesta"
    // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:97:1: ruletesta : ( 'pega' ) ;
    public final void ruletesta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:101:2: ( ( 'pega' ) )
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:102:1: ( 'pega' )
            {
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:102:1: ( 'pega' )
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:103:1: 'pega'
            {
             before(grammarAccess.getTestaAccess().getPegaKeyword()); 
            match(input,11,FOLLOW_11_in_ruletesta155); 
             after(grammarAccess.getTestaAccess().getPegaKeyword()); 

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
    // $ANTLR end "ruletesta"


    // $ANTLR start "rule__DomainModel__GeetingsAssignment"
    // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:121:1: rule__DomainModel__GeetingsAssignment : ( ruletesta ) ;
    public final void rule__DomainModel__GeetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:125:1: ( ( ruletesta ) )
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:126:1: ( ruletesta )
            {
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:126:1: ( ruletesta )
            // ../com.ufcg.compiladores.ui/src-gen/org/com/compiladores/ui/contentassist/antlr/internal/InternalC.g:127:1: ruletesta
            {
             before(grammarAccess.getDomainModelAccess().getGeetingsTestaParserRuleCall_0()); 
            pushFollow(FOLLOW_ruletesta_in_rule__DomainModel__GeetingsAssignment195);
            ruletesta();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getGeetingsTestaParserRuleCall_0()); 

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
    // $ANTLR end "rule__DomainModel__GeetingsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__GeetingsAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletesta_in_entryRuletesta121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletesta128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruletesta155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletesta_in_rule__DomainModel__GeetingsAssignment195 = new BitSet(new long[]{0x0000000000000002L});

}