/* Generated By:JJTree: Do not edit this line. ASTTypeKeyword.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTTypeKeyword extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTTypeKeyword(int id) {
    super(id);
  }

  public ASTTypeKeyword(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1f597fc22e5c780bce231269dedad229 (do not edit this line) */
