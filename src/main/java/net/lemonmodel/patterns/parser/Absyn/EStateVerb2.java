package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public class EStateVerb2 extends VerbPattern {
  public final VP vp_;
  public final URI uri_;
  public final Arg arg_;

  public EStateVerb2(VP p1, URI p2, Arg p3) { vp_ = p1; uri_ = p2; arg_ = p3; }

  public <R,A> R accept(net.lemonmodel.patterns.parser.Absyn.VerbPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof net.lemonmodel.patterns.parser.Absyn.EStateVerb2) {
      net.lemonmodel.patterns.parser.Absyn.EStateVerb2 x = (net.lemonmodel.patterns.parser.Absyn.EStateVerb2)o;
      return this.vp_.equals(x.vp_) && this.uri_.equals(x.uri_) && this.arg_.equals(x.arg_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.vp_.hashCode())+this.uri_.hashCode())+this.arg_.hashCode();
  }


}
