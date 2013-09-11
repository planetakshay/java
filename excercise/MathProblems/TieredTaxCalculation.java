package MathProblems;

import java.math.BigDecimal;


/*
 * Basically for different wage bases slots, customers are charged tax at a different rate.
 * write a function that will calculate how much tax they would be charged given wage basis
 * 
 * So for a wageBasis of 65000 -> first 10K are taxed at 1% next 20K [10K to 30K] are taxed at 3% and next 30K[30K to 60K] are taxed at 6% and anything above is taxed at 7%
 */
public class TieredTaxCalculation {
	
	public static void main (String args[]){
		
		System.out.println("Taxes on wageBasis= 30350.50 -> " + calculateTax(30350.50));
		System.out.println("Taxes on wageBasis= 3000.0 -> " + calculateTax(3000));
		System.out.println("Taxes on wageBasis= 100100 -> " + calculateTax(100100));
		System.out.println("Taxes on wageBasis= 20450000 -> " + calculateTax(20450000));
		System.out.println("Taxes on wageBasis= 48677.79 -> " + calculateTax(48677.79));
		System.out.println("Taxes on wageBasis= 0 -> " + calculateTax(0));
		System.out.println("Taxes on wageBasis= -0.0 -> " + calculateTax(-0.0));
		System.out.println("Taxes on wageBasis= -10.0 -> " + calculateTax(-10.0));
		
	}

	
	
	private static double calculateTax(double wageBasis) {
		// TODO Auto-generated method stub
		double wageTiers[] = new double[]{0.0,10000.0,30000.0,60000.0,100000000.0};
		double tax[] = new double[]{0,1.0,3.0,6.0,7.0};
		double taxesCalculatedOnWages = 0.0;
		double expectedTaxAmount= 0.0;
		
		for(int i=1;i<wageTiers.length;i++){
			double wagesToCalculateTaxesOn = 0.0;
			double limit =  wageTiers[i];
			double rate=tax[i]*.01;
			if(taxesCalculatedOnWages >=  wageBasis){
				break;
			}
			if(  wageBasis >= limit  && taxesCalculatedOnWages < (Double) wageBasis  ){
				wagesToCalculateTaxesOn = wageTiers[i]-wageTiers[i-1];
			}
			if(wageBasis <limit && taxesCalculatedOnWages< wageBasis){
				wagesToCalculateTaxesOn =(Double) wageBasis-taxesCalculatedOnWages;
			}
			expectedTaxAmount += rate*wagesToCalculateTaxesOn;
			taxesCalculatedOnWages += wagesToCalculateTaxesOn;	
		}
		
	    return BigDecimal.valueOf(expectedTaxAmount).setScale(3, BigDecimal.ROUND_UP).doubleValue();
		
	}
	
	
	
}
