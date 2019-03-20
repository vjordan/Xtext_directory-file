/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.dirFile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.dirFile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DirFileFactoryImpl extends EFactoryImpl implements DirFileFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DirFileFactory init()
  {
    try
    {
      DirFileFactory theDirFileFactory = (DirFileFactory)EPackage.Registry.INSTANCE.getEFactory(DirFilePackage.eNS_URI);
      if (theDirFileFactory != null)
      {
        return theDirFileFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DirFileFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirFileFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DirFilePackage.DIRECTORY: return createDirectory();
      case DirFilePackage.FILE: return createFile();
      case DirFilePackage.TYPE_DIR_FILE: return createTYPE_DIR_FILE();
      case DirFilePackage.FIRST_DIRECTORY: return createFirstDirectory();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directory createDirectory()
  {
    DirectoryImpl directory = new DirectoryImpl();
    return directory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TYPE_DIR_FILE createTYPE_DIR_FILE()
  {
    TYPE_DIR_FILEImpl typE_DIR_FILE = new TYPE_DIR_FILEImpl();
    return typE_DIR_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FirstDirectory createFirstDirectory()
  {
    FirstDirectoryImpl firstDirectory = new FirstDirectoryImpl();
    return firstDirectory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirFilePackage getDirFilePackage()
  {
    return (DirFilePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DirFilePackage getPackage()
  {
    return DirFilePackage.eINSTANCE;
  }

} //DirFileFactoryImpl
