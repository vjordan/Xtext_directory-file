/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.ide.contentassist.antlr.internal.InternalDirFileParser;
import org.xtext.example.services.DirFileGrammarAccess;

public class DirFileParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DirFileGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DirFileGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTYPE_DIR_FILEAccess().getAlternatives(), "rule__TYPE_DIR_FILE__Alternatives");
			builder.put(grammarAccess.getDirectoryAccess().getGroup(), "rule__Directory__Group__0");
			builder.put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
			builder.put(grammarAccess.getDirectoryAccess().getNameAssignment_1(), "rule__Directory__NameAssignment_1");
			builder.put(grammarAccess.getDirectoryAccess().getTreeAssignment_2(), "rule__Directory__TreeAssignment_2");
			builder.put(grammarAccess.getFileAccess().getNameAssignment_1(), "rule__File__NameAssignment_1");
			builder.put(grammarAccess.getFirstDirectoryAccess().getFirstDirectoryAssignment(), "rule__FirstDirectory__FirstDirectoryAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DirFileGrammarAccess grammarAccess;

	@Override
	protected InternalDirFileParser createParser() {
		InternalDirFileParser result = new InternalDirFileParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DirFileGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DirFileGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
