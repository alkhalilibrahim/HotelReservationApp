package com.example.hotelroomreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UpdateStatus extends AppCompatActivity {
    TextView t1, t2, t3,t4,t5,t6,t7,t8,t9,t10;
    private FirebaseDatabase firebaseDatabase;
   DatabaseReference ref;
    String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_status);

        t1= (TextView) findViewById(R.id.t1);
        t2= (TextView) findViewById(R.id.t2);
        t3= (TextView) findViewById(R.id.t3);
        t4= (TextView) findViewById(R.id.t4);
        t5= (TextView) findViewById(R.id.t5);
        t6= (TextView) findViewById(R.id.t6);
        t7= (TextView) findViewById(R.id.t7);
        t8= (TextView) findViewById(R.id.t8);
        t9= (TextView) findViewById(R.id.t9);
        t10= (TextView) findViewById(R.id.t10);
        firebaseDatabase= FirebaseDatabase.getInstance();
         ref = FirebaseDatabase.getInstance().getReference("RoomsData");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                UserRooms userRooms=dataSnapshot.getValue(UserRooms.class);
                s1= userRooms.getRoom1();
                s2= userRooms.getRoom2();
                s3= userRooms.getRoom3();
                s4= userRooms.getRoom4();
                s5=userRooms.getRoom5();
                s6= userRooms.getRoom6();
                s7= userRooms.getRoom7();
                s8= userRooms.getRoom8();
                s9= userRooms.getRoom9();
                s10= userRooms.getRoom10();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(UpdateStatus.this, databaseError.getCode(), Toast.LENGTH_SHORT).show();
            }
        });


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s1.equals("reserve")) {
                    String r1 = "not-reserve";
                    UserRooms userRooms = new UserRooms(r1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room1 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    UserRooms userRooms = new UserRooms(r1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room1 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s2.equals("reserve")) {
                    String r1 = "not-reserve";
                    UserRooms userRooms = new UserRooms(s1, r1, s3, s4, s5, s6, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room2 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    UserRooms userRooms = new UserRooms(s1, r1, s3, s4, s5, s6, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room2 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }

            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s3.equals("reserve")) {
                    String r1 = "not-reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, r1, s4, s5, s6, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room3 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, r1, s4, s5, s6, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room3 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s4.equals("reserve")) {
                    String r1 = "not-reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, r1, s5, s6, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room4 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, r1, s5, s6, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room4 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s5.equals("reserve")) {
                    String r1 = "not-reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, r1, s6, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room5 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, r1, s6, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room5 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s6.equals("reserve")) {
                    String r1 = "not-reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, s5, r1, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room6 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, s5, r1, s7, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room6 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s7.equals("reserve")) {
                    String r1 = "not-reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, s5, s6, r1, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room7 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, s5, s6, r1, s8, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room7 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s8.equals("reserve")) {
                    String r1 = "not-reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, s5, s6, s7, r1, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room8 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, s5, s6, s7, r1, s9, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room8 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s9.equals("reserve")) {
                    String r1 = "not-reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, s5, s6, s7, s8, r1, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room9 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, s5, s6, s7, s8, r1, s10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room9 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s10.equals("reserve")) {
                    String r1 = "not-reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, s5, s6, s7, s8, s9, r1);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room10 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    UserRooms userRooms = new UserRooms(s1, s2, s3, s4, s5, s6, s7, s8, s9, r1);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateStatus.this, "Room10 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    @Override
    public void onBackPressed() {
        //Display alert message when back button has been pressed
        startActivity(new Intent(UpdateStatus.this, Options.class));
        finish();
    }

}