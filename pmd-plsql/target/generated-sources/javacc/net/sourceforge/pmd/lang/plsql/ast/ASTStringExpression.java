/* Generated By:JJTree: Do not edit this line. ASTStringExpression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTStringExpression extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTStringExpression(int id) {
    super(id);
  }

  public ASTStringExpression(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=be7cd9aa9ae109ef72ffb383a048bc52 (do not edit this line) */
