/* Generated By:JJTree: Do not edit this line. ASTWrappedObject.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTWrappedObject extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTWrappedObject(int id) {
    super(id);
  }

  public ASTWrappedObject(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=849837ab837426cec500a9e77a874244 (do not edit this line) */
