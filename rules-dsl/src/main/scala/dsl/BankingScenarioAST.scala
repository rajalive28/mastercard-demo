package dsl

/**
  * @author Mukut.
  */
object BankingScenarioAST {

  sealed trait Expr

  case class Rule(ruleName:String, ruleBody: RuleBody) extends Expr

  case class RuleBody(condition: Condition, actions: Seq[Action]) extends Expr

  case class Condition(payer: Payer, conditionalExpressionString:String) extends Expr

  case class Action(actionVerb:String, amount: Double, payee: Payee) extends Expr

  case class Payer(name: String) extends Expr

  case class Payee(name: String) extends Expr

}
