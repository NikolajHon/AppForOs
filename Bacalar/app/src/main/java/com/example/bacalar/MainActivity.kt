package com.example.bacalar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val usernameEditText = findViewById<EditText>(R.id.username)
        val emailEditText = findViewById<EditText>(R.id.email)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val registerButton = findViewById<Button>(R.id.register_button)
        val loginLink = findViewById<TextView>(R.id.login_link)

        registerButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, getString(R.string.please_fill_out_all_fields), Toast.LENGTH_SHORT).show()
            } else {
                // Implement your registration logic here (e.g., Firebase Authentication)
                Toast.makeText(this, getString(R.string.registration_successful), Toast.LENGTH_SHORT).show()
            }
        }

        loginLink.setOnClickListener {
            // Navigate to the login screen
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
