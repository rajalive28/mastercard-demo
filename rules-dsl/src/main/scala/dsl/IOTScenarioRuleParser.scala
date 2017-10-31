package dsl

import dsl.IOTSecnarioAST._

import scala.util.parsing.combinator.{JavaTokenParsers, PackratParsers}
import scala.util.parsing.input.CharSequenceReader

/**
  * @author Mukut.
  */
object IOTScenarioRuleParser extends JavaTokenParsers with PackratParsers{

  lazy val rule: Parser[ Rule ] =
    ("rule" ~> ruleName) ~ ("{" ~> ruleBody <~ "}") ^^ {
      case (ruleName ~ ruleBody) => Rule(ruleName, ruleBody)
    }

  lazy val ruleBody : Parser [ RuleBody ] =
    condition ~ action ^^ {
      case (conditionStatement ~ actionStatements) => RuleBody(conditionStatement, actionStatements)
    }

  lazy val condition : Parser[ Condition ] =
    "when" ~> anyString  ^^ {
      case (conditionalExpression) => Condition(conditionalExpression)
    }

  lazy val action : Parser [Action] =
    "then" ~> actionVerb ~ entity ^^ {
      case (actionVerb ~ entity) => Action(actionVerb, entity)
    }
  lazy val actionVerb = "TURN ON"|"TURN OFF" ^^ (_.toString)

  lazy val ruleName: Parser[ String ] =
    ident ^^ { case ruleName => ruleName }

  lazy val entity: Parser[ String ] =
    ident ^^ { case entity => entity }

  def parseSubstring[ T ](parser: Parser[ T ], input: String): ParseResult[ T ] = {
    parse(parser, new PackratReader(new CharSequenceReader(input)))
  }

  def anyString = ".+".r

}
