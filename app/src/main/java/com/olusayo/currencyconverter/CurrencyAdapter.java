package com.olusayo.currencyconverter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by OLUSAYO on 01-Nov-17.
 */

public class CurrencyAdapter extends ArrayAdapter<Currency> {

    public CurrencyAdapter(@NonNull Context context, @NonNull ArrayList<Currency> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currencyView = convertView;
        if (currencyView == null) {
            currencyView = LayoutInflater.from(getContext()).inflate(R.layout.currency_list, parent, false);
        }
        Currency currency = getItem(position);
        TextView base = (TextView) currencyView.findViewById(R.id.baseCurrency);
        base.setText(currency.getmBase());
        TextView crypto = (TextView) currencyView.findViewById(R.id.crypto);
        crypto.setText(currency.getmCrypt());
        TextView eth = (TextView) currencyView.findViewById(R.id.eth);
        eth.setText(currency.getmEth());
        TextView fullCurrencyName = (TextView) currencyView.findViewById(R.id.full_currency);
        fullCurrencyName.setText(currency.getFullName(currency.getmBase()));

        return currencyView;
    }
}
