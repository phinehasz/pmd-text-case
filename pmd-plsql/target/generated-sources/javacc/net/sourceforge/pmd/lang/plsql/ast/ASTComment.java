/* Generated By:JJTree: Do not edit this line. ASTComment.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTComment extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTComment(int id) {
    super(id);
  }

  public ASTComment(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e83e071242ffa17d879f2512d4cdd161 (do not edit this line) */