/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RulesImpl <em>Rules</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RulesImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRules()
   * @generated
   */
  int RULES = 0;

  /**
   * The feature id for the '<em><b>Rule Fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES__RULE_FRAGMENTS = 0;

  /**
   * The number of structural features of the '<em>Rules</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RuleFragmentsImpl <em>Rule Fragments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RuleFragmentsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRuleFragments()
   * @generated
   */
  int RULE_FRAGMENTS = 1;

  /**
   * The feature id for the '<em><b>Rule Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FRAGMENTS__RULE_NAME = 0;

  /**
   * The feature id for the '<em><b>Rule Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FRAGMENTS__RULE_BODY = 1;

  /**
   * The number of structural features of the '<em>Rule Fragments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FRAGMENTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RuleBodyImpl <em>Rule Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RuleBodyImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRuleBody()
   * @generated
   */
  int RULE_BODY = 2;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_BODY__EVENT = 0;

  /**
   * The feature id for the '<em><b>Sub Event</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_BODY__SUB_EVENT = 1;

  /**
   * The number of structural features of the '<em>Rule Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EventImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 3;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__SYMBOL = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__VALUE = 2;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SubEventImpl <em>Sub Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SubEventImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSubEvent()
   * @generated
   */
  int SUB_EVENT = 4;

  /**
   * The feature id for the '<em><b>Amount Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_EVENT__AMOUNT_EVENT = 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_EVENT__ENTITY = 1;

  /**
   * The number of structural features of the '<em>Sub Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Attribute <em>Attribute</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Attribute
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Symbol <em>Symbol</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Symbol
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Action <em>Action</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Action
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAction()
   * @generated
   */
  int ACTION = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.Entity <em>Entity</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.Entity
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 8;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Rules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rules</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rules
   * @generated
   */
  EClass getRules();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Rules#getRuleFragments <em>Rule Fragments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule Fragments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rules#getRuleFragments()
   * @see #getRules()
   * @generated
   */
  EReference getRules_RuleFragments();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RuleFragments <em>Rule Fragments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Fragments</em>'.
   * @see org.xtext.example.mydsl.myDsl.RuleFragments
   * @generated
   */
  EClass getRuleFragments();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.RuleFragments#getRuleName <em>Rule Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.RuleFragments#getRuleName()
   * @see #getRuleFragments()
   * @generated
   */
  EAttribute getRuleFragments_RuleName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.RuleFragments#getRuleBody <em>Rule Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule Body</em>'.
   * @see org.xtext.example.mydsl.myDsl.RuleFragments#getRuleBody()
   * @see #getRuleFragments()
   * @generated
   */
  EReference getRuleFragments_RuleBody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RuleBody <em>Rule Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Body</em>'.
   * @see org.xtext.example.mydsl.myDsl.RuleBody
   * @generated
   */
  EClass getRuleBody();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.RuleBody#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.xtext.example.mydsl.myDsl.RuleBody#getEvent()
   * @see #getRuleBody()
   * @generated
   */
  EReference getRuleBody_Event();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.RuleBody#getSubEvent <em>Sub Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Event</em>'.
   * @see org.xtext.example.mydsl.myDsl.RuleBody#getSubEvent()
   * @see #getRuleBody()
   * @generated
   */
  EReference getRuleBody_SubEvent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.example.mydsl.myDsl.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Event#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see org.xtext.example.mydsl.myDsl.Event#getAttribute()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Attribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Event#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol</em>'.
   * @see org.xtext.example.mydsl.myDsl.Event#getSymbol()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Symbol();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Event#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.Event#getValue()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.SubEvent <em>Sub Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Event</em>'.
   * @see org.xtext.example.mydsl.myDsl.SubEvent
   * @generated
   */
  EClass getSubEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.SubEvent#getAmountEvent <em>Amount Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount Event</em>'.
   * @see org.xtext.example.mydsl.myDsl.SubEvent#getAmountEvent()
   * @see #getSubEvent()
   * @generated
   */
  EAttribute getSubEvent_AmountEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.SubEvent#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entity</em>'.
   * @see org.xtext.example.mydsl.myDsl.SubEvent#getEntity()
   * @see #getSubEvent()
   * @generated
   */
  EAttribute getSubEvent_Entity();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute</em>'.
   * @see org.xtext.example.mydsl.myDsl.Attribute
   * @generated
   */
  EEnum getAttribute();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Symbol</em>'.
   * @see org.xtext.example.mydsl.myDsl.Symbol
   * @generated
   */
  EEnum getSymbol();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Action</em>'.
   * @see org.xtext.example.mydsl.myDsl.Action
   * @generated
   */
  EEnum getAction();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Entity</em>'.
   * @see org.xtext.example.mydsl.myDsl.Entity
   * @generated
   */
  EEnum getEntity();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RulesImpl <em>Rules</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RulesImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRules()
     * @generated
     */
    EClass RULES = eINSTANCE.getRules();

    /**
     * The meta object literal for the '<em><b>Rule Fragments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULES__RULE_FRAGMENTS = eINSTANCE.getRules_RuleFragments();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RuleFragmentsImpl <em>Rule Fragments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RuleFragmentsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRuleFragments()
     * @generated
     */
    EClass RULE_FRAGMENTS = eINSTANCE.getRuleFragments();

    /**
     * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_FRAGMENTS__RULE_NAME = eINSTANCE.getRuleFragments_RuleName();

    /**
     * The meta object literal for the '<em><b>Rule Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_FRAGMENTS__RULE_BODY = eINSTANCE.getRuleFragments_RuleBody();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RuleBodyImpl <em>Rule Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RuleBodyImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRuleBody()
     * @generated
     */
    EClass RULE_BODY = eINSTANCE.getRuleBody();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_BODY__EVENT = eINSTANCE.getRuleBody_Event();

    /**
     * The meta object literal for the '<em><b>Sub Event</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_BODY__SUB_EVENT = eINSTANCE.getRuleBody_SubEvent();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EventImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__ATTRIBUTE = eINSTANCE.getEvent_Attribute();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__SYMBOL = eINSTANCE.getEvent_Symbol();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__VALUE = eINSTANCE.getEvent_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SubEventImpl <em>Sub Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SubEventImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSubEvent()
     * @generated
     */
    EClass SUB_EVENT = eINSTANCE.getSubEvent();

    /**
     * The meta object literal for the '<em><b>Amount Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_EVENT__AMOUNT_EVENT = eINSTANCE.getSubEvent_AmountEvent();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_EVENT__ENTITY = eINSTANCE.getSubEvent_Entity();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.Attribute <em>Attribute</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.Attribute
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAttribute()
     * @generated
     */
    EEnum ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.Symbol <em>Symbol</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.Symbol
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSymbol()
     * @generated
     */
    EEnum SYMBOL = eINSTANCE.getSymbol();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.Action <em>Action</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.Action
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAction()
     * @generated
     */
    EEnum ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.Entity <em>Entity</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.Entity
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEntity()
     * @generated
     */
    EEnum ENTITY = eINSTANCE.getEntity();

  }

} //MyDslPackage
