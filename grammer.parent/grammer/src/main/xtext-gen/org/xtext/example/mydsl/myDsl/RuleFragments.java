/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Fragments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RuleFragments#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RuleFragments#getRuleBody <em>Rule Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRuleFragments()
 * @model
 * @generated
 */
public interface RuleFragments extends EObject
{
  /**
   * Returns the value of the '<em><b>Rule Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Name</em>' attribute.
   * @see #setRuleName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRuleFragments_RuleName()
   * @model
   * @generated
   */
  String getRuleName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RuleFragments#getRuleName <em>Rule Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Name</em>' attribute.
   * @see #getRuleName()
   * @generated
   */
  void setRuleName(String value);

  /**
   * Returns the value of the '<em><b>Rule Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Body</em>' containment reference.
   * @see #setRuleBody(RuleBody)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRuleFragments_RuleBody()
   * @model containment="true"
   * @generated
   */
  RuleBody getRuleBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RuleFragments#getRuleBody <em>Rule Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Body</em>' containment reference.
   * @see #getRuleBody()
   * @generated
   */
  void setRuleBody(RuleBody value);

} // RuleFragments
