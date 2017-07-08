package com.john_pank.chapter19.task8;

import java.util.Random;

/**
 * Created by JohnPank on 15.05.17
 */

class Mail{
    enum GeneralDelivery {YES, NO1, NO2, NO3, NO4, NO5}
    enum Scannability {UNSCANNABLE, YES1, YES2, YES3, YES4}
    enum Readability {ILLEGIBLE, YES1, YES2, YES3, YES4}
    enum Address {INCORRECT, OK1, OK2, OK3, OK4, OK5, OK6}
    enum ReturnAddress {MISSING, OK1, OK2, OK3, OK4, OK5}

    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAddress;

    static long counter = 0;
    long id = counter++;

    public String toString(){
        return "Mail " + id;
    }

    public String details(){
        return toString() + "\nGeneralDelivery: " + generalDelivery + "\nScannability: " + scannability + "\nReadability: " + readability + "\nAddress: " + address + "\nReturnAddress: " + returnAddress;
    }

    //Generate random mail
    public static Mail randomMail(){
        Mail m = new Mail();
        m.generalDelivery = GeneralDelivery.values()[new Random().nextInt(GeneralDelivery.values().length)];
        m.scannability = Scannability.values()[new Random().nextInt(Scannability.values().length)];
        m.readability = Readability.values()[new Random().nextInt(Readability.values().length)];
        m.address = Address.values()[new Random().nextInt(Address.values().length)];
        m.returnAddress = ReturnAddress.values()[new Random().nextInt(ReturnAddress.values().length)];
        return m;
    }
}

public class PostOffice {
    enum MailHandler{
        GENERAL_DELIVERY{
            boolean handle(Mail m){
                switch (m.generalDelivery){
                    case YES:
                        System.out.println("Using general delivery for " + m);
                        return true;
                    default:
                        return false;
                }
            }
        },
        MACHINE_SCAN{
            boolean handle(Mail m){
                switch (m.scannability){
                    case UNSCANNABLE: return false;
                    default:
                        switch (m.address){
                            case INCORRECT:return false;
                            default:
                                System.out.println("Delivering " + m + " automatically");
                                return true;
                        }
                }
            }
        },
        VISUAL_INSPECTION{
            boolean handle(Mail m){
                switch (m.readability){
                    case ILLEGIBLE: return false;
                    default:
                        switch (m.address){
                            case INCORRECT: return false;
                            default:
                                System.out.println("Delivering " + m + " normally");
                                return true;
                        }
                }
            }
        },
        RETURN_TO_SENDER{
            boolean handle(Mail m){
                switch (m.returnAddress){
                    case MISSING: return false;
                    default:
                        System.out.println(m + " Return to sender");
                        return true;
                }
            }
        };
        abstract boolean handle(Mail m);
    }

    static void handle(Mail m){
        for (MailHandler handler : MailHandler.values())
            if(handler.handle(m))
                return;
        System.out.println(m + " is dead letter");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Mail m = Mail.randomMail();
            System.out.println(m.details());
            handle(m);
            System.out.println("*******");
        }
    }
}
