/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdatePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains details about the updated policy, showing the requested changes.
     * </p>
     */
    private Policy policy;

    /**
     * <p>
     * A structure that contains details about the updated policy, showing the requested changes.
     * </p>
     * 
     * @param policy
     *        A structure that contains details about the updated policy, showing the requested changes.
     */

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A structure that contains details about the updated policy, showing the requested changes.
     * </p>
     * 
     * @return A structure that contains details about the updated policy, showing the requested changes.
     */

    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * A structure that contains details about the updated policy, showing the requested changes.
     * </p>
     * 
     * @param policy
     *        A structure that contains details about the updated policy, showing the requested changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePolicyResult withPolicy(Policy policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePolicyResult == false)
            return false;
        UpdatePolicyResult other = (UpdatePolicyResult) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePolicyResult clone() {
        try {
            return (UpdatePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
