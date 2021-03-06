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
package com.amazonaws.services.lightsail.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum LoadBalancerMetricName {

    ClientTLSNegotiationErrorCount("ClientTLSNegotiationErrorCount"),
    HealthyHostCount("HealthyHostCount"),
    UnhealthyHostCount("UnhealthyHostCount"),
    HTTPCode_LB_4XX_Count("HTTPCode_LB_4XX_Count"),
    HTTPCode_LB_5XX_Count("HTTPCode_LB_5XX_Count"),
    HTTPCode_Instance_2XX_Count("HTTPCode_Instance_2XX_Count"),
    HTTPCode_Instance_3XX_Count("HTTPCode_Instance_3XX_Count"),
    HTTPCode_Instance_4XX_Count("HTTPCode_Instance_4XX_Count"),
    HTTPCode_Instance_5XX_Count("HTTPCode_Instance_5XX_Count"),
    InstanceResponseTime("InstanceResponseTime"),
    RejectedConnectionCount("RejectedConnectionCount"),
    RequestCount("RequestCount");

    private String value;

    private LoadBalancerMetricName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return LoadBalancerMetricName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static LoadBalancerMetricName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LoadBalancerMetricName enumEntry : LoadBalancerMetricName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
