package com.lemoulinstudio.gfa.nb.breakpoint;

public class BoolNot extends BoolExpr {

  protected BoolExpr expr;

  public BoolNot(BoolExpr expr) {
    super(new ScmExpr[]{expr});
    this.expr = expr;
  }

  public boolean evaluation() {
    return !expr.evaluation();
  }
}
