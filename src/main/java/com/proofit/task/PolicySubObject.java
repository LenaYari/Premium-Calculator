package com.proofit.task;

import java.math.BigDecimal;

public class PolicySubObject {

    String subObjectName;
    BigDecimal sumInsured;
    SubObjectRiskType subObjectRiskType;

    public String getSubObjectName() {
        return subObjectName;
    }

    public void setSubObjectName(String subObjectName) {
        this.subObjectName = subObjectName;
    }

    public BigDecimal getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(BigDecimal sumInsured) {
        this.sumInsured = sumInsured;
    }

    public SubObjectRiskType getSubObjectRiskType() {
        return subObjectRiskType;
    }

    public void setSubObjectRiskType(SubObjectRiskType subObjectRiskType) {
        this.subObjectRiskType = subObjectRiskType;
    }
}
