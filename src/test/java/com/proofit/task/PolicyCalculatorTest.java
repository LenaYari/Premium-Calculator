package com.proofit.task;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PolicyCalculatorTest {

    @Test
    public void policyCalculatorTestCriteria1(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        Assertions.assertEquals(new BigDecimal(2.28).round(Utils.MATH_CONTEXT), premiumCalculator.calculate(getDataForTestCriteria1()));

    }

    @Test
    public void policyCalculatorTestCriteria2(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        Assertions.assertEquals(new BigDecimal(17.13).round(Utils.MATH_CONTEXT), premiumCalculator.calculate(getDataForTestCriteria2()));
    }

    @Test
    public void policyCalculatorTestMultiFire(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        Assertions.assertEquals(new BigDecimal(2.28).round(Utils.MATH_CONTEXT), premiumCalculator.calculate(getDataForTestMultiFire()));
    }

    @Test
    public void policyCalculatorTestMultiTheft(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        Assertions.assertEquals(new BigDecimal(2.28).round(Utils.MATH_CONTEXT), premiumCalculator.calculate(getDataForTestMultiTheft()));
    }

    @Test
    public void policyCalculatorTestMultiFireTheft(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        Assertions.assertEquals(new BigDecimal(17.13).round(Utils.MATH_CONTEXT), premiumCalculator.calculate(getDataForTestMultiFireTheft()));
    }

    private Policy getDataForTestCriteria1 () {

        PolicySubObject policySubObjectFire = new PolicySubObject();
        policySubObjectFire.setSubObjectRiskType(SubObjectRiskType.FIRE);
        policySubObjectFire.setSumInsured(new BigDecimal(100));

        PolicySubObject policySubObjectTheft = new PolicySubObject();
        policySubObjectTheft.setSubObjectRiskType(SubObjectRiskType.THEFT);
        policySubObjectTheft.setSumInsured(new BigDecimal(8));

        PolicyObject policyObject = new PolicyObject();
        List<PolicySubObject> subObjects = new ArrayList<>();
        subObjects.add(policySubObjectFire);
        subObjects.add(policySubObjectTheft);
        policyObject.setPolicySubObjects(subObjects);

        Policy policy = new Policy();
        List<PolicyObject> policyObjects = new ArrayList<>();
        policyObjects.add(policyObject);
        policy.setPolicyObjects(policyObjects);

        return policy;
    }

    private Policy getDataForTestCriteria2(){
        PolicySubObject policySubObjectFire = new PolicySubObject();
        policySubObjectFire.setSubObjectRiskType(SubObjectRiskType.FIRE);
        policySubObjectFire.setSumInsured(new BigDecimal(500));

        PolicySubObject policySubObjectTheft = new PolicySubObject();
        policySubObjectTheft.setSubObjectRiskType(SubObjectRiskType.THEFT);
        policySubObjectTheft.setSumInsured(new BigDecimal(102.51));

        PolicyObject policyObject = new PolicyObject();
        List<PolicySubObject> subObjects = new ArrayList<>();
        subObjects.add(policySubObjectFire);
        subObjects.add(policySubObjectTheft);
        policyObject.setPolicySubObjects(subObjects);

        Policy policy = new Policy();
        List<PolicyObject> policyObjects = new ArrayList<>();
        policyObjects.add(policyObject);
        policy.setPolicyObjects(policyObjects);

        return policy;
    }

    private Policy getDataForTestMultiFire () {

        PolicySubObject policySubObjectFire1 = new PolicySubObject();
        policySubObjectFire1.setSubObjectRiskType(SubObjectRiskType.FIRE);
        policySubObjectFire1.setSumInsured(new BigDecimal(30));

        PolicySubObject policySubObjectFire2 = new PolicySubObject();
        policySubObjectFire2.setSubObjectRiskType(SubObjectRiskType.FIRE);
        policySubObjectFire2.setSumInsured(new BigDecimal(70));

        PolicySubObject policySubObjectTheft = new PolicySubObject();
        policySubObjectTheft.setSubObjectRiskType(SubObjectRiskType.THEFT);
        policySubObjectTheft.setSumInsured(new BigDecimal(8));

        PolicyObject policyObject = new PolicyObject();
        List<PolicySubObject> subObjects = new ArrayList<>();
        subObjects.add(policySubObjectFire1);
        subObjects.add(policySubObjectFire2);
        subObjects.add(policySubObjectTheft);
        policyObject.setPolicySubObjects(subObjects);

        Policy policy = new Policy();
        List<PolicyObject> policyObjects = new ArrayList<>();
        policyObjects.add(policyObject);
        policy.setPolicyObjects(policyObjects);

        return policy;
    }

    private Policy getDataForTestMultiTheft () {

        PolicySubObject policySubObjectFire = new PolicySubObject();
        policySubObjectFire.setSubObjectRiskType(SubObjectRiskType.FIRE);
        policySubObjectFire.setSumInsured(new BigDecimal(100));

        PolicySubObject policySubObjectTheft1 = new PolicySubObject();
        policySubObjectTheft1.setSubObjectRiskType(SubObjectRiskType.THEFT);
        policySubObjectTheft1.setSumInsured(new BigDecimal(2));

        PolicySubObject policySubObjectTheft2 = new PolicySubObject();
        policySubObjectTheft2.setSubObjectRiskType(SubObjectRiskType.THEFT);
        policySubObjectTheft2.setSumInsured(new BigDecimal(6));

        PolicyObject policyObject = new PolicyObject();
        List<PolicySubObject> subObjects = new ArrayList<>();
        subObjects.add(policySubObjectFire);
        subObjects.add(policySubObjectTheft1);
        subObjects.add(policySubObjectTheft2);
        policyObject.setPolicySubObjects(subObjects);

        Policy policy = new Policy();
        List<PolicyObject> policyObjects = new ArrayList<>();
        policyObjects.add(policyObject);
        policy.setPolicyObjects(policyObjects);

        return policy;
    }

    private Policy getDataForTestMultiFireTheft(){

        PolicySubObject policySubObjectFire1 = new PolicySubObject();
        policySubObjectFire1.setSubObjectRiskType(SubObjectRiskType.FIRE);
        policySubObjectFire1.setSumInsured(new BigDecimal(50));

        PolicySubObject policySubObjectFire2 = new PolicySubObject();
        policySubObjectFire2.setSubObjectRiskType(SubObjectRiskType.FIRE);
        policySubObjectFire2.setSumInsured(new BigDecimal(450));

        PolicySubObject policySubObjectTheft1 = new PolicySubObject();
        policySubObjectTheft1.setSubObjectRiskType(SubObjectRiskType.THEFT);
        policySubObjectTheft1.setSumInsured(new BigDecimal(50));

        PolicySubObject policySubObjectTheft2 = new PolicySubObject();
        policySubObjectTheft2.setSubObjectRiskType(SubObjectRiskType.THEFT);
        policySubObjectTheft2.setSumInsured(new BigDecimal(52.51));

        PolicyObject policyObject = new PolicyObject();
        List<PolicySubObject> subObjects = new ArrayList<>();
        subObjects.add(policySubObjectFire1);
        subObjects.add(policySubObjectFire2);
        subObjects.add(policySubObjectTheft1);
        subObjects.add(policySubObjectTheft2);
        policyObject.setPolicySubObjects(subObjects);

        Policy policy = new Policy();
        List<PolicyObject> policyObjects = new ArrayList<>();
        policyObjects.add(policyObject);
        policy.setPolicyObjects(policyObjects);

        return policy;
    }
}
