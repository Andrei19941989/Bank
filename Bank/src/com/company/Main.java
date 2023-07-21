package com.company;

public class Main {
    public static void main(String[] args) {
        try{
            User u=new User("Andrei","Orlov",28);
            User r=new User("Mark","Bobrov",32);
            Bank b =new Bank();
            b.openAccount(u);
            b.openAccount(r);
            b.upBalance(u,350000);
            System.out.println(b.getBalance(u));
            b.getTransferMoney(u,r,5000);
            System.out.println(b.getBalance(r));
            System.out.println(b.getBalance(u));

        }
         catch (UserException e){
            System.out.println(e.getMessage());
         } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
