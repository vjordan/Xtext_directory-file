/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.dirFile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.xtext.example.dirFile.DirFileFactory
 * @model kind="package"
 * @generated
 */
public interface DirFilePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dirFile";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/DirFile";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dirFile";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DirFilePackage eINSTANCE = org.xtext.example.dirFile.impl.DirFilePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.dirFile.impl.TYPE_DIR_FILEImpl <em>TYPE DIR FILE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.dirFile.impl.TYPE_DIR_FILEImpl
   * @see org.xtext.example.dirFile.impl.DirFilePackageImpl#getTYPE_DIR_FILE()
   * @generated
   */
  int TYPE_DIR_FILE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DIR_FILE__NAME = 0;

  /**
   * The number of structural features of the '<em>TYPE DIR FILE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DIR_FILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.dirFile.impl.DirectoryImpl <em>Directory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.dirFile.impl.DirectoryImpl
   * @see org.xtext.example.dirFile.impl.DirFilePackageImpl#getDirectory()
   * @generated
   */
  int DIRECTORY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTORY__NAME = TYPE_DIR_FILE__NAME;

  /**
   * The feature id for the '<em><b>Tree</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTORY__TREE = TYPE_DIR_FILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Directory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTORY_FEATURE_COUNT = TYPE_DIR_FILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.dirFile.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.dirFile.impl.FileImpl
   * @see org.xtext.example.dirFile.impl.DirFilePackageImpl#getFile()
   * @generated
   */
  int FILE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__NAME = TYPE_DIR_FILE__NAME;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = TYPE_DIR_FILE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.dirFile.impl.FirstDirectoryImpl <em>First Directory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.dirFile.impl.FirstDirectoryImpl
   * @see org.xtext.example.dirFile.impl.DirFilePackageImpl#getFirstDirectory()
   * @generated
   */
  int FIRST_DIRECTORY = 3;

  /**
   * The feature id for the '<em><b>First Directory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_DIRECTORY__FIRST_DIRECTORY = 0;

  /**
   * The number of structural features of the '<em>First Directory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_DIRECTORY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.dirFile.Directory <em>Directory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Directory</em>'.
   * @see org.xtext.example.dirFile.Directory
   * @generated
   */
  EClass getDirectory();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.dirFile.Directory#getTree <em>Tree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tree</em>'.
   * @see org.xtext.example.dirFile.Directory#getTree()
   * @see #getDirectory()
   * @generated
   */
  EReference getDirectory_Tree();

  /**
   * Returns the meta object for class '{@link org.xtext.example.dirFile.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.xtext.example.dirFile.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for class '{@link org.xtext.example.dirFile.TYPE_DIR_FILE <em>TYPE DIR FILE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TYPE DIR FILE</em>'.
   * @see org.xtext.example.dirFile.TYPE_DIR_FILE
   * @generated
   */
  EClass getTYPE_DIR_FILE();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.dirFile.TYPE_DIR_FILE#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.dirFile.TYPE_DIR_FILE#getName()
   * @see #getTYPE_DIR_FILE()
   * @generated
   */
  EAttribute getTYPE_DIR_FILE_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.dirFile.FirstDirectory <em>First Directory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>First Directory</em>'.
   * @see org.xtext.example.dirFile.FirstDirectory
   * @generated
   */
  EClass getFirstDirectory();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.dirFile.FirstDirectory#getFirstDirectory <em>First Directory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Directory</em>'.
   * @see org.xtext.example.dirFile.FirstDirectory#getFirstDirectory()
   * @see #getFirstDirectory()
   * @generated
   */
  EReference getFirstDirectory_FirstDirectory();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DirFileFactory getDirFileFactory();

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
     * The meta object literal for the '{@link org.xtext.example.dirFile.impl.DirectoryImpl <em>Directory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.dirFile.impl.DirectoryImpl
     * @see org.xtext.example.dirFile.impl.DirFilePackageImpl#getDirectory()
     * @generated
     */
    EClass DIRECTORY = eINSTANCE.getDirectory();

    /**
     * The meta object literal for the '<em><b>Tree</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTORY__TREE = eINSTANCE.getDirectory_Tree();

    /**
     * The meta object literal for the '{@link org.xtext.example.dirFile.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.dirFile.impl.FileImpl
     * @see org.xtext.example.dirFile.impl.DirFilePackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '{@link org.xtext.example.dirFile.impl.TYPE_DIR_FILEImpl <em>TYPE DIR FILE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.dirFile.impl.TYPE_DIR_FILEImpl
     * @see org.xtext.example.dirFile.impl.DirFilePackageImpl#getTYPE_DIR_FILE()
     * @generated
     */
    EClass TYPE_DIR_FILE = eINSTANCE.getTYPE_DIR_FILE();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DIR_FILE__NAME = eINSTANCE.getTYPE_DIR_FILE_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.dirFile.impl.FirstDirectoryImpl <em>First Directory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.dirFile.impl.FirstDirectoryImpl
     * @see org.xtext.example.dirFile.impl.DirFilePackageImpl#getFirstDirectory()
     * @generated
     */
    EClass FIRST_DIRECTORY = eINSTANCE.getFirstDirectory();

    /**
     * The meta object literal for the '<em><b>First Directory</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIRST_DIRECTORY__FIRST_DIRECTORY = eINSTANCE.getFirstDirectory_FirstDirectory();

  }

} //DirFilePackage