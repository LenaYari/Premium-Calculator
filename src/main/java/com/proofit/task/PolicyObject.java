package com.proofit.task;

import java.util.ArrayList;
import java.util.List;

public class PolicyObject {

    String objectName;
    List<PolicySubObject> policySubObjects = new ArrayList<>();

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public List<PolicySubObject> getPolicySubObjects() {
        return policySubObjects;
    }

    public void setPolicySubObjects(List<PolicySubObject> policySubObjects) {
        this.policySubObjects = policySubObjects;
    }
}
