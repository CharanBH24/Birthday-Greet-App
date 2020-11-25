package com.charanbhogaraju.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button=findViewById(R.id.GenerateButton)

    }

    fun createBirthdayCard(view: View) {
        val n=findViewById<EditText>(R.id.InputName)
        var name:String?=null
        name=n.editableText.toString()
        if(name!=null) {
            val intent = Intent(this, BirthdayGreetPage::class.java)
            intent.putExtra(BirthdayGreetPage.NAME_EXTRA, name)
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Please fill the name for the card",Toast.LENGTH_LONG).show()

        }

    }
}