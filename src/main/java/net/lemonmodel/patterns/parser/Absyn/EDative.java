package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public class EDative extends Category {

  public EDative() { }

  public <R,A> R accept(net.lemonmodel.patterns.parser.Absyn.Category.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof net.lemonmodel.patterns.parser.Absyn.EDative) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
