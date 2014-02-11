/**
 */
package net.certware.intent.intentSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.intentSpecification.Decomposition#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.Decomposition#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.Decomposition#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.Decomposition#getDocuments <em>Documents</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.Decomposition#getModels <em>Models</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.Decomposition#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDecomposition()
 * @model
 * @generated
 */
public interface Decomposition extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDecomposition_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.Decomposition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDecomposition_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.Decomposition#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(String)
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDecomposition_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link net.certware.intent.intentSpecification.Decomposition#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.intentSpecification.Document}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documents</em>' containment reference list.
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDecomposition_Documents()
   * @model containment="true"
   * @generated
   */
  EList<Document> getDocuments();

  /**
   * Returns the value of the '<em><b>Models</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.intentSpecification.ModelItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' containment reference list.
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDecomposition_Models()
   * @model containment="true"
   * @generated
   */
  EList<ModelItem> getModels();

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.intentSpecification.ListItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#getDecomposition_Items()
   * @model containment="true"
   * @generated
   */
  EList<ListItem> getItems();

} // Decomposition
