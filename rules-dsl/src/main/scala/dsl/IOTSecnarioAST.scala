package dsl

/**
  * @author Mukut.
  */
object IOTSecnarioAST {

  sealed trait Expr

  case class Rule(ruleName:String, ruleBody: RuleBody) extends Expr

  case class RuleBody(condition: Condition, action: Action) extends Expr

  case class Condition(conditionalExpressionString:String) extends Expr

  case class Action(actionVerb:String, entity:String) extends Expr

}
