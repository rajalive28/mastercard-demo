/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RuleBody#getPayerEvent <em>Payer Event</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RuleBody#getSubEvent <em>Sub Event</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRuleBody()
 * @model
 * @generated
 */
public interface RuleBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Payer Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Payer Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Payer Event</em>' containment reference.
   * @see #setPayerEvent(PayerEvent)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRuleBody_PayerEvent()
   * @model containment="true"
   * @generated
   */
  PayerEvent getPayerEvent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RuleBody#getPayerEvent <em>Payer Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Payer Event</em>' containment reference.
   * @see #getPayerEvent()
   * @generated
   */
  void setPayerEvent(PayerEvent value);

  /**
   * Returns the value of the '<em><b>Sub Event</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.SubEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Event</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Event</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRuleBody_SubEvent()
   * @model containment="true"
   * @generated
   */
  EList<SubEvent> getSubEvent();

} // RuleBody
