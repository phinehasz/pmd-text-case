/* Generated By:JJTree: Do not edit this line. ASTConditionalCompilationStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTConditionalCompilationStatement extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTConditionalCompilationStatement(int id) {
    super(id);
  }

  public ASTConditionalCompilationStatement(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=43fc60928b1d8d2b4e164a184eedbb8c (do not edit this line) */