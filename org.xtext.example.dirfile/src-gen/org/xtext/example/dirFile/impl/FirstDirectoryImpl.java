/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.dirFile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.dirFile.DirFilePackage;
import org.xtext.example.dirFile.Directory;
import org.xtext.example.dirFile.FirstDirectory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dirFile.impl.FirstDirectoryImpl#getFirstDirectory <em>First Directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirstDirectoryImpl extends MinimalEObjectImpl.Container implements FirstDirectory
{
  /**
   * The cached value of the '{@link #getFirstDirectory() <em>First Directory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstDirectory()
   * @generated
   * @ordered
   */
  protected Directory firstDirectory;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FirstDirectoryImpl()
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
    return DirFilePackage.Literals.FIRST_DIRECTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directory getFirstDirectory()
  {
    return firstDirectory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstDirectory(Directory newFirstDirectory, NotificationChain msgs)
  {
    Directory oldFirstDirectory = firstDirectory;
    firstDirectory = newFirstDirectory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DirFilePackage.FIRST_DIRECTORY__FIRST_DIRECTORY, oldFirstDirectory, newFirstDirectory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstDirectory(Directory newFirstDirectory)
  {
    if (newFirstDirectory != firstDirectory)
    {
      NotificationChain msgs = null;
      if (firstDirectory != null)
        msgs = ((InternalEObject)firstDirectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DirFilePackage.FIRST_DIRECTORY__FIRST_DIRECTORY, null, msgs);
      if (newFirstDirectory != null)
        msgs = ((InternalEObject)newFirstDirectory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DirFilePackage.FIRST_DIRECTORY__FIRST_DIRECTORY, null, msgs);
      msgs = basicSetFirstDirectory(newFirstDirectory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DirFilePackage.FIRST_DIRECTORY__FIRST_DIRECTORY, newFirstDirectory, newFirstDirectory));
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
      case DirFilePackage.FIRST_DIRECTORY__FIRST_DIRECTORY:
        return basicSetFirstDirectory(null, msgs);
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
      case DirFilePackage.FIRST_DIRECTORY__FIRST_DIRECTORY:
        return getFirstDirectory();
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
      case DirFilePackage.FIRST_DIRECTORY__FIRST_DIRECTORY:
        setFirstDirectory((Directory)newValue);
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
      case DirFilePackage.FIRST_DIRECTORY__FIRST_DIRECTORY:
        setFirstDirectory((Directory)null);
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
      case DirFilePackage.FIRST_DIRECTORY__FIRST_DIRECTORY:
        return firstDirectory != null;
    }
    return super.eIsSet(featureID);
  }

} //FirstDirectoryImpl