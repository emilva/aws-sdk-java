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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an update to the <a>InputLambdaProcessor</a> that is used to preprocess the records in the stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/InputLambdaProcessorUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputLambdaProcessorUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>
     * function that is used to preprocess the records in the stream.
     * </p>
     */
    private String resourceARNUpdate;
    /**
     * <p>
     * The ARN of the new IAM role that is used to access the AWS Lambda function.
     * </p>
     */
    private String roleARNUpdate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>
     * function that is used to preprocess the records in the stream.
     * </p>
     * 
     * @param resourceARNUpdate
     *        The Amazon Resource Name (ARN) of the new <a href="https://aws.amazon.com/documentation/lambda/">AWS
     *        Lambda</a> function that is used to preprocess the records in the stream.
     */

    public void setResourceARNUpdate(String resourceARNUpdate) {
        this.resourceARNUpdate = resourceARNUpdate;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>
     * function that is used to preprocess the records in the stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new <a href="https://aws.amazon.com/documentation/lambda/">AWS
     *         Lambda</a> function that is used to preprocess the records in the stream.
     */

    public String getResourceARNUpdate() {
        return this.resourceARNUpdate;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>
     * function that is used to preprocess the records in the stream.
     * </p>
     * 
     * @param resourceARNUpdate
     *        The Amazon Resource Name (ARN) of the new <a href="https://aws.amazon.com/documentation/lambda/">AWS
     *        Lambda</a> function that is used to preprocess the records in the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputLambdaProcessorUpdate withResourceARNUpdate(String resourceARNUpdate) {
        setResourceARNUpdate(resourceARNUpdate);
        return this;
    }

    /**
     * <p>
     * The ARN of the new IAM role that is used to access the AWS Lambda function.
     * </p>
     * 
     * @param roleARNUpdate
     *        The ARN of the new IAM role that is used to access the AWS Lambda function.
     */

    public void setRoleARNUpdate(String roleARNUpdate) {
        this.roleARNUpdate = roleARNUpdate;
    }

    /**
     * <p>
     * The ARN of the new IAM role that is used to access the AWS Lambda function.
     * </p>
     * 
     * @return The ARN of the new IAM role that is used to access the AWS Lambda function.
     */

    public String getRoleARNUpdate() {
        return this.roleARNUpdate;
    }

    /**
     * <p>
     * The ARN of the new IAM role that is used to access the AWS Lambda function.
     * </p>
     * 
     * @param roleARNUpdate
     *        The ARN of the new IAM role that is used to access the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputLambdaProcessorUpdate withRoleARNUpdate(String roleARNUpdate) {
        setRoleARNUpdate(roleARNUpdate);
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
        if (getResourceARNUpdate() != null)
            sb.append("ResourceARNUpdate: ").append(getResourceARNUpdate()).append(",");
        if (getRoleARNUpdate() != null)
            sb.append("RoleARNUpdate: ").append(getRoleARNUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputLambdaProcessorUpdate == false)
            return false;
        InputLambdaProcessorUpdate other = (InputLambdaProcessorUpdate) obj;
        if (other.getResourceARNUpdate() == null ^ this.getResourceARNUpdate() == null)
            return false;
        if (other.getResourceARNUpdate() != null && other.getResourceARNUpdate().equals(this.getResourceARNUpdate()) == false)
            return false;
        if (other.getRoleARNUpdate() == null ^ this.getRoleARNUpdate() == null)
            return false;
        if (other.getRoleARNUpdate() != null && other.getRoleARNUpdate().equals(this.getRoleARNUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARNUpdate() == null) ? 0 : getResourceARNUpdate().hashCode());
        hashCode = prime * hashCode + ((getRoleARNUpdate() == null) ? 0 : getRoleARNUpdate().hashCode());
        return hashCode;
    }

    @Override
    public InputLambdaProcessorUpdate clone() {
        try {
            return (InputLambdaProcessorUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.InputLambdaProcessorUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
