/* Generated By:JJTree: Do not edit this line. ASTQualifiedID.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTQualifiedID extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTQualifiedID(int id) {
    super(id);
  }

  public ASTQualifiedID(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=5eceeaa046db28931161e540b2984455 (do not edit this line) */
