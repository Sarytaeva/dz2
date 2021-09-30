package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NUM(generateRandomAge(), -80);
        NUM (generateRandomAge(), 45);
        NUM(generateRandomAge(), 15);
        NUM( generateRandomAge(),3);
        NUM(generateRandomAge(), 30);


    } public static String NUM (int age, int temperature) {
        if ((age >20 && age <45) && ( temperature>-20 &&  temperature<30) ){
            System.out.println("1 можно идти гулять");

        } else if (( age <20) && ( temperature >0 && temperature <28)){
            System.out.println("2 можно идти гулять");
        }
        else if ((age >45) && ( temperature >-10 && temperature <25)){
            System.out.println("3 можно идти гулять");
        } else System.out.println("оставайтесь дома");


        return "возвращаемый результат" + age +"" + temperature;


    }
    public static int generateRandomAge( ){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }
}
