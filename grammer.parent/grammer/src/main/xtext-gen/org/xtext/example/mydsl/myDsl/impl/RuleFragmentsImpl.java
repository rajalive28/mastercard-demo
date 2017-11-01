/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.RuleBody;
import org.xtext.example.mydsl.myDsl.RuleFragments;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Fragments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RuleFragmentsImpl#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RuleFragmentsImpl#getRuleBody <em>Rule Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleFragmentsImpl extends MinimalEObjectImpl.Container implements RuleFragments
{
  /**
   * The default value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleName()
   * @generated
   * @ordered
   */
  protected static final String RULE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleName()
   * @generated
   * @ordered
   */
  protected String ruleName = RULE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRuleBody() <em>Rule Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleBody()
   * @generated
   * @ordered
   */
  protected RuleBody ruleBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleFragmentsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.RULE_FRAGMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRuleName()
  {
    return ruleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleName(String newRuleName)
  {
    String oldRuleName = ruleName;
    ruleName = newRuleName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RULE_FRAGMENTS__RULE_NAME, oldRuleName, ruleName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleBody getRuleBody()
  {
    return ruleBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRuleBody(RuleBody newRuleBody, NotificationChain msgs)
  {
    RuleBody oldRuleBody = ruleBody;
    ruleBody = newRuleBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RULE_FRAGMENTS__RULE_BODY, oldRuleBody, newRuleBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleBody(RuleBody newRuleBody)
  {
    if (newRuleBody != ruleBody)
    {
      NotificationChain msgs = null;
      if (ruleBody != null)
        msgs = ((InternalEObject)ruleBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RULE_FRAGMENTS__RULE_BODY, null, msgs);
      if (newRuleBody != null)
        msgs = ((InternalEObject)newRuleBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RULE_FRAGMENTS__RULE_BODY, null, msgs);
      msgs = basicSetRuleBody(newRuleBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RULE_FRAGMENTS__RULE_BODY, newRuleBody, newRuleBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.RULE_FRAGMENTS__RULE_BODY:
        return basicSetRuleBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.RULE_FRAGMENTS__RULE_NAME:
        return getRuleName();
      case MyDslPackage.RULE_FRAGMENTS__RULE_BODY:
        return getRuleBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.RULE_FRAGMENTS__RULE_NAME:
        setRuleName((String)newValue);
        return;
      case MyDslPackage.RULE_FRAGMENTS__RULE_BODY:
        setRuleBody((RuleBody)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RULE_FRAGMENTS__RULE_NAME:
        setRuleName(RULE_NAME_EDEFAULT);
        return;
      case MyDslPackage.RULE_FRAGMENTS__RULE_BODY:
        setRuleBody((RuleBody)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RULE_FRAGMENTS__RULE_NAME:
        return RULE_NAME_EDEFAULT == null ? ruleName != null : !RULE_NAME_EDEFAULT.equals(ruleName);
      case MyDslPackage.RULE_FRAGMENTS__RULE_BODY:
        return ruleBody != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ruleName: ");
    result.append(ruleName);
    result.append(')');
    return result.toString();
  }

} //RuleFragmentsImpl
