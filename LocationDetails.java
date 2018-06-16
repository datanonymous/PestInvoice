package ko.alex.pestinvoice;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LocationDetails extends AppCompatActivity {

    private Button saveLocationButton;

    private EditText locationName;
    private EditText locationAddress;
    private EditText locationPhoneNumber;
    private EditText locationEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // removed @Nullable Bundle savedInstanceState
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_details);

        locationName = findViewById(R.id.locationName);
        locationAddress = findViewById(R.id.locationAddress);
        locationPhoneNumber = findViewById(R.id.locationPhoneNumber);
        locationEmail = findViewById(R.id.locationEmail);
    }


    public void saveLocation(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("location_name",locationName.getText().toString());
        intent.putExtra("location_address",locationAddress.getText().toString());
        intent.putExtra("location_phoneNumber",locationPhoneNumber.getText().toString());
        intent.putExtra("location_email",locationEmail.getText().toString());
        startActivity(intent);
    }

} // End LocationDetails method
