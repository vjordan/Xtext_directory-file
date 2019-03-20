/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.dirFile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.dirFile.DirFilePackage;
import org.xtext.example.dirFile.Directory;
import org.xtext.example.dirFile.TYPE_DIR_FILE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dirFile.impl.DirectoryImpl#getTree <em>Tree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectoryImpl extends TYPE_DIR_FILEImpl implements Directory
{
  /**
   * The cached value of the '{@link #getTree() <em>Tree</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTree()
   * @generated
   * @ordered
   */
  protected EList<TYPE_DIR_FILE> tree;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectoryImpl()
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
    return DirFilePackage.Literals.DIRECTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TYPE_DIR_FILE> getTree()
  {
    if (tree == null)
    {
      tree = new EObjectContainmentEList<TYPE_DIR_FILE>(TYPE_DIR_FILE.class, this, DirFilePackage.DIRECTORY__TREE);
    }
    return tree;
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
      case DirFilePackage.DIRECTORY__TREE:
        return ((InternalEList<?>)getTree()).basicRemove(otherEnd, msgs);
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
      case DirFilePackage.DIRECTORY__TREE:
        return getTree();
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
      case DirFilePackage.DIRECTORY__TREE:
        getTree().clear();
        getTree().addAll((Collection<? extends TYPE_DIR_FILE>)newValue);
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
      case DirFilePackage.DIRECTORY__TREE:
        getTree().clear();
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
      case DirFilePackage.DIRECTORY__TREE:
        return tree != null && !tree.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DirectoryImpl
