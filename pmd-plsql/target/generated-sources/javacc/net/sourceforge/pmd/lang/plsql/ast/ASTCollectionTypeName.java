/* Generated By:JJTree: Do not edit this line. ASTCollectionTypeName.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTCollectionTypeName extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTCollectionTypeName(int id) {
    super(id);
  }

  public ASTCollectionTypeName(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=bc422dcbccb5044b27e2454895666b31 (do not edit this line) */