/* Generated By:JJTree: Do not edit this line. ASTprocess.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.vm.ast;

public
class ASTprocess extends net.sourceforge.pmd.lang.vm.ast.AbstractVmNode {
  public ASTprocess(int id) {
    super(id);
  }

  public ASTprocess(VmParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(VmParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=442cb29b1df96016a19dc33b7721b2bf (do not edit this line) */
