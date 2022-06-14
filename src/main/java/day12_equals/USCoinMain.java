
package day12_equals;


public class USCoinMain {
    public static void main(String[] args) {
        USCurrency usCoin = USCurrency.NICKLE;
        System.out.println("得到" + usCoin.getValue() + "美分硬幣1枚");
        usCoin = USCurrency.valueOf("QUARTER"); 
        System.out.println("得到" + usCoin.getValue() + "美分硬幣1枚");
        for(USCurrency coin : USCurrency.values()){
            System.out.println(coin.getClass().getSimpleName());
            System.out.println(" : " + coin.getValue());
        }
    }
}
