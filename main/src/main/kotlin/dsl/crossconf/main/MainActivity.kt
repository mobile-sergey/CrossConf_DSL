package dsl.crossconf.main

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dsl.crossconf.shared.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            textView.text = Utils.getRandom()
        }
    }
}