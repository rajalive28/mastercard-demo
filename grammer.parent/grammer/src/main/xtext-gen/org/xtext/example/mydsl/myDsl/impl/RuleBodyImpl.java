/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PayerEvent;
import org.xtext.example.mydsl.myDsl.RuleBody;
import org.xtext.example.mydsl.myDsl.SubEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RuleBodyImpl#getPayerEvent <em>Payer Event</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RuleBodyImpl#getSubEvent <em>Sub Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleBodyImpl extends MinimalEObjectImpl.Container implements RuleBody
{
  /**
   * The cached value of the '{@link #getPayerEvent() <em>Payer Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPayerEvent()
   * @generated
   * @ordered
   */
  protected PayerEvent payerEvent;

  /**
   * The cached value of the '{@link #getSubEvent() <em>Sub Event</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubEvent()
   * @generated
   * @ordered
   */
  protected EList<SubEvent> subEvent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleBodyImpl()
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
    return MyDslPackage.Literals.RULE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PayerEvent getPayerEvent()
  {
    return payerEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPayerEvent(PayerEvent newPayerEvent, NotificationChain msgs)
  {
    PayerEvent oldPayerEvent = payerEvent;
    payerEvent = newPayerEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RULE_BODY__PAYER_EVENT, oldPayerEvent, newPayerEvent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPayerEvent(PayerEvent newPayerEvent)
  {
    if (newPayerEvent != payerEvent)
    {
      NotificationChain msgs = null;
      if (payerEvent != null)
        msgs = ((InternalEObject)payerEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RULE_BODY__PAYER_EVENT, null, msgs);
      if (newPayerEvent != null)
        msgs = ((InternalEObject)newPayerEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RULE_BODY__PAYER_EVENT, null, msgs);
      msgs = basicSetPayerEvent(newPayerEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RULE_BODY__PAYER_EVENT, newPayerEvent, newPayerEvent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubEvent> getSubEvent()
  {
    if (subEvent == null)
    {
      subEvent = new EObjectContainmentEList<SubEvent>(SubEvent.class, this, MyDslPackage.RULE_BODY__SUB_EVENT);
    }
    return subEvent;
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
      case MyDslPackage.RULE_BODY__PAYER_EVENT:
        return basicSetPayerEvent(null, msgs);
      case MyDslPackage.RULE_BODY__SUB_EVENT:
        return ((InternalEList<?>)getSubEvent()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.RULE_BODY__PAYER_EVENT:
        return getPayerEvent();
      case MyDslPackage.RULE_BODY__SUB_EVENT:
        return getSubEvent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.RULE_BODY__PAYER_EVENT:
        setPayerEvent((PayerEvent)newValue);
        return;
      case MyDslPackage.RULE_BODY__SUB_EVENT:
        getSubEvent().clear();
        getSubEvent().addAll((Collection<? extends SubEvent>)newValue);
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
      case MyDslPackage.RULE_BODY__PAYER_EVENT:
        setPayerEvent((PayerEvent)null);
        return;
      case MyDslPackage.RULE_BODY__SUB_EVENT:
        getSubEvent().clear();
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
      case MyDslPackage.RULE_BODY__PAYER_EVENT:
        return payerEvent != null;
      case MyDslPackage.RULE_BODY__SUB_EVENT:
        return subEvent != null && !subEvent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RuleBodyImpl
