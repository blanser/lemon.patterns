package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public abstract class Pattern implements java.io.Serializable {
  public abstract <R,A> R accept(Pattern.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(net.lemonmodel.patterns.parser.Absyn.EPatternWithForm p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.ENoun p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.ENounWithGender p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EVerb p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EAdjective p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EAdjectiveJa p, A arg);

  }

}
