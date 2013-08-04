package org.com.compiladores.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.com.compiladores.services.CGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g"; }



     	private CGrammarAccess grammarAccess;
     	
        public InternalCParser(TokenStream input, CGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected CGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModel"
    // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:67:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:68:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:69:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel75);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel85); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:76:1: ruleDomainModel returns [EObject current=null] : ( (lv_geetings_0_0= ruletesta ) ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_geetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:79:28: ( ( (lv_geetings_0_0= ruletesta ) ) )
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:80:1: ( (lv_geetings_0_0= ruletesta ) )
            {
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:80:1: ( (lv_geetings_0_0= ruletesta ) )
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:81:1: (lv_geetings_0_0= ruletesta )
            {
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:81:1: (lv_geetings_0_0= ruletesta )
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:82:3: lv_geetings_0_0= ruletesta
            {
             
            	        newCompositeNode(grammarAccess.getDomainModelAccess().getGeetingsTestaParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruletesta_in_ruleDomainModel130);
            lv_geetings_0_0=ruletesta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	        }
                   		add(
                   			current, 
                   			"geetings",
                    		lv_geetings_0_0, 
                    		"testa");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuletesta"
    // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:106:1: entryRuletesta returns [String current=null] : iv_ruletesta= ruletesta EOF ;
    public final String entryRuletesta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletesta = null;


        try {
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:107:2: (iv_ruletesta= ruletesta EOF )
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:108:2: iv_ruletesta= ruletesta EOF
            {
             newCompositeNode(grammarAccess.getTestaRule()); 
            pushFollow(FOLLOW_ruletesta_in_entryRuletesta166);
            iv_ruletesta=ruletesta();

            state._fsp--;

             current =iv_ruletesta.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletesta177); 

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
    // $ANTLR end "entryRuletesta"


    // $ANTLR start "ruletesta"
    // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:115:1: ruletesta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'pega' ;
    public final AntlrDatatypeRuleToken ruletesta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:118:28: (kw= 'pega' )
            // ../com.ufcg.compiladores/src-gen/org/com/compiladores/parser/antlr/internal/InternalC.g:120:2: kw= 'pega'
            {
            kw=(Token)match(input,11,FOLLOW_11_in_ruletesta214); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTestaAccess().getPegaKeyword()); 
                

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
    // $ANTLR end "ruletesta"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletesta_in_ruleDomainModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletesta_in_entryRuletesta166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletesta177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruletesta214 = new BitSet(new long[]{0x0000000000000002L});

}