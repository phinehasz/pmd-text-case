/* Generated By:JJTree: Do not edit this line. ASTViewColumn.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTViewColumn extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTViewColumn(int id) {
    super(id);
  }

  public ASTViewColumn(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=47512172f47c6292ffc7a0b8209d6fa7 (do not edit this line) */
