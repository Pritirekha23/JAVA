package com.java.core;

class Bank{
    float getRateOfInterest()
    {
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest()
    {
        return 9.43f;
    }
}
class BOB extends Bank{
    float getRateOfInterest()
    {
        return 8.43f;
    }
}

class ICICI extends Bank{
    float getRateOfInterest()
    {
        return 7.43f;
    }
}

class Pol {
    public static void main(String[]args)
    {
        Bank b;
        b=new SBI();
        System.out.println("SBI bank rate of interest" +b.getRateOfInterest());
        
        b=new ICICI();
        System.out.println("ICICI bank rate of interest" +b.getRateOfInterest());

        b=new BOB();
        System.out.println("BOB bank rate of interest" +b.getRateOfInterest());
    }
}
