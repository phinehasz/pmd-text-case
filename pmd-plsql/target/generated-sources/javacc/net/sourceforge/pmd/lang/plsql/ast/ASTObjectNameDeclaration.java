/* Generated By:JJTree: Do not edit this line. ASTObjectNameDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTObjectNameDeclaration extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTObjectNameDeclaration(int id) {
    super(id);
  }

  public ASTObjectNameDeclaration(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1e4801e65c15bd7759e1265f99e7051f (do not edit this line) */