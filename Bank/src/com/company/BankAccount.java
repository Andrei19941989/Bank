package com.company;//аккаунт дерожателя счета

public class BankAccount {
    private User owner;
    private double balance;
    public BankAccount(User owner,double balance) throws Exception {
        setOwner(owner);
        setBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }

    private void setOwner(User owner) throws Exception {
        if(owner !=null)
            this.owner=owner;
        else  throw new AccountException("invalid owner");

    }

    public void setBalance(double balance) throws Exception {
        if( balance >=0)
            this.balance=balance;
        else throw new AccountException("invalid balance");

    }


}


class AccountException extends Exception {
    public AccountException(String message) {
        super(message);
    }

}