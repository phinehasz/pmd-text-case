/* Generated By:JJTree: Do not edit this line. ASTFetchStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTFetchStatement extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTFetchStatement(int id) {
    super(id);
  }

  public ASTFetchStatement(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=21460142c066935e7922d1df0416d9ce (do not edit this line) */
