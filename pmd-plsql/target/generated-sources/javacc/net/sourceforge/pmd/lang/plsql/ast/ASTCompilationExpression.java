/* Generated By:JJTree: Do not edit this line. ASTCompilationExpression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTCompilationExpression extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTCompilationExpression(int id) {
    super(id);
  }

  public ASTCompilationExpression(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=42cfb7b5039142c66fa11418d2f2f6b1 (do not edit this line) */
