/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DirFileGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DirectoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.DirFile.Directory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDirKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTreeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTreeTYPE_DIR_FILEParserRuleCall_2_0 = (RuleCall)cTreeAssignment_2.eContents().get(0);
		private final Keyword cEnddirKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Directory:
		//	"dir" name=STRING
		//	tree+=TYPE_DIR_FILE*
		//	"enddir";
		@Override public ParserRule getRule() { return rule; }
		
		//"dir" name=STRING tree+=TYPE_DIR_FILE* "enddir"
		public Group getGroup() { return cGroup; }
		
		//"dir"
		public Keyword getDirKeyword_0() { return cDirKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//tree+=TYPE_DIR_FILE*
		public Assignment getTreeAssignment_2() { return cTreeAssignment_2; }
		
		//TYPE_DIR_FILE
		public RuleCall getTreeTYPE_DIR_FILEParserRuleCall_2_0() { return cTreeTYPE_DIR_FILEParserRuleCall_2_0; }
		
		//"enddir"
		public Keyword getEnddirKeyword_3() { return cEnddirKeyword_3; }
	}
	public class FileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.DirFile.File");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//File:
		//	"file" name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//"file" name=STRING
		public Group getGroup() { return cGroup; }
		
		//"file"
		public Keyword getFileKeyword_0() { return cFileKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	public class TYPE_DIR_FILEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.DirFile.TYPE_DIR_FILE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDirectoryParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFileParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TYPE_DIR_FILE:
		//	Directory | File;
		@Override public ParserRule getRule() { return rule; }
		
		//Directory | File
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Directory
		public RuleCall getDirectoryParserRuleCall_0() { return cDirectoryParserRuleCall_0; }
		
		//File
		public RuleCall getFileParserRuleCall_1() { return cFileParserRuleCall_1; }
	}
	public class FirstDirectoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.DirFile.FirstDirectory");
		private final Assignment cFirstDirectoryAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFirstDirectoryDirectoryParserRuleCall_0 = (RuleCall)cFirstDirectoryAssignment.eContents().get(0);
		
		//FirstDirectory:
		//	firstDirectory=Directory;
		@Override public ParserRule getRule() { return rule; }
		
		//firstDirectory=Directory
		public Assignment getFirstDirectoryAssignment() { return cFirstDirectoryAssignment; }
		
		//Directory
		public RuleCall getFirstDirectoryDirectoryParserRuleCall_0() { return cFirstDirectoryDirectoryParserRuleCall_0; }
	}
	
	
	private final DirectoryElements pDirectory;
	private final FileElements pFile;
	private final TYPE_DIR_FILEElements pTYPE_DIR_FILE;
	private final FirstDirectoryElements pFirstDirectory;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DirFileGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDirectory = new DirectoryElements();
		this.pFile = new FileElements();
		this.pTYPE_DIR_FILE = new TYPE_DIR_FILEElements();
		this.pFirstDirectory = new FirstDirectoryElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.DirFile".equals(grammar.getName())) {
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

	
	//Directory:
	//	"dir" name=STRING
	//	tree+=TYPE_DIR_FILE*
	//	"enddir";
	public DirectoryElements getDirectoryAccess() {
		return pDirectory;
	}
	
	public ParserRule getDirectoryRule() {
		return getDirectoryAccess().getRule();
	}
	
	//File:
	//	"file" name=STRING;
	public FileElements getFileAccess() {
		return pFile;
	}
	
	public ParserRule getFileRule() {
		return getFileAccess().getRule();
	}
	
	//TYPE_DIR_FILE:
	//	Directory | File;
	public TYPE_DIR_FILEElements getTYPE_DIR_FILEAccess() {
		return pTYPE_DIR_FILE;
	}
	
	public ParserRule getTYPE_DIR_FILERule() {
		return getTYPE_DIR_FILEAccess().getRule();
	}
	
	//FirstDirectory:
	//	firstDirectory=Directory;
	public FirstDirectoryElements getFirstDirectoryAccess() {
		return pFirstDirectory;
	}
	
	public ParserRule getFirstDirectoryRule() {
		return getFirstDirectoryAccess().getRule();
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
	//	'/*'->'*/';
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
