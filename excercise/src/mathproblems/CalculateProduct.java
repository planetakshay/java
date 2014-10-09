package mathproblems;

public class CalculateProduct {


/**
Implement a function that returns the product of two numbers.  Don't use the * or / operators in the implementation.
see this?
Amazon - Phone 2014
**/
	


    public int multiply(Integer a,Integer b){
        if(a==null || b==null) return 0;
        if(a==0 || b==0) return 0;
        int product = 0;
        boolean isProductNegative = false;
        if((a<0 && b>0) || (a>0 && b<0)) {
            isProductNegative = true;
        }
        
        if(!isProductNegative)  {      
            for(int i=1;i<=b;i++){
                product = product + a;
            }
        }else{
             for(int i=1;i<=b;i++){
                product = product - a;
            }    
        }
        return product;
        
    }
    
    public static void main(String args[]){
        
    	CalculateProduct cp = new CalculateProduct();
        cp.multiply(0,0); // 0
        cp.multiply(-1,-1); // 1
        cp.multiply(-5,5); // -25
        cp.multiply(0,5); // 0
        cp.multiply(5,-5);// -25
        cp.multiply(null,null);// 0
        cp.multiply(null,0); // 0
        cp.multiply(0,null); //0
        cp.multiply(new Integer(2),3);// 6
        cp.multiply(34343434,343434343);// Boundry test for overflow
        cp.multiply(2,Integer.MAX_VALUE);//catch exception//test for errors 
        cp.multiply(Integer.MIN_VALUE, Integer.MAX_VALUE);//
        
    }


}
