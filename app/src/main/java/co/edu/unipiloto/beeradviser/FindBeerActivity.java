package co.edu.unipiloto.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;



public class FindBeerActivity extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //Called when the button gets clicked
    public void onClickFindBeer(View view){
        //Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Display the selected item
        brands.setText("Gottle of geer");
        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
    }
}
