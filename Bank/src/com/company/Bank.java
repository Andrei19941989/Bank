package com.company;//создаем сам класс банка

public class Bank {
    private BankSystem bs;
    public Bank(){
        bs=new BankSystem();
    }
    public  void openAccount(User u) throws Exception {
        bs.addAccount(new BankAccount(u,0));
    }
    public void upBalance(User u,double summa ) throws Exception {
        BankAccount b=bs.getAccount(u.numberAcccount);
        b.setBalance(b.getBalance()+summa);
    }

    public double getBalance(User u) throws BankSystemException {
         return bs.getAccount(u.numberAcccount).getBalance();
    }
    public void getTransferMoney(User u,User r,double summa) throws Exception {
        bs.makeTransfer(bs.getAccount(u.numberAcccount),bs.getAccount(r.numberAcccount),summa);
    }

}
