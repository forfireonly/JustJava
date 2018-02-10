package com.example.anna.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static android.os.Build.ID;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    TextView quantityTextView;
    TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        priceTextView = (TextView) findViewById(R.id.price_text_view);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {
        int price1 = 5;
        quantity = quantity + 1;
        price1 = price1 * quantity;
        quantityTextView.setText(String.valueOf(quantity));
        priceTextView.setText(String.valueOf(NumberFormat.getCurrencyInstance().format(price1)));
    }

    public void decriment(View view) {
        int price1 = 5;
        quantity = quantity - 1;
        if (quantity <= 0) {
            quantity = 0;
        }

        price1 = price1 * quantity;
        quantityTextView.setText(String.valueOf(quantity));
        priceTextView.setText(String.valueOf(NumberFormat.getCurrencyInstance().format(price1)));
    }
}

    /**
     * This method displays the given quantity value on the screen.
     */
  /**  private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
   /* private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}*/

