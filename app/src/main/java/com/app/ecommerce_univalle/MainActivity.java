package com.app.ecommerce_univalle;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView username;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);

        Button login_btn = (Button) findViewById(R.id.login_btn);

        //admin and admin
        /*Accion cuando se da click en el botón LOGIN
         *Si el usuario y la contraseña es admin - admin va a mandar un mensaje diciendo login exitoso
         *Sino login fallido

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
        */

    }

    public void changeActivity(View l){
        Intent ir = new Intent(this,MainMenu.class);
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")) {
            //Correcto
            Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL", LENGTH_SHORT).show();
            startActivity(ir);

        }else {
            //Incorrecto
            Toast.makeText(MainActivity.this, "LOGIN FAILED!!!", LENGTH_SHORT).show();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Debe diligenciar todos los campos")
                    .setPositiveButton(R.string.start, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getApplicationContext(),"Dio aceptar", Toast.LENGTH_LONG).show();
                        }
                    })
                    .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getApplicationContext(),"Dio cancelar", Toast.LENGTH_LONG).show();
                        }
                    });
            // Create the AlertDialog object and return it
            // Create the AlertDialog
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }
}