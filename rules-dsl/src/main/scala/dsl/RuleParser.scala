package dsl

import dsl.AST._

import scala.util.parsing.combinator.{JavaTokenParsers, PackratParsers}
import scala.util.parsing.input.CharSequenceReader

/**
  * @author Mukut.
  */
object RuleParser extends JavaTokenParsers with PackratParsers{

  lazy val rule: Parser[ Rule ] =
    ("rule" ~> ruleName) ~ ("{" ~> ruleBody <~ "}") ^^ {
      case (ruleName ~ ruleBody) => Rule(ruleName, ruleBody)
    }

  lazy val ruleBody : Parser [ RuleBody ] =
    condition ~ rep(action) ^^ {
      case (conditionStatement ~ actionStatements) => RuleBody(conditionStatement, actionStatements)
    }

  lazy val condition : Parser[ Condition ] =
    ("when" ~> payer) ~ anyString  ^^ {
      case (payer ~ conditionalExpression) => Condition(payer, conditionalExpression)
    }

  lazy val action : Parser [Action] =
    ("then" ~> actionVerb) ~ amount ~ ("to" ~> payee) ^^ {
      case (actionVerb ~ amount ~ payee) => Action(actionVerb,amount,payee)
    }

  lazy val ruleName: Parser[ String ] =
    ident ^^ { case ruleName => ruleName }

  lazy val actionVerb = "transfer"|"request" ^^ (_.toString)

  lazy val payee: Parser[ Payee ] =
    ident ^^ { case payee => Payee(payee) }

  lazy val payer: Parser[ Payer ] =
    ident ^^ { case payer => Payer(payer) }

  lazy val amount = decimalNumber ^^ (_.toDouble)

  lazy val conditionalOperator = ">"|"<" ^^ {_.toString}

  def parseSubstring[ T ](parser: Parser[ T ], input: String): ParseResult[ T ] = {
    parse(parser, new PackratReader(new CharSequenceReader(input)))
  }

  def anyString = ".+".r
}
