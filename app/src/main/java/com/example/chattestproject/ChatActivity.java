package com.example.chattestproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Database 연결 Test
        FirebaseDatabase database = FirebaseDatabase.getInstance(); // 선언 및 할당
        DatabaseReference myRef = database.getReference("message"); // "message" 참조하여 할당(생성) : key

        myRef.setValue("Hello, World!"); // 데이터 생성 : value
// Database 연결 Test

        // 1. recyclerView - 반복 채팅
        // 1-1. recyclerView - chat data
        // 1-1-1, message, nickname, isMine(메세지 구분), (시간, 읽음 표시) - Data Transfer Object(DTO)


        // 2. DB 내용 넣기
        // 3. 상대방 폰에 채팅 내용이 보임



    } // onCreate

} // ChatActivity
