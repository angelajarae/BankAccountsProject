/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankproject;

import java.util.Date;

/**
 *
 * @author angela
 */
public abstract class Account {
    private String _number;
    private String _clientName;
    private double _balance;
    private Date _oppeningDate;
    
    public Account(String number,String clientName,double balance){
        _number=number;
        _clientName=clientName;
        _balance=balance;
        _oppeningDate=new Date();
    }
   
    public abstract boolean deposit();
    
    public abstract boolean withdraw();
    
    public abstract boolean calculateInterest();
  
    /**
     * @return the _number
     */
    public String getNumber() {
        return _number;
    }

    /**
     * @param _number the _number to set
     */
    public void setNumber(String _number) {
        this._number = _number;
    }

    /**
     * @return the _clientName
     */
    public String getClientName() {
        return _clientName;
    }

    /**
     * @param _clientName the _clientName to set
     */
    public void setClientName(String _clientName) {
        this._clientName = _clientName;
    }

    /**
     * @return the _balance
     */
    public double getBalance() {
        return _balance;
    }

    /**
     * @param _balance the _balance to set
     */
    public void setBalance(float _balance) {
        this._balance = _balance;
    }

    /**
     * @return the oppeningDate
     */
    public Date getOppeningDate() {
        return _oppeningDate;
    }

    /**
     * @param _oppeningDate the _oppeningDate to set
     */
    public void setOppeningDate(Date _oppeningDate) {
        this._oppeningDate = _oppeningDate;
    }
    
}
