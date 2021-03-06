package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public class EPNPComplex extends PNP {
  public final ListPOSTaggedWord listpostaggedword_;

  public EPNPComplex(ListPOSTaggedWord p1) { listpostaggedword_ = p1; }

  public <R,A> R accept(net.lemonmodel.patterns.parser.Absyn.PNP.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof net.lemonmodel.patterns.parser.Absyn.EPNPComplex) {
      net.lemonmodel.patterns.parser.Absyn.EPNPComplex x = (net.lemonmodel.patterns.parser.Absyn.EPNPComplex)o;
      return this.listpostaggedword_.equals(x.listpostaggedword_);
    }
    return false;
  }

  public int hashCode() {
    return this.listpostaggedword_.hashCode();
  }


}
