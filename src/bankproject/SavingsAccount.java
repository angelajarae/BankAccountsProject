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
public class SavingsAccount extends Account{
    private int _monthPeriods;
    private Date _expirationDate=new Date(); 

    public SavingsAccount(String number, String clientName, double balance) {
        super(number, clientName, balance);
    }

    @Override
    public boolean deposit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean withdraw() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean calculateInterest() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the _monthPeriods
     */
    public int getMonthPeriods() {
        return _monthPeriods;
    }

    /**
     * @param _monthPeriods the _monthPeriods to set
     */
    public void setMonthPeriods(int _monthPeriods) {
        this._monthPeriods = _monthPeriods;
    }

    /**
     * @return the _expirationDate
     */
    public Date getExpirationDate() {
        return _expirationDate;
    }

    /**
     * @param _expirationDate the _expirationDate to set
     */
    public void setExpirationDate(Date _expirationDate) {
        this._expirationDate = _expirationDate;
    }
    
}
