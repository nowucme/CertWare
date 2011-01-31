/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.sco.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>sco</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScoTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ScoTests("sco Tests"); //$NON-NLS-1$
		suite.addTestSuite(ArtifactIdentifierTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoTests(String name) {
		super(name);
	}

} //ScoTests