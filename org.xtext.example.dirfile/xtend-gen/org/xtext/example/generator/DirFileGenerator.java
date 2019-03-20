/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.dirFile.Directory;
import org.xtext.example.dirFile.File;
import org.xtext.example.dirFile.FirstDirectory;
import org.xtext.example.dirFile.TYPE_DIR_FILE;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DirFileGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<FirstDirectory> _filter = Iterables.<FirstDirectory>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), FirstDirectory.class);
    for (final FirstDirectory t : _filter) {
      fsa.generateFile("Main.java", this.compile(t));
    }
  }
  
  public CharSequence compile(final FirstDirectory fd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import java.io.File;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public class Main {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public static void main(String[] args){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("System.out.println(\"Test\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("File directory;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("File file;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("directory = new File(\"");
    String _name = fd.getFirstDirectory().getName();
    _builder.append(_name, "\t\t\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    Object _compile = this.compile(fd);
    _builder.append(_compile, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public Object compile(final Directory d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Directory\");");
    _builder.newLine();
    {
      EList<TYPE_DIR_FILE> _tree = d.getTree();
      for(final TYPE_DIR_FILE tree : _tree) {
        {
          if ((tree instanceof File)) {
            CharSequence _compile = this.compile(((File)tree));
            _builder.append(_compile);
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("file=new File(\"");
            String _name = d.getName();
            _builder.append(_name);
            _builder.append("\" + File.separator + \"");
            String _name_1 = tree.getName();
            _builder.append(_name_1);
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("file.mkdir();");
            _builder.newLine();
            Object _compile_1 = this.compile(d);
            _builder.append(_compile_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final File f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"File\");");
    _builder.newLine();
    _builder.append("file = new File(directory.getPath() + File.separator + \"");
    String _name = f.getName();
    _builder.append(_name);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("file.createNewFile();");
    _builder.newLine();
    return _builder;
  }
}
