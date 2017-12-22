/*Рынок. Существуют несколько продавцов, которые имеют определенное количество каждого из 4 товаров, у каждого продавца
* свои цены на товар. Покупатели каждый ход покупают у продавцов рандомное коилчество рандомного товара и продают его тому
* продавцу, у которого этот товар сейчас дороже. После каждой покупки, этот товар дорожает у этого продавца, и также
* дешевеет после его продажи.*/


package com.company;
import java.util.Random;


public class Main {
    Random random = new Random();
    int buynumber = 1 + random.nextInt(11 - 1);
    int numberofsellers = 4;

    public int seller(int stone, int wood, int iron, int food, double stonenumber, double woodnumber, double ironnumber, double foodnumber) {
        int gold = 0;

        return gold;
    }

    public int customer(int gold) {
        Random rndresource = new Random();
        int resource = 1 + rndresource.nextInt(4 - 1);


        for (int i = 0; i < numberofsellers; i++) {

        }

        return gold;
    }
    public static void main(String[] args) {

    }
}
