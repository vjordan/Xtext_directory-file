/*
 * generated by Xtext 2.15.0
 */
grammar InternalDirFile;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDirectory
entryRuleDirectory returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDirectoryRule()); }
	iv_ruleDirectory=ruleDirectory
	{ $current=$iv_ruleDirectory.current; }
	EOF;

// Rule Directory
ruleDirectory returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='dir'
		{
			newLeafNode(otherlv_0, grammarAccess.getDirectoryAccess().getDirKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDirectoryAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDirectoryRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDirectoryAccess().getTreeTYPE_DIR_FILEParserRuleCall_2_0());
				}
				lv_tree_2_0=ruleTYPE_DIR_FILE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDirectoryRule());
					}
					add(
						$current,
						"tree",
						lv_tree_2_0,
						"org.xtext.example.DirFile.TYPE_DIR_FILE");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='enddir'
		{
			newLeafNode(otherlv_3, grammarAccess.getDirectoryAccess().getEnddirKeyword_3());
		}
	)
;

// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFileRule()); }
	iv_ruleFile=ruleFile
	{ $current=$iv_ruleFile.current; }
	EOF;

// Rule File
ruleFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='file'
		{
			newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFileKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFileAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFileRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleTYPE_DIR_FILE
entryRuleTYPE_DIR_FILE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTYPE_DIR_FILERule()); }
	iv_ruleTYPE_DIR_FILE=ruleTYPE_DIR_FILE
	{ $current=$iv_ruleTYPE_DIR_FILE.current; }
	EOF;

// Rule TYPE_DIR_FILE
ruleTYPE_DIR_FILE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTYPE_DIR_FILEAccess().getDirectoryParserRuleCall_0());
		}
		this_Directory_0=ruleDirectory
		{
			$current = $this_Directory_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTYPE_DIR_FILEAccess().getFileParserRuleCall_1());
		}
		this_File_1=ruleFile
		{
			$current = $this_File_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
