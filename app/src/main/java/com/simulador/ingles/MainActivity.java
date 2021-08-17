package com.simulador.ingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private Button btnModulo1;
    private FirebaseAnalytics mFirebaseAnalytics;
    TextView name, email;
    Button logout;
    private ImageView profilePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // logout = findViewById(R.id.logoutButton);
        // name = findViewById(R.id.nameTV);
        //email = findViewById(R.id.emailTV);
        btnModulo1 = (Button)findViewById(R.id.btnModulo1);
        //profilePic = findViewById(R.id.profilePicUser);

        btnModulo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, modulo1.class);
                startActivity(intent);
            }
        });
        /*GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
        if(signInAccount != null){
            name.setText(signInAccount.getDisplayName());
            email.setText(signInAccount.getEmail());
            Glide.with(this).load(signInAccount.getPhotoUrl()).into(profilePic);
        }


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), login_first.class);
                startActivity(intent);
            }
        });*/
        //dfsdfsdf
    }
}




//por ahora crear el juego de escirbir el nombre del animal