/* Generated By:JJTree: Do not edit this line. ASTAttribute.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTAttribute extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTAttribute(int id) {
    super(id);
  }

  public ASTAttribute(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d21e702fed6bbf246f63aac360bc33a6 (do not edit this line) */