/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.ws.security.policy;


/**
 *
 * @author K.Venugopal@sun.com
 */
public interface Token{
    public static final String WSS11 = "WSS11";
    public static final String WSS10 = "WSS10";
    public static final String REQUIRE_KEY_IDENTIFIER_REFERENCE="RequireKeyIdentifierReference";
    public static final String REQUIRE_ISSUER_SERIAL_REFERENCE="RequireIssuerSerialReference";
    public static final String REQUIRE_EMBEDDED_TOKEN_REFERENCE="RequireEmbeddedTokenReference";
    public static final String REQUIRE_THUMBPRINT_REFERENCE="RequireThumbprintReference";
    public static final String REQUIRE_EXTERNAL_URI_REFERENCE = "RequireExternalUriReference";
    public static final String REQUIRE_EXTERNAL_REFERENCE = "RequireExternalReference";
    public static final String REQUIRE_INTERNAL_REFERENCE  = "RequireInternalReference";
    public static final String WSSX509V1TOKEN10 ="WssX509V1Token10";
    public static final String WSSX509V3TOKEN10="WssX509V3Token10";
    public static final String WSSX509PKCS7TOKEN10="WssX509Pkcs7Token10";
    public static final String WSSX509PKIPATHV1TOKEN10="WssX509PkiPathV1Token10";
    public static final String WSSX509V1TOKEN11="WssX509V1Token11";
    public static final String WSSX509V3TOKEN11="WssX509V3Token11";
    public static final String WSSX509PKCS7TOKEN11="WssX509Pkcs7Token11";
    public static final String WSSX509PKIPATHV1TOKEN11="WssX509PkiPathV1Token11";
    public static final String WSSKERBEROS_V5_AP_REQ_TOKEN11 = "WssKerberosV5ApReqToken11";
    public static final String WSSKERBEROS_GSS_V5_AP_REQ_TOKEN11="WssGssKerberosV5ApReqToken11";
    public static final String REQUIRE_DERIVED_KEYS="RequireDerivedKeys";
    public static final String SC10_SECURITYCONTEXT_TOKEN="SC10SecurityContextToken";
    public static final String WSS_SAML_V10_TOKEN10="WssSamlV10Token10";
    public static final String WSS_SAML_V11_TOKEN10="WssSamlV11Token10";
    public static final String WSS_SAML_V10_TOKEN11="WssSamlV10Token11";
    public static final String WSS_SAML_V11_TOKEN11="WssSamlV11Token11";
    public static final String WSS_SAML_V20_TOKEN11="WssSamlV20Token11";
    public static final String WSS_REL_V10_TOKEN10="WssRelV10Token10";
    public static final String WSS_REL_V20_TOKEN10="WssRelV20Token10";
    public static final String WSS_REL_V10_TOKEN11="WssRelV10Token11";
    public static final String WSS_REL_V20_TOKEN11="WssRelV20Token11";
    public static final String WSS_USERNAME_TOKEN_10 ="WssUsernameToken10";
    public static final String WSS_USERNAME_TOKEN_11 ="WssUsernameToken11";
    public static final String RSA_KEYVALUE_TOKEN = "RsaKeyValue";
    
    /**
     * returns the token inclusion value
     * @return one of <CODE>ONCE</CODE>,<CODE>NEVER</CODE>,<CODE>ALWAYS_TO_RECIPIENT</CODE>,<CODE>ALWAYS</CODE>
     */
    public String getIncludeToken();
    
    
    /**
     * Unique Id assigned to the token.
     * @return String representation of the token id.
     */
    public String getTokenId();
    
    /**
     * @return version of SecurityPolicy being used
     */
    public SecurityPolicyVersion getSecurityPolicyVersion();
}
