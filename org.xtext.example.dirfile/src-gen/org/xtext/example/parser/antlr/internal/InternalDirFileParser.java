package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.DirFileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDirFileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dir'", "'enddir'", "'file'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDirFileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDirFileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDirFileParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDirFile.g"; }



     	private DirFileGrammarAccess grammarAccess;

        public InternalDirFileParser(TokenStream input, DirFileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Directory";
       	}

       	@Override
       	protected DirFileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDirectory"
    // InternalDirFile.g:64:1: entryRuleDirectory returns [EObject current=null] : iv_ruleDirectory= ruleDirectory EOF ;
    public final EObject entryRuleDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectory = null;


        try {
            // InternalDirFile.g:64:50: (iv_ruleDirectory= ruleDirectory EOF )
            // InternalDirFile.g:65:2: iv_ruleDirectory= ruleDirectory EOF
            {
             newCompositeNode(grammarAccess.getDirectoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectory=ruleDirectory();

            state._fsp--;

             current =iv_ruleDirectory; 
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
    // $ANTLR end "entryRuleDirectory"


    // $ANTLR start "ruleDirectory"
    // InternalDirFile.g:71:1: ruleDirectory returns [EObject current=null] : (otherlv_0= 'dir' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_tree_2_0= ruleTYPE_DIR_FILE ) )* otherlv_3= 'enddir' ) ;
    public final EObject ruleDirectory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_tree_2_0 = null;



        	enterRule();

        try {
            // InternalDirFile.g:77:2: ( (otherlv_0= 'dir' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_tree_2_0= ruleTYPE_DIR_FILE ) )* otherlv_3= 'enddir' ) )
            // InternalDirFile.g:78:2: (otherlv_0= 'dir' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_tree_2_0= ruleTYPE_DIR_FILE ) )* otherlv_3= 'enddir' )
            {
            // InternalDirFile.g:78:2: (otherlv_0= 'dir' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_tree_2_0= ruleTYPE_DIR_FILE ) )* otherlv_3= 'enddir' )
            // InternalDirFile.g:79:3: otherlv_0= 'dir' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_tree_2_0= ruleTYPE_DIR_FILE ) )* otherlv_3= 'enddir'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectoryAccess().getDirKeyword_0());
            		
            // InternalDirFile.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDirFile.g:84:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDirFile.g:84:4: (lv_name_1_0= RULE_STRING )
            // InternalDirFile.g:85:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDirectoryAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDirFile.g:101:3: ( (lv_tree_2_0= ruleTYPE_DIR_FILE ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDirFile.g:102:4: (lv_tree_2_0= ruleTYPE_DIR_FILE )
            	    {
            	    // InternalDirFile.g:102:4: (lv_tree_2_0= ruleTYPE_DIR_FILE )
            	    // InternalDirFile.g:103:5: lv_tree_2_0= ruleTYPE_DIR_FILE
            	    {

            	    					newCompositeNode(grammarAccess.getDirectoryAccess().getTreeTYPE_DIR_FILEParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_tree_2_0=ruleTYPE_DIR_FILE();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDirectoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tree",
            	    						lv_tree_2_0,
            	    						"org.xtext.example.DirFile.TYPE_DIR_FILE");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDirectoryAccess().getEnddirKeyword_3());
            		

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
    // $ANTLR end "ruleDirectory"


    // $ANTLR start "entryRuleFile"
    // InternalDirFile.g:128:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalDirFile.g:128:45: (iv_ruleFile= ruleFile EOF )
            // InternalDirFile.g:129:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalDirFile.g:135:1: ruleFile returns [EObject current=null] : (otherlv_0= 'file' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDirFile.g:141:2: ( (otherlv_0= 'file' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalDirFile.g:142:2: (otherlv_0= 'file' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalDirFile.g:142:2: (otherlv_0= 'file' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalDirFile.g:143:3: otherlv_0= 'file' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFileKeyword_0());
            		
            // InternalDirFile.g:147:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDirFile.g:148:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDirFile.g:148:4: (lv_name_1_0= RULE_STRING )
            // InternalDirFile.g:149:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFileAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleTYPE_DIR_FILE"
    // InternalDirFile.g:169:1: entryRuleTYPE_DIR_FILE returns [EObject current=null] : iv_ruleTYPE_DIR_FILE= ruleTYPE_DIR_FILE EOF ;
    public final EObject entryRuleTYPE_DIR_FILE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE_DIR_FILE = null;


        try {
            // InternalDirFile.g:169:54: (iv_ruleTYPE_DIR_FILE= ruleTYPE_DIR_FILE EOF )
            // InternalDirFile.g:170:2: iv_ruleTYPE_DIR_FILE= ruleTYPE_DIR_FILE EOF
            {
             newCompositeNode(grammarAccess.getTYPE_DIR_FILERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_DIR_FILE=ruleTYPE_DIR_FILE();

            state._fsp--;

             current =iv_ruleTYPE_DIR_FILE; 
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
    // $ANTLR end "entryRuleTYPE_DIR_FILE"


    // $ANTLR start "ruleTYPE_DIR_FILE"
    // InternalDirFile.g:176:1: ruleTYPE_DIR_FILE returns [EObject current=null] : (this_Directory_0= ruleDirectory | this_File_1= ruleFile ) ;
    public final EObject ruleTYPE_DIR_FILE() throws RecognitionException {
        EObject current = null;

        EObject this_Directory_0 = null;

        EObject this_File_1 = null;



        	enterRule();

        try {
            // InternalDirFile.g:182:2: ( (this_Directory_0= ruleDirectory | this_File_1= ruleFile ) )
            // InternalDirFile.g:183:2: (this_Directory_0= ruleDirectory | this_File_1= ruleFile )
            {
            // InternalDirFile.g:183:2: (this_Directory_0= ruleDirectory | this_File_1= ruleFile )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDirFile.g:184:3: this_Directory_0= ruleDirectory
                    {

                    			newCompositeNode(grammarAccess.getTYPE_DIR_FILEAccess().getDirectoryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Directory_0=ruleDirectory();

                    state._fsp--;


                    			current = this_Directory_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDirFile.g:193:3: this_File_1= ruleFile
                    {

                    			newCompositeNode(grammarAccess.getTYPE_DIR_FILEAccess().getFileParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_File_1=ruleFile();

                    state._fsp--;


                    			current = this_File_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleTYPE_DIR_FILE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003800L});

}