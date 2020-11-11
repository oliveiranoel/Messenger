package io.vsia.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    EditText messageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        messageView = findViewById(R.id.message);
    }

    public void onSendMessage(View view) {

        String msg = messageView.getText().toString();

        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra("message", msg);
        startActivity(intent);
    }
}
