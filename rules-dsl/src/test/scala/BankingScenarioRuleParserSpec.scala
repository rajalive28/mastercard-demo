import dsl.BankingScenarioRuleParser
import org.scalatest.FlatSpec

/**
  * @author Mukut.
  */
class BankingScenarioRuleParserSpec extends FlatSpec{

  var parser = BankingScenarioRuleParser

  "A valid rule " should "be parseable" in {

    val testRule=
      """rule my_sample_rule {
         |when Antony credit > 20000
         |then transfer 3000 to Abhishek
         |}
      """.stripMargin
    assert(parser.parseSubstring(parser.rule,testRule).successful === true)
    println("rule name: " + parser.parseSubstring(parser.rule, testRule).get.ruleName)
    println("rule body: " + parser.parseSubstring(parser.rule, testRule).get.ruleBody)
  }

  "A valid rule body" should "be parseable" in {

    val testRule=
      """when mindtree credits > 300000
        |      then transfer 3000 to abhishek
        |      then transfer 3000 to mukut
      """.stripMargin
    assert(parser.parseSubstring(parser.ruleBody,testRule).successful === true)
    println("action count: " + parser.parseSubstring(parser.ruleBody, testRule).get.actions.size)
    assert(parser.parseSubstring(parser.ruleBody,testRule).get.actions.size === 2)

  }

  "A valid condition " should "be parseable" in {

    val testCond=
      """when mindtree credits > 300000""".stripMargin
    assert(parser.parseSubstring(parser.condition,testCond).successful === true)
    println("----------------------------------------------------")
    println("payer: " + parser.parseSubstring(parser.condition, testCond).get.payer.name)
    println("conditional expression string: " + parser.parseSubstring(parser.condition, testCond).get.conditionalExpressionString)
    println("----------------------------------------------------")
  }

  "A valid action " should "be parseable" in {

    val testCond=
      """then transfer 3000 to abhishek""".stripMargin
    assert(parser.parseSubstring(parser.action,testCond).successful === true)
    println("----------------------------------------------------")
    println("action verb: " + parser.parseSubstring(parser.action, testCond).get.actionVerb)
    println("payee: " + parser.parseSubstring(parser.action, testCond).get.payee.name)
    println("amount: " + parser.parseSubstring(parser.action, testCond).get.amount)
    println("----------------------------------------------------")

  }

  "A valid payee " should "be parseable" in {

    val testCond=
      """mindtree""".stripMargin
    assert(parser.parseSubstring(parser.payee,testCond).successful === true)
    println("payee: " + parser.parseSubstring(parser.payee, testCond).get.name)
  }

  "A valid payer " should "be parseable" in {

    val testCond=
      """mukut""".stripMargin
    assert(parser.parseSubstring(parser.payer,testCond).successful === true)
    println("payer: " + parser.parseSubstring(parser.payer, testCond).get.name)

  }

  "A valid conditional gt operator " should "be parseable" in {

    val testCond=
      """>""".stripMargin
    assert(parser.parseSubstring(parser.conditionalOperator,testCond).successful === true)
    println("conditional gt operator: " + parser.parseSubstring(parser.conditionalOperator, testCond).get)

  }

  "A valid conditional lt operator " should "be parseable" in {

    val testCond=
      """<""".stripMargin
    assert(parser.parseSubstring(parser.conditionalOperator,testCond).successful === true)
    println("conditional lt operator: " + parser.parseSubstring(parser.conditionalOperator, testCond).get)
  }

  "A valid transfer action verb " should "be parseable" in {

    val testCond=
      """transfer""".stripMargin
    assert(parser.parseSubstring(parser.payer,testCond).successful === true)
    println("transfer action verb: " + parser.parseSubstring(parser.actionVerb, testCond).get)

  }

  "A valid request action verb " should "be parseable" in {

    val testCond=
      """request""".stripMargin
    assert(parser.parseSubstring(parser.payer,testCond).successful === true)
    println("request action verb: " + parser.parseSubstring(parser.actionVerb, testCond).get)

  }

}
