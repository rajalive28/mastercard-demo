import dsl.IOTScenarioRuleParser
import org.scalatest.FlatSpec

/**
  * @author Mukut.
  */
class IOTScenarioRuleParserSpec extends FlatSpec {

  var parser = IOTScenarioRuleParser

  "A valid rule " should "be parseable" in {

    val testRule =
      """rule my_rule {
        |      when temperature > 300
        |      then TURN OFF LIGHT
        |	}
      """.stripMargin
    assert(parser.parseSubstring(parser.rule, testRule).successful === true)
    println("rule name: " + parser.parseSubstring(parser.rule, testRule).get.ruleName)
    println("rule body: " + parser.parseSubstring(parser.rule, testRule).get.ruleBody)
  }

  "A valid rule body" should "be parseable" in {

    val testRule =
      """when temperature > 300
        |      then TURN ON FAN
      """.stripMargin
    assert(parser.parseSubstring(parser.ruleBody, testRule).successful === true)
    println("condition string: " + parser.parseSubstring(parser.ruleBody, testRule).get.condition.conditionalExpressionString)
    println("action string: " + parser.parseSubstring(parser.ruleBody, testRule).get.action.actionVerb)
    println("action entity: " + parser.parseSubstring(parser.ruleBody, testRule).get.action.entity)
  }
}
