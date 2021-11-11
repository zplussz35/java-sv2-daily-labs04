package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> values= new ArrayList<>();

    public Stock(List<Double> values){
        this.values.addAll(values);
    }


    public double maxProfit() {
        List<Double> maxProfits=new ArrayList<>();
        double maxProfit=0.0;
        for (int i = 1; i < values.size(); i++) {
            if(values.get(i-1)<values.get(i)){
                maxProfit+=values.get(i)-values.get(i-1);
                maxProfits.add(maxProfit);
            }
            else{
                maxProfit=0;
            }
        }
        double max=0.0;
        for (double d:maxProfits) {
            if(max<d){
                max=d;
            }
        }
        return max;
    }


        public static void main(String[] args) {
            Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
            System.out.println(stock.maxProfit());  //8.17

            Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
            System.out.println(stock2.maxProfit()); //6.0
        }

}
