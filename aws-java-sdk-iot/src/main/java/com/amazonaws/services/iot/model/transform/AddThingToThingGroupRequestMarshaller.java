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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AddThingToThingGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AddThingToThingGroupRequestMarshaller {

    private static final MarshallingInfo<String> THINGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingGroupName").build();
    private static final MarshallingInfo<String> THINGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingGroupArn").build();
    private static final MarshallingInfo<String> THINGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("thingName").build();
    private static final MarshallingInfo<String> THINGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("thingArn").build();

    private static final AddThingToThingGroupRequestMarshaller instance = new AddThingToThingGroupRequestMarshaller();

    public static AddThingToThingGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AddThingToThingGroupRequest addThingToThingGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (addThingToThingGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(addThingToThingGroupRequest.getThingGroupName(), THINGGROUPNAME_BINDING);
            protocolMarshaller.marshall(addThingToThingGroupRequest.getThingGroupArn(), THINGGROUPARN_BINDING);
            protocolMarshaller.marshall(addThingToThingGroupRequest.getThingName(), THINGNAME_BINDING);
            protocolMarshaller.marshall(addThingToThingGroupRequest.getThingArn(), THINGARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
