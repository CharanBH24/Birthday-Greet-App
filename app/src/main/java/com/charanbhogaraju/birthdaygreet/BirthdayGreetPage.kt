package com.charanbhogaraju.birthdaygreet

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BirthdayGreetPage : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet_page)

        val name=intent.getStringExtra(NAME_EXTRA)
        val birthGreet=findViewById<TextView>(R.id.textView1)
        birthGreet.text="$name"


    }

}