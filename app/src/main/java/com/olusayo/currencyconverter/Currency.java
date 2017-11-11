package com.olusayo.currencyconverter;

/**
 * Created by OLUSAYO on 01-Nov-17.
 */

public class Currency {
    private String mBase;
    private String mCrypt;
    private String mEth;
    private String mCode;

    public Currency(String mBase, String mCrypt, String mEth) {
        this.mBase = mBase;
        this.mCrypt = mCrypt;
        this.mEth = mEth;

    }

    public Currency(String mBase, String mCrypt, String mEth, String moneyCode) {
        this.mBase = mBase;
        this.mCrypt = mCrypt;
        this.mEth = mEth;
        this.mCode = moneyCode;
    }

    public String getmBase() {
        return mBase;
    }

    public String getmCrypt() {
        return mCrypt;
    }

    public String getmEth() {
        return mEth;
    }

    //Get full money name from currency code
    public String getFullName(String moneyCode) {
        switch (moneyCode) {
            case "NGN":
                return "Nigerian Naira";
            case "USD":
                return "US Dollar";
            case "EUR":
                return "Euro";
            case "JPY":
                return "Yen";
            case "GBP":
                return "Pound Sterling";
            case "AUD":
                return "Australian Dollar";
            case "CAD":
                return "Canadian Dollar";
            case "CHF":
                return "Swiss Franc";
            case "CNY":
                return "Chinese Yuan";
            case "KES":
                return "Kenyan Shilling";
            case "GHS":
                return "Ghana Cedi";
            case "UGX":
                return "Ugandan Shilling";
            case "ZAR":
                return "South African Rand";
            case "XAF":
                return "CFA Franc BCEAO";
            case "NZD":
                return "New Zealand Dollar";
            case "MYR":
                return "Malaysian Ringgit";
            case "BND":
                return "Brunei Dollar";
            case "DZD":
                return "Algerian Dinar";
            case "RUB":
                return "Russian Ruble";
            case "INR":
                return "Indian Rupee";
            default:
                return "";
        }
    }
}
