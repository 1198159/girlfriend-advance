package com.lemoulinstudio.gfa.nb.breakpoint;

public class IntNot extends IntExpr {

  protected IntExpr expr;

  public IntNot(IntExpr expr) {
    super(new ScmExpr[]{expr});
    this.expr = expr;
  }

  public int evaluation() {
    return ~expr.evaluation();
  }
}
