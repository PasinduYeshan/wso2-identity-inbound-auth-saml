/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.saml.exception;

import org.wso2.carbon.identity.gateway.api.exception.GatewayRuntimeException;

/**
 * SAML2 SSO Inbound Authenticator Runtime Exception.
 */
public class SAML2SSORuntimeException extends GatewayRuntimeException {

    // Need to add getter for errorCode in IdentityRuntimeException
    private String errorCode;
    private String inResponseTo;
    private String acsUrl;

    public SAML2SSORuntimeException(String message) {
        super(message);
    }

    public SAML2SSORuntimeException(String errorCode, String message) {
        super(errorCode, message);
        this.errorCode = errorCode;
    }

    public SAML2SSORuntimeException(String errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getInResponseTo() {
        return this.inResponseTo;
    }

    public void setInResponseTo(String inResponseTo) {
        this.inResponseTo = inResponseTo;
    }

    public String getACSUrl() {
        return this.acsUrl;
    }

    public void setAcsUrl(String acsUrl) {
        this.acsUrl = acsUrl;
    }
}