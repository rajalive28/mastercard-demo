/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PayerEvent;
import org.xtext.example.mydsl.myDsl.PayerEventName;
import org.xtext.example.mydsl.myDsl.PayerName;
import org.xtext.example.mydsl.myDsl.Symbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payer Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PayerEventImpl#getPayerName <em>Payer Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PayerEventImpl#getPayerEventName <em>Payer Event Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PayerEventImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PayerEventImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PayerEventImpl extends MinimalEObjectImpl.Container implements PayerEvent
{
  /**
   * The default value of the '{@link #getPayerName() <em>Payer Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPayerName()
   * @generated
   * @ordered
   */
  protected static final PayerName PAYER_NAME_EDEFAULT = PayerName.MINDTREE;

  /**
   * The cached value of the '{@link #getPayerName() <em>Payer Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPayerName()
   * @generated
   * @ordered
   */
  protected PayerName payerName = PAYER_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPayerEventName() <em>Payer Event Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPayerEventName()
   * @generated
   * @ordered
   */
  protected static final PayerEventName PAYER_EVENT_NAME_EDEFAULT = PayerEventName.CREDIT;

  /**
   * The cached value of the '{@link #getPayerEventName() <em>Payer Event Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPayerEventName()
   * @generated
   * @ordered
   */
  protected PayerEventName payerEventName = PAYER_EVENT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected static final Symbol SYMBOL_EDEFAULT = Symbol.GREATER;

  /**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected Symbol symbol = SYMBOL_EDEFAULT;

  /**
   * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected static final int AMOUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected int amount = AMOUNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PayerEventImpl()
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
    return MyDslPackage.Literals.PAYER_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PayerName getPayerName()
  {
    return payerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPayerName(PayerName newPayerName)
  {
    PayerName oldPayerName = payerName;
    payerName = newPayerName == null ? PAYER_NAME_EDEFAULT : newPayerName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PAYER_EVENT__PAYER_NAME, oldPayerName, payerName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PayerEventName getPayerEventName()
  {
    return payerEventName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPayerEventName(PayerEventName newPayerEventName)
  {
    PayerEventName oldPayerEventName = payerEventName;
    payerEventName = newPayerEventName == null ? PAYER_EVENT_NAME_EDEFAULT : newPayerEventName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PAYER_EVENT__PAYER_EVENT_NAME, oldPayerEventName, payerEventName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol getSymbol()
  {
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbol(Symbol newSymbol)
  {
    Symbol oldSymbol = symbol;
    symbol = newSymbol == null ? SYMBOL_EDEFAULT : newSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PAYER_EVENT__SYMBOL, oldSymbol, symbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAmount()
  {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmount(int newAmount)
  {
    int oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PAYER_EVENT__AMOUNT, oldAmount, amount));
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
      case MyDslPackage.PAYER_EVENT__PAYER_NAME:
        return getPayerName();
      case MyDslPackage.PAYER_EVENT__PAYER_EVENT_NAME:
        return getPayerEventName();
      case MyDslPackage.PAYER_EVENT__SYMBOL:
        return getSymbol();
      case MyDslPackage.PAYER_EVENT__AMOUNT:
        return getAmount();
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
      case MyDslPackage.PAYER_EVENT__PAYER_NAME:
        setPayerName((PayerName)newValue);
        return;
      case MyDslPackage.PAYER_EVENT__PAYER_EVENT_NAME:
        setPayerEventName((PayerEventName)newValue);
        return;
      case MyDslPackage.PAYER_EVENT__SYMBOL:
        setSymbol((Symbol)newValue);
        return;
      case MyDslPackage.PAYER_EVENT__AMOUNT:
        setAmount((Integer)newValue);
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
      case MyDslPackage.PAYER_EVENT__PAYER_NAME:
        setPayerName(PAYER_NAME_EDEFAULT);
        return;
      case MyDslPackage.PAYER_EVENT__PAYER_EVENT_NAME:
        setPayerEventName(PAYER_EVENT_NAME_EDEFAULT);
        return;
      case MyDslPackage.PAYER_EVENT__SYMBOL:
        setSymbol(SYMBOL_EDEFAULT);
        return;
      case MyDslPackage.PAYER_EVENT__AMOUNT:
        setAmount(AMOUNT_EDEFAULT);
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
      case MyDslPackage.PAYER_EVENT__PAYER_NAME:
        return payerName != PAYER_NAME_EDEFAULT;
      case MyDslPackage.PAYER_EVENT__PAYER_EVENT_NAME:
        return payerEventName != PAYER_EVENT_NAME_EDEFAULT;
      case MyDslPackage.PAYER_EVENT__SYMBOL:
        return symbol != SYMBOL_EDEFAULT;
      case MyDslPackage.PAYER_EVENT__AMOUNT:
        return amount != AMOUNT_EDEFAULT;
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
    result.append(" (payerName: ");
    result.append(payerName);
    result.append(", payerEventName: ");
    result.append(payerEventName);
    result.append(", symbol: ");
    result.append(symbol);
    result.append(", amount: ");
    result.append(amount);
    result.append(')');
    return result.toString();
  }

} //PayerEventImpl
