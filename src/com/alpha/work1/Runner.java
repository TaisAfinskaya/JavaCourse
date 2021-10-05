package com.alpha.work1;

public class Runner {
    public void run(){
//        Device device = new Device( "DF-34567N", "LG", 56.00);
//        System.out.println(device);
//
//        Monitor monitor = new Monitor("AB1234567CD", "Samsung", 120.0, 1280, 1024);
//        System.out.println(monitor);
//
//        EthernetAdapter netAdapter = new EthernetAdapter("AB1234567CD", "Samsung", 120.0, 100, "1024");
//        System.out.println(netAdapter);

        Device [] devices = {
                new Device( "DF-34567N", "LG", 56.00),
                new Monitor("AB1234567CD", "Samsung", 120.0, 1280, 1024),
                new EthernetAdapter("AB1234567CD", "Samsung", 120.0, 100, "1024"),
                new Device( "DF-34567", "DELL", 5600.00),
                new Monitor("AB1234567AQ", "Samsung", 1200.0, 1280, 1024),
                new EthernetAdapter("AB1234567CD123", "Samsung", 1250.0, 100, "1024"),
                new Device( "DF-34567N", "LG", 56.00)
        };
        for (Device element:
             devices) {
            System.out.println(element  + ";" + element.hashCode());
        }
        System.out.println(devices[0].equals(devices[6]));

    }
}
