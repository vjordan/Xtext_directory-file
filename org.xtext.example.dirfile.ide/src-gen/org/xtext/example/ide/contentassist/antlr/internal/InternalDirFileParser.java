package org.xtext.example.ide.contentassist.antlr.internal;

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
import org.xtext.example.services.DirFileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDirFileParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(DirFileGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDirectory"
    // InternalDirFile.g:53:1: entryRuleDirectory : ruleDirectory EOF ;
    public final void entryRuleDirectory() throws RecognitionException {
        try {
            // InternalDirFile.g:54:1: ( ruleDirectory EOF )
            // InternalDirFile.g:55:1: ruleDirectory EOF
            {
             before(grammarAccess.getDirectoryRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectory();

            state._fsp--;

             after(grammarAccess.getDirectoryRule()); 
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
    // $ANTLR end "entryRuleDirectory"


    // $ANTLR start "ruleDirectory"
    // InternalDirFile.g:62:1: ruleDirectory : ( ( rule__Directory__Group__0 ) ) ;
    public final void ruleDirectory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:66:2: ( ( ( rule__Directory__Group__0 ) ) )
            // InternalDirFile.g:67:2: ( ( rule__Directory__Group__0 ) )
            {
            // InternalDirFile.g:67:2: ( ( rule__Directory__Group__0 ) )
            // InternalDirFile.g:68:3: ( rule__Directory__Group__0 )
            {
             before(grammarAccess.getDirectoryAccess().getGroup()); 
            // InternalDirFile.g:69:3: ( rule__Directory__Group__0 )
            // InternalDirFile.g:69:4: rule__Directory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Directory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectoryAccess().getGroup()); 

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
    // $ANTLR end "ruleDirectory"


    // $ANTLR start "entryRuleFile"
    // InternalDirFile.g:78:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalDirFile.g:79:1: ( ruleFile EOF )
            // InternalDirFile.g:80:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalDirFile.g:87:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:91:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalDirFile.g:92:2: ( ( rule__File__Group__0 ) )
            {
            // InternalDirFile.g:92:2: ( ( rule__File__Group__0 ) )
            // InternalDirFile.g:93:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalDirFile.g:94:3: ( rule__File__Group__0 )
            // InternalDirFile.g:94:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleTYPE_DIR_FILE"
    // InternalDirFile.g:103:1: entryRuleTYPE_DIR_FILE : ruleTYPE_DIR_FILE EOF ;
    public final void entryRuleTYPE_DIR_FILE() throws RecognitionException {
        try {
            // InternalDirFile.g:104:1: ( ruleTYPE_DIR_FILE EOF )
            // InternalDirFile.g:105:1: ruleTYPE_DIR_FILE EOF
            {
             before(grammarAccess.getTYPE_DIR_FILERule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_DIR_FILE();

            state._fsp--;

             after(grammarAccess.getTYPE_DIR_FILERule()); 
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
    // $ANTLR end "entryRuleTYPE_DIR_FILE"


    // $ANTLR start "ruleTYPE_DIR_FILE"
    // InternalDirFile.g:112:1: ruleTYPE_DIR_FILE : ( ( rule__TYPE_DIR_FILE__Alternatives ) ) ;
    public final void ruleTYPE_DIR_FILE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:116:2: ( ( ( rule__TYPE_DIR_FILE__Alternatives ) ) )
            // InternalDirFile.g:117:2: ( ( rule__TYPE_DIR_FILE__Alternatives ) )
            {
            // InternalDirFile.g:117:2: ( ( rule__TYPE_DIR_FILE__Alternatives ) )
            // InternalDirFile.g:118:3: ( rule__TYPE_DIR_FILE__Alternatives )
            {
             before(grammarAccess.getTYPE_DIR_FILEAccess().getAlternatives()); 
            // InternalDirFile.g:119:3: ( rule__TYPE_DIR_FILE__Alternatives )
            // InternalDirFile.g:119:4: rule__TYPE_DIR_FILE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_DIR_FILE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_DIR_FILEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTYPE_DIR_FILE"


    // $ANTLR start "rule__TYPE_DIR_FILE__Alternatives"
    // InternalDirFile.g:127:1: rule__TYPE_DIR_FILE__Alternatives : ( ( ruleDirectory ) | ( ruleFile ) );
    public final void rule__TYPE_DIR_FILE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:131:1: ( ( ruleDirectory ) | ( ruleFile ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDirFile.g:132:2: ( ruleDirectory )
                    {
                    // InternalDirFile.g:132:2: ( ruleDirectory )
                    // InternalDirFile.g:133:3: ruleDirectory
                    {
                     before(grammarAccess.getTYPE_DIR_FILEAccess().getDirectoryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectory();

                    state._fsp--;

                     after(grammarAccess.getTYPE_DIR_FILEAccess().getDirectoryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDirFile.g:138:2: ( ruleFile )
                    {
                    // InternalDirFile.g:138:2: ( ruleFile )
                    // InternalDirFile.g:139:3: ruleFile
                    {
                     before(grammarAccess.getTYPE_DIR_FILEAccess().getFileParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFile();

                    state._fsp--;

                     after(grammarAccess.getTYPE_DIR_FILEAccess().getFileParserRuleCall_1()); 

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
    // $ANTLR end "rule__TYPE_DIR_FILE__Alternatives"


    // $ANTLR start "rule__Directory__Group__0"
    // InternalDirFile.g:148:1: rule__Directory__Group__0 : rule__Directory__Group__0__Impl rule__Directory__Group__1 ;
    public final void rule__Directory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:152:1: ( rule__Directory__Group__0__Impl rule__Directory__Group__1 )
            // InternalDirFile.g:153:2: rule__Directory__Group__0__Impl rule__Directory__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Directory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group__1();

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
    // $ANTLR end "rule__Directory__Group__0"


    // $ANTLR start "rule__Directory__Group__0__Impl"
    // InternalDirFile.g:160:1: rule__Directory__Group__0__Impl : ( 'dir' ) ;
    public final void rule__Directory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:164:1: ( ( 'dir' ) )
            // InternalDirFile.g:165:1: ( 'dir' )
            {
            // InternalDirFile.g:165:1: ( 'dir' )
            // InternalDirFile.g:166:2: 'dir'
            {
             before(grammarAccess.getDirectoryAccess().getDirKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getDirKeyword_0()); 

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
    // $ANTLR end "rule__Directory__Group__0__Impl"


    // $ANTLR start "rule__Directory__Group__1"
    // InternalDirFile.g:175:1: rule__Directory__Group__1 : rule__Directory__Group__1__Impl rule__Directory__Group__2 ;
    public final void rule__Directory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:179:1: ( rule__Directory__Group__1__Impl rule__Directory__Group__2 )
            // InternalDirFile.g:180:2: rule__Directory__Group__1__Impl rule__Directory__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Directory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group__2();

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
    // $ANTLR end "rule__Directory__Group__1"


    // $ANTLR start "rule__Directory__Group__1__Impl"
    // InternalDirFile.g:187:1: rule__Directory__Group__1__Impl : ( ( rule__Directory__NameAssignment_1 ) ) ;
    public final void rule__Directory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:191:1: ( ( ( rule__Directory__NameAssignment_1 ) ) )
            // InternalDirFile.g:192:1: ( ( rule__Directory__NameAssignment_1 ) )
            {
            // InternalDirFile.g:192:1: ( ( rule__Directory__NameAssignment_1 ) )
            // InternalDirFile.g:193:2: ( rule__Directory__NameAssignment_1 )
            {
             before(grammarAccess.getDirectoryAccess().getNameAssignment_1()); 
            // InternalDirFile.g:194:2: ( rule__Directory__NameAssignment_1 )
            // InternalDirFile.g:194:3: rule__Directory__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Directory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectoryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Directory__Group__1__Impl"


    // $ANTLR start "rule__Directory__Group__2"
    // InternalDirFile.g:202:1: rule__Directory__Group__2 : rule__Directory__Group__2__Impl rule__Directory__Group__3 ;
    public final void rule__Directory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:206:1: ( rule__Directory__Group__2__Impl rule__Directory__Group__3 )
            // InternalDirFile.g:207:2: rule__Directory__Group__2__Impl rule__Directory__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Directory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directory__Group__3();

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
    // $ANTLR end "rule__Directory__Group__2"


    // $ANTLR start "rule__Directory__Group__2__Impl"
    // InternalDirFile.g:214:1: rule__Directory__Group__2__Impl : ( ( rule__Directory__TreeAssignment_2 )* ) ;
    public final void rule__Directory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:218:1: ( ( ( rule__Directory__TreeAssignment_2 )* ) )
            // InternalDirFile.g:219:1: ( ( rule__Directory__TreeAssignment_2 )* )
            {
            // InternalDirFile.g:219:1: ( ( rule__Directory__TreeAssignment_2 )* )
            // InternalDirFile.g:220:2: ( rule__Directory__TreeAssignment_2 )*
            {
             before(grammarAccess.getDirectoryAccess().getTreeAssignment_2()); 
            // InternalDirFile.g:221:2: ( rule__Directory__TreeAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDirFile.g:221:3: rule__Directory__TreeAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Directory__TreeAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDirectoryAccess().getTreeAssignment_2()); 

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
    // $ANTLR end "rule__Directory__Group__2__Impl"


    // $ANTLR start "rule__Directory__Group__3"
    // InternalDirFile.g:229:1: rule__Directory__Group__3 : rule__Directory__Group__3__Impl ;
    public final void rule__Directory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:233:1: ( rule__Directory__Group__3__Impl )
            // InternalDirFile.g:234:2: rule__Directory__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Directory__Group__3__Impl();

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
    // $ANTLR end "rule__Directory__Group__3"


    // $ANTLR start "rule__Directory__Group__3__Impl"
    // InternalDirFile.g:240:1: rule__Directory__Group__3__Impl : ( 'enddir' ) ;
    public final void rule__Directory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:244:1: ( ( 'enddir' ) )
            // InternalDirFile.g:245:1: ( 'enddir' )
            {
            // InternalDirFile.g:245:1: ( 'enddir' )
            // InternalDirFile.g:246:2: 'enddir'
            {
             before(grammarAccess.getDirectoryAccess().getEnddirKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getEnddirKeyword_3()); 

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
    // $ANTLR end "rule__Directory__Group__3__Impl"


    // $ANTLR start "rule__File__Group__0"
    // InternalDirFile.g:256:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:260:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalDirFile.g:261:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

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
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalDirFile.g:268:1: rule__File__Group__0__Impl : ( 'file' ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:272:1: ( ( 'file' ) )
            // InternalDirFile.g:273:1: ( 'file' )
            {
            // InternalDirFile.g:273:1: ( 'file' )
            // InternalDirFile.g:274:2: 'file'
            {
             before(grammarAccess.getFileAccess().getFileKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getFileKeyword_0()); 

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
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalDirFile.g:283:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:287:1: ( rule__File__Group__1__Impl )
            // InternalDirFile.g:288:2: rule__File__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__1__Impl();

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
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalDirFile.g:294:1: rule__File__Group__1__Impl : ( ( rule__File__NameAssignment_1 ) ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:298:1: ( ( ( rule__File__NameAssignment_1 ) ) )
            // InternalDirFile.g:299:1: ( ( rule__File__NameAssignment_1 ) )
            {
            // InternalDirFile.g:299:1: ( ( rule__File__NameAssignment_1 ) )
            // InternalDirFile.g:300:2: ( rule__File__NameAssignment_1 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_1()); 
            // InternalDirFile.g:301:2: ( rule__File__NameAssignment_1 )
            // InternalDirFile.g:301:3: rule__File__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__File__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__Directory__NameAssignment_1"
    // InternalDirFile.g:310:1: rule__Directory__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Directory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:314:1: ( ( RULE_STRING ) )
            // InternalDirFile.g:315:2: ( RULE_STRING )
            {
            // InternalDirFile.g:315:2: ( RULE_STRING )
            // InternalDirFile.g:316:3: RULE_STRING
            {
             before(grammarAccess.getDirectoryAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDirectoryAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Directory__NameAssignment_1"


    // $ANTLR start "rule__Directory__TreeAssignment_2"
    // InternalDirFile.g:325:1: rule__Directory__TreeAssignment_2 : ( ruleTYPE_DIR_FILE ) ;
    public final void rule__Directory__TreeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:329:1: ( ( ruleTYPE_DIR_FILE ) )
            // InternalDirFile.g:330:2: ( ruleTYPE_DIR_FILE )
            {
            // InternalDirFile.g:330:2: ( ruleTYPE_DIR_FILE )
            // InternalDirFile.g:331:3: ruleTYPE_DIR_FILE
            {
             before(grammarAccess.getDirectoryAccess().getTreeTYPE_DIR_FILEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_DIR_FILE();

            state._fsp--;

             after(grammarAccess.getDirectoryAccess().getTreeTYPE_DIR_FILEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Directory__TreeAssignment_2"


    // $ANTLR start "rule__File__NameAssignment_1"
    // InternalDirFile.g:340:1: rule__File__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__File__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDirFile.g:344:1: ( ( RULE_STRING ) )
            // InternalDirFile.g:345:2: ( RULE_STRING )
            {
            // InternalDirFile.g:345:2: ( RULE_STRING )
            // InternalDirFile.g:346:3: RULE_STRING
            {
             before(grammarAccess.getFileAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__File__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002802L});

}