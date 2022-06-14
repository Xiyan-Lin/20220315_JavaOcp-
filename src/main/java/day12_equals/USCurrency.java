
package day12_equals;

public enum USCurrency {
    // 美金的硬幣面額有: 
    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);
    private int value;
    
    private USCurrency(int value){
        System.out.println("USCurrency()");
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
}
