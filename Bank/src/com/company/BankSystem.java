package com.company;//банковаская система внутри (недоступна пользователю напрямую)
import java.util.ArrayList;

public class BankSystem {
    private ArrayList<BankAccount> accounts;
    public BankSystem()
    {
        this.accounts= new ArrayList<>();
    }

    public BankAccount getAccount(int index) throws BankSystemException {
         if(index>=0 && index<accounts.size()){
             return accounts.get(index);
         }
         else
             throw new BankSystemException("нет такого аккаунта с таким индексом");
    }
    public void addAccount(BankAccount account)
    {
        accounts.add(account);
    }
    public void makeTransfer(BankAccount transfer, BankAccount transfer1, double summa) throws Exception {
        if(transfer.getBalance()-summa>=0){
            transfer.setBalance(transfer.getBalance()-summa);
            transfer1.setBalance(transfer.getBalance()+summa);
        }
        else
            throw new BankSystemException("не хватка баланса");

    }


    public void removeAccount(int index) throws Exception {
        if(index >=0 && index< accounts.size())
        {
            accounts.remove(index);
        }
        else
        {
            throw new BankSystemException("такого элемента не существует");
        }
    }


}
class BankSystemException extends Exception{
    public BankSystemException(String message){
        super(message);
    }
}

