package com.proofit.task;

import java.math.BigDecimal;
import java.util.List;

public class PremiumCalculator {

    public BigDecimal calculate (Policy policy){

        BigDecimal sumInsuredFire = new BigDecimal(0);
        BigDecimal sumInsuredTheft = new BigDecimal(0);

        List<PolicyObject> policyObjects = policy.getPolicyObjects();
        for (PolicyObject policyObject : policyObjects)
        {
            List<PolicySubObject> policySubObjects = policyObject.getPolicySubObjects();
            for (PolicySubObject policySubObject : policySubObjects)
            {
                if(policySubObject.getSubObjectRiskType().equals(SubObjectRiskType.FIRE)){
                    sumInsuredFire = sumInsuredFire.add(policySubObject.getSumInsured());
                }
                if(policySubObject.getSubObjectRiskType().equals(SubObjectRiskType.THEFT)){
                    sumInsuredTheft = sumInsuredTheft.add(policySubObject.getSumInsured());
                }
            }
        }

        BigDecimal premium = calculatePremiumFire(sumInsuredFire).add(calculatePremiumTheft(sumInsuredTheft));

        // TODO: find out (ask a system analyst) what is the policy of rounding up (HALF_UP or HALF_DOWN)
        return premium.round(Utils.MATH_CONTEXT);
    };

    private BigDecimal calculatePremiumFire(BigDecimal sumInsuredFire){
        BigDecimal coefficientFire = new BigDecimal(0.014);
        if(sumInsuredFire.compareTo(new BigDecimal(100)) == 1){
            coefficientFire = new BigDecimal(0.024);
        }
        return sumInsuredFire.multiply(coefficientFire).round(Utils.MATH_CONTEXT);
    }

    private BigDecimal calculatePremiumTheft(BigDecimal sumInsureTheft){
        BigDecimal coefficientTheft = new BigDecimal(0.11);
        if(sumInsureTheft.compareTo(new BigDecimal(15)) == 0 ||
                sumInsureTheft.compareTo(new BigDecimal(15)) == 1){
            coefficientTheft = new BigDecimal(0.05);
        }
        return sumInsureTheft.multiply(coefficientTheft).round(Utils.MATH_CONTEXT);
    }
    
}
