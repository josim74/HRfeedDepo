package josim74.git.com.hrfeeddepo;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //---view declaration----
    private TextInputLayout textInputLayout_phone, textInputLayout_pass;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //---Initializing views----
        textInputLayout_phone = findViewById(R.id.et_login_email);
        textInputLayout_pass = findViewById(R.id.et_login_pasword);
        btnLogin = findViewById(R.id.btn_login);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(textInputLayout_phone.getEditText().getText().toString(), textInputLayout_pass.getEditText().getText().toString());
            }
        });

    }

    //----login validation methods declaration-----------
    public void validate(String phone, String pass){
        if(TextUtils.isEmpty(phone)){
            phoneEmpty();
        } else if (TextUtils.isEmpty(pass)) {
            passEmpty();
        }else if(phone.equals("123") && pass.equals("123")){
            loginSuccess();
        }else {
            phoneOrPassError();
        }
    }

    public void phoneEmpty() {
        textInputLayout_phone.getEditText().setError("Phone is empty");
    }

    public void passEmpty() {
        textInputLayout_pass.getEditText().setError("Password is empty");
    }

    public void loginSuccess() {
        Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(mainIntent);
    }


    public void phoneOrPassError() {
        Toast.makeText(LoginActivity.this, "Incorrect Phone number or Password", Toast.LENGTH_SHORT).show();
    }


    public void isAlreadyLoggedIn() {
        //----go to main activity-------


        //-----not logged in go to login activity-----
    }
}
