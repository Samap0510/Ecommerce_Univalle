package com.app.ecommerce_univalle;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        Button login_btn = (Button) findViewById(R.id.login_btn);

        //admin and admin
        /*Accion cuando se da click en el botón LOGIN
         *Si el usuario y la contraseña es admin - admin va a mandar un mensaje diciendo login exitoso
         *Sino login fallido
         */
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    //Correcto
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL", LENGTH_SHORT).show();
                }else {
                    //Incorrecto
                    Toast.makeText(MainActivity.this, "LOGIN FAILED!!!", LENGTH_SHORT).show();
                }
            }
        });

    }
}