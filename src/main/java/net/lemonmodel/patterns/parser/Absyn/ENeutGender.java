package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public class ENeutGender extends Gender {

  public ENeutGender() { }

  public <R,A> R accept(net.lemonmodel.patterns.parser.Absyn.Gender.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof net.lemonmodel.patterns.parser.Absyn.ENeutGender) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
