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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for Channel
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Channel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Channel implements Serializable, Cloneable, StructuredPojo {

    /** The unique arn of the channel. */
    private String arn;
    /**
     * A list of destinations of the channel. For UDP outputs, there is one destination per output. For other types
     * (HLS, for example), there is one destination per packager.
     */
    private java.util.List<OutputDestination> destinations;
    /** The endpoints where outgoing connections initiate from */
    private java.util.List<ChannelEgressEndpoint> egressEndpoints;

    private EncoderSettings encoderSettings;
    /** The unique id of the channel. */
    private String id;
    /** List of input attachments for channel. */
    private java.util.List<InputAttachment> inputAttachments;
    /** The name of the channel. (user-mutable) */
    private String name;
    /** The number of currently healthy pipelines. */
    private Integer pipelinesRunningCount;
    /** The Amazon Resource Name (ARN) of the role assumed when running the Channel. */
    private String roleArn;

    private String state;

    /**
     * The unique arn of the channel.
     * 
     * @param arn
     *        The unique arn of the channel.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The unique arn of the channel.
     * 
     * @return The unique arn of the channel.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The unique arn of the channel.
     * 
     * @param arn
     *        The unique arn of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one destination per output. For other types
     * (HLS, for example), there is one destination per packager.
     * 
     * @return A list of destinations of the channel. For UDP outputs, there is one destination per output. For other
     *         types (HLS, for example), there is one destination per packager.
     */

    public java.util.List<OutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one destination per output. For other types
     * (HLS, for example), there is one destination per packager.
     * 
     * @param destinations
     *        A list of destinations of the channel. For UDP outputs, there is one destination per output. For other
     *        types (HLS, for example), there is one destination per packager.
     */

    public void setDestinations(java.util.Collection<OutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<OutputDestination>(destinations);
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one destination per output. For other types
     * (HLS, for example), there is one destination per packager.
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of destinations of the channel. For UDP outputs, there is one destination per output. For other
     *        types (HLS, for example), there is one destination per packager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withDestinations(OutputDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<OutputDestination>(destinations.length));
        }
        for (OutputDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * A list of destinations of the channel. For UDP outputs, there is one destination per output. For other types
     * (HLS, for example), there is one destination per packager.
     * 
     * @param destinations
     *        A list of destinations of the channel. For UDP outputs, there is one destination per output. For other
     *        types (HLS, for example), there is one destination per packager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withDestinations(java.util.Collection<OutputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * The endpoints where outgoing connections initiate from
     * 
     * @return The endpoints where outgoing connections initiate from
     */

    public java.util.List<ChannelEgressEndpoint> getEgressEndpoints() {
        return egressEndpoints;
    }

    /**
     * The endpoints where outgoing connections initiate from
     * 
     * @param egressEndpoints
     *        The endpoints where outgoing connections initiate from
     */

    public void setEgressEndpoints(java.util.Collection<ChannelEgressEndpoint> egressEndpoints) {
        if (egressEndpoints == null) {
            this.egressEndpoints = null;
            return;
        }

        this.egressEndpoints = new java.util.ArrayList<ChannelEgressEndpoint>(egressEndpoints);
    }

    /**
     * The endpoints where outgoing connections initiate from
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEgressEndpoints(java.util.Collection)} or {@link #withEgressEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param egressEndpoints
     *        The endpoints where outgoing connections initiate from
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withEgressEndpoints(ChannelEgressEndpoint... egressEndpoints) {
        if (this.egressEndpoints == null) {
            setEgressEndpoints(new java.util.ArrayList<ChannelEgressEndpoint>(egressEndpoints.length));
        }
        for (ChannelEgressEndpoint ele : egressEndpoints) {
            this.egressEndpoints.add(ele);
        }
        return this;
    }

    /**
     * The endpoints where outgoing connections initiate from
     * 
     * @param egressEndpoints
     *        The endpoints where outgoing connections initiate from
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withEgressEndpoints(java.util.Collection<ChannelEgressEndpoint> egressEndpoints) {
        setEgressEndpoints(egressEndpoints);
        return this;
    }

    /**
     * @param encoderSettings
     */

    public void setEncoderSettings(EncoderSettings encoderSettings) {
        this.encoderSettings = encoderSettings;
    }

    /**
     * @return
     */

    public EncoderSettings getEncoderSettings() {
        return this.encoderSettings;
    }

    /**
     * @param encoderSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withEncoderSettings(EncoderSettings encoderSettings) {
        setEncoderSettings(encoderSettings);
        return this;
    }

    /**
     * The unique id of the channel.
     * 
     * @param id
     *        The unique id of the channel.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique id of the channel.
     * 
     * @return The unique id of the channel.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique id of the channel.
     * 
     * @param id
     *        The unique id of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withId(String id) {
        setId(id);
        return this;
    }

    /**
     * List of input attachments for channel.
     * 
     * @return List of input attachments for channel.
     */

    public java.util.List<InputAttachment> getInputAttachments() {
        return inputAttachments;
    }

    /**
     * List of input attachments for channel.
     * 
     * @param inputAttachments
     *        List of input attachments for channel.
     */

    public void setInputAttachments(java.util.Collection<InputAttachment> inputAttachments) {
        if (inputAttachments == null) {
            this.inputAttachments = null;
            return;
        }

        this.inputAttachments = new java.util.ArrayList<InputAttachment>(inputAttachments);
    }

    /**
     * List of input attachments for channel.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputAttachments(java.util.Collection)} or {@link #withInputAttachments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputAttachments
     *        List of input attachments for channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withInputAttachments(InputAttachment... inputAttachments) {
        if (this.inputAttachments == null) {
            setInputAttachments(new java.util.ArrayList<InputAttachment>(inputAttachments.length));
        }
        for (InputAttachment ele : inputAttachments) {
            this.inputAttachments.add(ele);
        }
        return this;
    }

    /**
     * List of input attachments for channel.
     * 
     * @param inputAttachments
     *        List of input attachments for channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withInputAttachments(java.util.Collection<InputAttachment> inputAttachments) {
        setInputAttachments(inputAttachments);
        return this;
    }

    /**
     * The name of the channel. (user-mutable)
     * 
     * @param name
     *        The name of the channel. (user-mutable)
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the channel. (user-mutable)
     * 
     * @return The name of the channel. (user-mutable)
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the channel. (user-mutable)
     * 
     * @param name
     *        The name of the channel. (user-mutable)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The number of currently healthy pipelines.
     * 
     * @param pipelinesRunningCount
     *        The number of currently healthy pipelines.
     */

    public void setPipelinesRunningCount(Integer pipelinesRunningCount) {
        this.pipelinesRunningCount = pipelinesRunningCount;
    }

    /**
     * The number of currently healthy pipelines.
     * 
     * @return The number of currently healthy pipelines.
     */

    public Integer getPipelinesRunningCount() {
        return this.pipelinesRunningCount;
    }

    /**
     * The number of currently healthy pipelines.
     * 
     * @param pipelinesRunningCount
     *        The number of currently healthy pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withPipelinesRunningCount(Integer pipelinesRunningCount) {
        setPipelinesRunningCount(pipelinesRunningCount);
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     * 
     * @return The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role assumed when running the Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param state
     * @see ChannelState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see ChannelState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelState
     */

    public Channel withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelState
     */

    public Channel withState(ChannelState state) {
        this.state = state.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getEgressEndpoints() != null)
            sb.append("EgressEndpoints: ").append(getEgressEndpoints()).append(",");
        if (getEncoderSettings() != null)
            sb.append("EncoderSettings: ").append(getEncoderSettings()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInputAttachments() != null)
            sb.append("InputAttachments: ").append(getInputAttachments()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPipelinesRunningCount() != null)
            sb.append("PipelinesRunningCount: ").append(getPipelinesRunningCount()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Channel == false)
            return false;
        Channel other = (Channel) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getEgressEndpoints() == null ^ this.getEgressEndpoints() == null)
            return false;
        if (other.getEgressEndpoints() != null && other.getEgressEndpoints().equals(this.getEgressEndpoints()) == false)
            return false;
        if (other.getEncoderSettings() == null ^ this.getEncoderSettings() == null)
            return false;
        if (other.getEncoderSettings() != null && other.getEncoderSettings().equals(this.getEncoderSettings()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInputAttachments() == null ^ this.getInputAttachments() == null)
            return false;
        if (other.getInputAttachments() != null && other.getInputAttachments().equals(this.getInputAttachments()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPipelinesRunningCount() == null ^ this.getPipelinesRunningCount() == null)
            return false;
        if (other.getPipelinesRunningCount() != null && other.getPipelinesRunningCount().equals(this.getPipelinesRunningCount()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getEgressEndpoints() == null) ? 0 : getEgressEndpoints().hashCode());
        hashCode = prime * hashCode + ((getEncoderSettings() == null) ? 0 : getEncoderSettings().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInputAttachments() == null) ? 0 : getInputAttachments().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPipelinesRunningCount() == null) ? 0 : getPipelinesRunningCount().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public Channel clone() {
        try {
            return (Channel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
