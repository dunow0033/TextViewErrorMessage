package com.express.android.textviewerrormessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.express.android.textviewerrormessage.databinding.ActivityMainBinding
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //private var binding: ActivityMainBinding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        binding.button.setOnClickListener {
            val value = parseInt(binding.textBox.getText().toString())
            Log.d("value", value.toString())
            if(value < 100) {
                binding.topBorder.setVisibility(View.VISIBLE)
                binding.messageBox.setVisibility(View.VISIBLE)
                binding.bottomBorder.setVisibility(View.VISIBLE)
            }
        }
    }
}