/* Generated By:JJTree: Do not edit this line. ASTDDLEvent.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTDDLEvent extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTDDLEvent(int id) {
    super(id);
  }

  public ASTDDLEvent(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6651615b6c6ab1222293f8218e9a7868 (do not edit this line) */