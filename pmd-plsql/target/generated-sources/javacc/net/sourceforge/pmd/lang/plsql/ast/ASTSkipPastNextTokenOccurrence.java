/* Generated By:JJTree: Do not edit this line. ASTSkipPastNextTokenOccurrence.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTSkipPastNextTokenOccurrence extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
  public ASTSkipPastNextTokenOccurrence(int id) {
    super(id);
  }

  public ASTSkipPastNextTokenOccurrence(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=32327beb539d64b3f32ebbd86aebfd07 (do not edit this line) */
