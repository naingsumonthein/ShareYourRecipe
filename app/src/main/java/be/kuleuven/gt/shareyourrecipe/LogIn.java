package be.kuleuven.gt.shareyourrecipe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogIn extends AppCompatActivity {
    private Button btnSignUp;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
    }

    ///action to happen when SignUp clicked
    public void onBtnSignUp_Clicked(View Caller){

    }

    ///action to happen when Submit clicked
    public void onBtnSubmit_Clicked(View Caller){

    }
}